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

public class quran_explanation_20_adapter extends RecyclerView.Adapter<quran_explanation_20_adapter.quranExplanation20Holder> {

    ArrayList<TahaEx> tahaExes ;
    Context context ;

    public quran_explanation_20_adapter(ArrayList<TahaEx> tahaExes, Context context) {
        this.tahaExes = tahaExes;
        this.context = context;
    }

    class quranExplanation20Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation20;
        LinearLayout linearLayout;

        public quranExplanation20Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation20 = itemView.findViewById(R.id.explanation20_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_20);
        }
    }

    @NonNull
    @Override
    public quranExplanation20Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_20_item, parent , false);
        return new quranExplanation20Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation20Holder holder, int position) {
        TahaEx tahaEx = tahaExes.get(position);
        holder.textViewExplanation20.setText(tahaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return tahaExes.size();
    }


}


