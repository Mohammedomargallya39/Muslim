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

public class quran_explanation_80_adapter extends RecyclerView.Adapter<quran_explanation_80_adapter.quranExplanation80Holder> {

    ArrayList<AbasaEx> abasaExes ;
    Context context ;

    public quran_explanation_80_adapter(ArrayList<AbasaEx> abasaExes, Context context) {
        this.abasaExes = abasaExes;
        this.context = context;
    }

    class quranExplanation80Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation80;
        LinearLayout linearLayout;

        public quranExplanation80Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation80 = itemView.findViewById(R.id.explanation80_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_80);
        }
    }

    @NonNull
    @Override
    public quranExplanation80Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_80_item, parent , false);
        return new quranExplanation80Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation80Holder holder, int position) {
        AbasaEx abasaEx = abasaExes.get(position);
        holder.textViewExplanation80.setText(abasaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return abasaExes.size();
    }


}


