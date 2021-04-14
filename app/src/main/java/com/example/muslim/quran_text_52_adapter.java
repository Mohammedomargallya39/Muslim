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

public class quran_text_52_adapter extends RecyclerView.Adapter<quran_text_52_adapter.quranText52Holder> {

    ArrayList<Altor> altors ;
    Context context ;

    public quran_text_52_adapter(ArrayList<Altor> altors, Context context) {
        this.altors = altors;
        this.context = context;
    }

    class quranText52Holder extends RecyclerView.ViewHolder {
        TextView textViewText52;
        LinearLayout linearLayout;

        public quranText52Holder(@NonNull View itemView) {
            super(itemView);
            textViewText52 = itemView.findViewById(R.id.text52_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_52);
        }
    }

    @NonNull
    @Override
    public quranText52Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_52_item, parent , false);
        return new quranText52Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText52Holder holder, int position) {
        Altor altor = altors.get(position);
        holder.textViewText52.setText(altor.getAyat());


    }

    @Override
    public int getItemCount() {
        return altors.size();
    }


}


