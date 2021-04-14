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

public class quran_explanation_45_adapter extends RecyclerView.Adapter<quran_explanation_45_adapter.quranExplanation45Holder> {

    ArrayList<AlgathyaEx> algathyaExes ;
    Context context ;

    public quran_explanation_45_adapter(ArrayList<AlgathyaEx> algathyaExes, Context context) {
        this.algathyaExes = algathyaExes;
        this.context = context;
    }

    class quranExplanation45Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation45;
        LinearLayout linearLayout;

        public quranExplanation45Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation45 = itemView.findViewById(R.id.explanation45_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_45);
        }
    }

    @NonNull
    @Override
    public quranExplanation45Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_45_item, parent , false);
        return new quranExplanation45Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation45Holder holder, int position) {
        AlgathyaEx algathyaEx = algathyaExes.get(position);
        holder.textViewExplanation45.setText(algathyaEx.getAyat());
    }

    @Override
    public int getItemCount() {
        return algathyaExes.size();
    }


}


