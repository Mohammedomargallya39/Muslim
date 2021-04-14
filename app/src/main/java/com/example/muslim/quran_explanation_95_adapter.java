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

public class quran_explanation_95_adapter extends RecyclerView.Adapter<quran_explanation_95_adapter.quranExplanation95Holder> {

    ArrayList<AltenEx> altenExes ;
    Context context ;

    public quran_explanation_95_adapter(ArrayList<AltenEx> altenExes, Context context) {
        this.altenExes = altenExes;
        this.context = context;
    }

    class quranExplanation95Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation95;
        LinearLayout linearLayout;

        public quranExplanation95Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation95 = itemView.findViewById(R.id.explanation95_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_95);
        }
    }

    @NonNull
    @Override
    public quranExplanation95Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_95_item, parent , false);
        return new quranExplanation95Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation95Holder holder, int position) {
        AltenEx altenEx = altenExes.get(position);
        holder.textViewExplanation95.setText(altenEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return altenExes.size();
    }


}


