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

public class quran_explanation_76_adapter extends RecyclerView.Adapter<quran_explanation_76_adapter.quranExplanation76Holder> {

    ArrayList<AlensanEx> alensanExes ;
    Context context ;

    public quran_explanation_76_adapter(ArrayList<AlensanEx> alensanExes, Context context) {
        this.alensanExes = alensanExes;
        this.context = context;
    }

    class quranExplanation76Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation76;
        LinearLayout linearLayout;

        public quranExplanation76Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation76 = itemView.findViewById(R.id.explanation76_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_76);
        }
    }

    @NonNull
    @Override
    public quranExplanation76Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_76_item, parent , false);
        return new quranExplanation76Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation76Holder holder, int position) {
        AlensanEx alensanEx = alensanExes.get(position);
        holder.textViewExplanation76.setText(alensanEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alensanExes.size();
    }


}


