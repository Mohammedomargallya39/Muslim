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

public class quran_explanation_82_adapter extends RecyclerView.Adapter<quran_explanation_82_adapter.quranExplanation82Holder> {

    ArrayList<AlenfetarEx> alenfetarExes ;
    Context context ;

    public quran_explanation_82_adapter(ArrayList<AlenfetarEx> alenfetarExes, Context context) {
        this.alenfetarExes = alenfetarExes;
        this.context = context;
    }

    class quranExplanation82Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation82;
        LinearLayout linearLayout;

        public quranExplanation82Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation82 = itemView.findViewById(R.id.explanation82_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_82);
        }
    }

    @NonNull
    @Override
    public quranExplanation82Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_82_item, parent , false);
        return new quranExplanation82Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation82Holder holder, int position) {
        AlenfetarEx alenfetarEx = alenfetarExes.get(position);
        holder.textViewExplanation82.setText(alenfetarEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alenfetarExes.size();
    }


}


