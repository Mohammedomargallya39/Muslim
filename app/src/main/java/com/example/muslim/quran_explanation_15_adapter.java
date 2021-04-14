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

public class quran_explanation_15_adapter extends RecyclerView.Adapter<quran_explanation_15_adapter.quranExplanation15Holder> {

    ArrayList<AlhagrEx> alhagrExes ;
    Context context ;

    public quran_explanation_15_adapter(ArrayList<AlhagrEx> alhagrExes, Context context) {
        this.alhagrExes = alhagrExes;
        this.context = context;
    }

    class quranExplanation15Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation15;
        LinearLayout linearLayout;

        public quranExplanation15Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation15 = itemView.findViewById(R.id.explanation15_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_15);
        }
    }

    @NonNull
    @Override
    public quranExplanation15Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_15_item, parent , false);
        return new quranExplanation15Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation15Holder holder, int position) {
        AlhagrEx alhagrEx = alhagrExes.get(position);
        holder.textViewExplanation15.setText(alhagrEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alhagrExes.size();
    }


}


