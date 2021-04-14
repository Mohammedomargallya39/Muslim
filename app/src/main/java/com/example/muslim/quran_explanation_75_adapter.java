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

public class quran_explanation_75_adapter extends RecyclerView.Adapter<quran_explanation_75_adapter.quranExplanation75Holder> {

    ArrayList<AlqyamaEx> alqyamaExes ;
    Context context ;

    public quran_explanation_75_adapter(ArrayList<AlqyamaEx> alqyamaExes, Context context) {
        this.alqyamaExes = alqyamaExes;
        this.context = context;
    }

    class quranExplanation75Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation75;
        LinearLayout linearLayout;

        public quranExplanation75Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation75 = itemView.findViewById(R.id.explanation75_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_75);
        }
    }

    @NonNull
    @Override
    public quranExplanation75Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_75_item, parent , false);
        return new quranExplanation75Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation75Holder holder, int position) {
        AlqyamaEx alqyamaEx = alqyamaExes.get(position);
        holder.textViewExplanation75.setText(alqyamaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alqyamaExes.size();
    }


}


