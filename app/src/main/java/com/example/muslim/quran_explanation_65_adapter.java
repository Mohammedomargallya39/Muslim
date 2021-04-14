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

public class quran_explanation_65_adapter extends RecyclerView.Adapter<quran_explanation_65_adapter.quranExplanation65Holder> {

    ArrayList<AltalaqEx> altalaqExes ;
    Context context ;

    public quran_explanation_65_adapter(ArrayList<AltalaqEx> altalaqExes, Context context) {
        this.altalaqExes = altalaqExes;
        this.context = context;
    }

    class quranExplanation65Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation65;
        LinearLayout linearLayout;

        public quranExplanation65Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation65 = itemView.findViewById(R.id.explanation65_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_65);
        }
    }

    @NonNull
    @Override
    public quranExplanation65Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_65_item, parent , false);
        return new quranExplanation65Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation65Holder holder, int position) {
        AltalaqEx altalaqEx = altalaqExes.get(position);
        holder.textViewExplanation65.setText(altalaqEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return altalaqExes.size();
    }


}


