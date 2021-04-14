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

public class quran_explanation_16_adapter extends RecyclerView.Adapter<quran_explanation_16_adapter.quranExplanation16Holder> {

    ArrayList<AlnahlEx> alnahlExes ;
    Context context ;

    public quran_explanation_16_adapter(ArrayList<AlnahlEx> alnahlExes, Context context) {
        this.alnahlExes = alnahlExes;
        this.context = context;
    }

    class quranExplanation16Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation16;
        LinearLayout linearLayout;

        public quranExplanation16Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation16 = itemView.findViewById(R.id.explanation16_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_16);
        }
    }

    @NonNull
    @Override
    public quranExplanation16Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_16_item, parent , false);
        return new quranExplanation16Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation16Holder holder, int position) {
        AlnahlEx alnahlEx = alnahlExes.get(position);
        holder.textViewExplanation16.setText(alnahlEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnahlExes.size();
    }


}


