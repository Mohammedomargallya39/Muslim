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

public class quran_explanation_113_adapter extends RecyclerView.Adapter<quran_explanation_113_adapter.quranExplanation113Holder> {

    ArrayList<AlfalaqEx> alfalaqExes ;
    Context context ;

    public quran_explanation_113_adapter(ArrayList<AlfalaqEx> alfalaqExes, Context context) {
        this.alfalaqExes = alfalaqExes;
        this.context = context;
    }

    class quranExplanation113Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation113;
        LinearLayout linearLayout;

        public quranExplanation113Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation113 = itemView.findViewById(R.id.explanation113_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_113);
        }
    }

    @NonNull
    @Override
    public quranExplanation113Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_113_item, parent , false);
        return new quranExplanation113Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation113Holder holder, int position) {
        AlfalaqEx alfalaqEx = alfalaqExes.get(position);
        holder.textViewExplanation113.setText(alfalaqEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alfalaqExes.size();
    }


}


