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

public class quran_text_21_adapter extends RecyclerView.Adapter<quran_text_21_adapter.quranText21Holder> {

    ArrayList<Alanbiaa> alanbiaas ;
    Context context ;

    public quran_text_21_adapter(ArrayList<Alanbiaa> alanbiaas, Context context) {
        this.alanbiaas = alanbiaas;
        this.context = context;
    }

    class quranText21Holder extends RecyclerView.ViewHolder {
        TextView textViewText21;
        LinearLayout linearLayout;

        public quranText21Holder(@NonNull View itemView) {
            super(itemView);
            textViewText21 = itemView.findViewById(R.id.text21_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_21);
        }
    }

    @NonNull
    @Override
    public quranText21Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_21_item, parent , false);
        return new quranText21Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText21Holder holder, int position) {
        Alanbiaa alanbiaa = alanbiaas.get(position);
        holder.textViewText21.setText(alanbiaa.getAyat());


    }

    @Override
    public int getItemCount() {
        return alanbiaas.size();
    }


}


