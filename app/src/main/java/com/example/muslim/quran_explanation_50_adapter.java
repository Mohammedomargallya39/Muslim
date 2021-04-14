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

public class quran_explanation_50_adapter extends RecyclerView.Adapter<quran_explanation_50_adapter.quranExplanation50Holder> {

    ArrayList<QafEx> qafExes ;
    Context context ;

    public quran_explanation_50_adapter(ArrayList<QafEx> qafExes, Context context) {
        this.qafExes = qafExes;
        this.context = context;
    }

    class quranExplanation50Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation50;
        LinearLayout linearLayout;

        public quranExplanation50Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation50 = itemView.findViewById(R.id.explanation50_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_50);
        }
    }

    @NonNull
    @Override
    public quranExplanation50Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_50_item, parent , false);
        return new quranExplanation50Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation50Holder holder, int position) {
        QafEx qafEx = qafExes.get(position);
        holder.textViewExplanation50.setText(qafEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return qafExes.size();
    }


}


