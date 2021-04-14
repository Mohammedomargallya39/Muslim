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

public class quran_text_75_adapter extends RecyclerView.Adapter<quran_text_75_adapter.quranText75Holder> {

    ArrayList<Alqiama> alqiamas ;
    Context context ;

    public quran_text_75_adapter(ArrayList<Alqiama> alqiamas, Context context) {
        this.alqiamas = alqiamas;
        this.context = context;
    }

    class quranText75Holder extends RecyclerView.ViewHolder {
        TextView textViewText75;
        LinearLayout linearLayout;

        public quranText75Holder(@NonNull View itemView) {
            super(itemView);
            textViewText75 = itemView.findViewById(R.id.text75_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_75);
        }
    }

    @NonNull
    @Override
    public quranText75Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_75_item, parent , false);
        return new quranText75Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText75Holder holder, int position) {
        Alqiama alqiama = alqiamas.get(position);
        holder.textViewText75.setText(alqiama.getAyat());


    }

    @Override
    public int getItemCount() {
        return alqiamas.size();
    }


}


