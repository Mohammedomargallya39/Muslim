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

public class quran_text_23_adapter extends RecyclerView.Adapter<quran_text_23_adapter.quranText23Holder> {

    ArrayList<Almomenon> almomenons ;
    Context context ;

    public quran_text_23_adapter(ArrayList<Almomenon> almomenons, Context context) {
        this.almomenons = almomenons;
        this.context = context;
    }

    class quranText23Holder extends RecyclerView.ViewHolder {
        TextView textViewText23;
        LinearLayout linearLayout;

        public quranText23Holder(@NonNull View itemView) {
            super(itemView);
            textViewText23 = itemView.findViewById(R.id.text23_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_23);
        }
    }

    @NonNull
    @Override
    public quranText23Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_23_item, parent , false);
        return new quranText23Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText23Holder holder, int position) {
        Almomenon almomenon = almomenons.get(position);
        holder.textViewText23.setText(almomenon.getAyat());


    }

    @Override
    public int getItemCount() {
        return almomenons.size();
    }


}


