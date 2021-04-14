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

public class quran_explanation_43_adapter extends RecyclerView.Adapter<quran_explanation_43_adapter.quranExplanation43Holder> {

    ArrayList<AlzokhrofEx> alzokhrofExes ;
    Context context ;

    public quran_explanation_43_adapter(ArrayList<AlzokhrofEx> alzokhrofExes, Context context) {
        this.alzokhrofExes = alzokhrofExes;
        this.context = context;
    }

    class quranExplanation43Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation43;
        LinearLayout linearLayout;

        public quranExplanation43Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation43 = itemView.findViewById(R.id.explanation43_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_43);
        }
    }

    @NonNull
    @Override
    public quranExplanation43Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_43_item, parent , false);
        return new quranExplanation43Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation43Holder holder, int position) {
        AlzokhrofEx alzokhrofEx = alzokhrofExes.get(position);
        holder.textViewExplanation43.setText(alzokhrofEx.getAyat());
    }

    @Override
    public int getItemCount() {
        return alzokhrofExes.size();
    }


}


