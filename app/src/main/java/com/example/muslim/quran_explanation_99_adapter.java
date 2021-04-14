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

public class quran_explanation_99_adapter extends RecyclerView.Adapter<quran_explanation_99_adapter.quranExplanation99Holder> {

    ArrayList<AlzalzalahEx> alzalzalahExes ;
    Context context ;

    public quran_explanation_99_adapter(ArrayList<AlzalzalahEx> alzalzalahExes, Context context) {
        this.alzalzalahExes = alzalzalahExes;
        this.context = context;
    }

    class quranExplanation99Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation99;
        LinearLayout linearLayout;

        public quranExplanation99Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation99 = itemView.findViewById(R.id.explanation99_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_99);
        }
    }

    @NonNull
    @Override
    public quranExplanation99Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_99_item, parent , false);
        return new quranExplanation99Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation99Holder holder, int position) {
        AlzalzalahEx alzalzalahEx = alzalzalahExes.get(position);
        holder.textViewExplanation99.setText(alzalzalahEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alzalzalahExes.size();
    }


}


