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

public class quran_explanation_84_adapter extends RecyclerView.Adapter<quran_explanation_84_adapter.quranExplanation84Holder> {

    ArrayList<AlenshqaqEx> alenshqaqExes ;
    Context context ;

    public quran_explanation_84_adapter(ArrayList<AlenshqaqEx> alenshqaqExes, Context context) {
        this.alenshqaqExes = alenshqaqExes;
        this.context = context;
    }

    class quranExplanation84Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation84;
        LinearLayout linearLayout;

        public quranExplanation84Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation84 = itemView.findViewById(R.id.explanation84_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_84);
        }
    }

    @NonNull
    @Override
    public quranExplanation84Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_84_item, parent , false);
        return new quranExplanation84Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation84Holder holder, int position) {
        AlenshqaqEx alenshqaqEx = alenshqaqExes.get(position);
        holder.textViewExplanation84.setText(alenshqaqEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alenshqaqExes.size();
    }


}


