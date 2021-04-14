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

public class quran_explanation_98_adapter extends RecyclerView.Adapter<quran_explanation_98_adapter.quranExplanation98Holder> {

    ArrayList<AlbaienahEx> albaienahExes ;
    Context context ;

    public quran_explanation_98_adapter(ArrayList<AlbaienahEx> albaienahExes, Context context) {
        this.albaienahExes = albaienahExes;
        this.context = context;
    }

    class quranExplanation98Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation98;
        LinearLayout linearLayout;

        public quranExplanation98Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation98 = itemView.findViewById(R.id.explanation98_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_98);
        }
    }

    @NonNull
    @Override
    public quranExplanation98Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_98_item, parent , false);
        return new quranExplanation98Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation98Holder holder, int position) {
        AlbaienahEx albaienahEx = albaienahExes.get(position);
        holder.textViewExplanation98.setText(albaienahEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return albaienahExes.size();
    }


}


