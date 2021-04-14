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

public class quran_explanation_13_adapter extends RecyclerView.Adapter<quran_explanation_13_adapter.quranExplanation13Holder> {

    ArrayList<AlraadEx> alraadExes ;
    Context context ;

    public quran_explanation_13_adapter(ArrayList<AlraadEx> alraadExes, Context context) {
        this.alraadExes = alraadExes;
        this.context = context;
    }

    class quranExplanation13Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation13;
        LinearLayout linearLayout;

        public quranExplanation13Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation13 = itemView.findViewById(R.id.explanation13_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_13);
        }
    }

    @NonNull
    @Override
    public quranExplanation13Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_13_item, parent , false);
        return new quranExplanation13Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation13Holder holder, int position) {
        AlraadEx AlraadEx = alraadExes.get(position);
        holder.textViewExplanation13.setText(AlraadEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alraadExes.size();
    }


}


