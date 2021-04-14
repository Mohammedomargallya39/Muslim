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

public class quran_explanation_96_adapter extends RecyclerView.Adapter<quran_explanation_96_adapter.quranExplanation96Holder> {

    ArrayList<AlalaqEx> alalaqExes ;
    Context context ;

    public quran_explanation_96_adapter(ArrayList<AlalaqEx> alalaqExes, Context context) {
        this.alalaqExes = alalaqExes;
        this.context = context;
    }

    class quranExplanation96Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation96;
        LinearLayout linearLayout;

        public quranExplanation96Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation96 = itemView.findViewById(R.id.explanation96_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_96);
        }
    }

    @NonNull
    @Override
    public quranExplanation96Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_96_item, parent , false);
        return new quranExplanation96Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation96Holder holder, int position) {
        AlalaqEx alalaqEx = alalaqExes.get(position);
        holder.textViewExplanation96.setText(alalaqEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alalaqExes.size();
    }


}


