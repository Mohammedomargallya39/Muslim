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

public class quran_explanation_25_adapter extends RecyclerView.Adapter<quran_explanation_25_adapter.quranExplanation25Holder> {

    ArrayList<AlforqanEx> alforqanExes ;
    Context context ;

    public quran_explanation_25_adapter(ArrayList<AlforqanEx> alforqanExes, Context context) {
        this.alforqanExes = alforqanExes;
        this.context = context;
    }

    class quranExplanation25Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation25;
        LinearLayout linearLayout;

        public quranExplanation25Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation25 = itemView.findViewById(R.id.explanation25_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_25);
        }
    }

    @NonNull
    @Override
    public quranExplanation25Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_25_item, parent , false);
        return new quranExplanation25Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation25Holder holder, int position) {
        AlforqanEx alforqanEx = alforqanExes.get(position);
        holder.textViewExplanation25.setText(alforqanEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alforqanExes.size();
    }


}


