package com.example.muslim;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class quran_text_60_adapter extends RecyclerView.Adapter<quran_text_60_adapter.quranText60Holder> {

    ArrayList<Almomtahana> almomtahanas ;
    Context context ;

    public quran_text_60_adapter(ArrayList<Almomtahana> almomtahanas, Context context) {
        this.almomtahanas = almomtahanas;
        this.context = context;
    }

    class quranText60Holder extends RecyclerView.ViewHolder {
        TextView textViewText60;
        LinearLayout linearLayout;

        public quranText60Holder(@NonNull View itemView) {
            super(itemView);
            textViewText60 = itemView.findViewById(R.id.text60_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_60);
        }
    }

    @NonNull
    @Override
    public quranText60Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_60_item, parent , false);
        return new quranText60Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText60Holder holder, int position) {
        Almomtahana almomtahana = almomtahanas.get(position);
        holder.textViewText60.setText(almomtahana.getAyat());


    }

    @Override
    public int getItemCount() {
        return almomtahanas.size();
    }


}


