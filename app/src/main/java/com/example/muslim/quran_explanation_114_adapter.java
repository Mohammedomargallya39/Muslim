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

public class quran_explanation_114_adapter extends RecyclerView.Adapter<quran_explanation_114_adapter.quranExplanation114Holder> {

    ArrayList<AlnasEx> alnasExes ;
    Context context ;

    public quran_explanation_114_adapter(ArrayList<AlnasEx> alnasExes, Context context) {
        this.alnasExes = alnasExes;
        this.context = context;
    }

    class quranExplanation114Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation114;
        LinearLayout linearLayout;

        public quranExplanation114Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation114 = itemView.findViewById(R.id.explanation114_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_114);
        }
    }

    @NonNull
    @Override
    public quranExplanation114Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_114_item, parent , false);
        return new quranExplanation114Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation114Holder holder, int position) {
        AlnasEx alnasEx = alnasExes.get(position);
        holder.textViewExplanation114.setText(alnasEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnasExes.size();
    }


}


