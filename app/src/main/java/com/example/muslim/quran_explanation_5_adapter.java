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

public class quran_explanation_5_adapter extends RecyclerView.Adapter<quran_explanation_5_adapter.quranExplanation5Holder> {

    ArrayList<AlmaedaEx> almaedaExes ;
    Context context ;

    public quran_explanation_5_adapter(ArrayList<AlmaedaEx> almaedaExes, Context context) {
        this.almaedaExes = almaedaExes;
        this.context = context;
    }

    class quranExplanation5Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation5;
        LinearLayout linearLayout;

        public quranExplanation5Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation5 = itemView.findViewById(R.id.explanation5_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_5);
        }
    }

    @NonNull
    @Override
    public quranExplanation5Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_5_item, parent , false);
        return new quranExplanation5Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation5Holder holder, int position) {
        AlmaedaEx almaedaExe = almaedaExes.get(position);
        holder.textViewExplanation5.setText(almaedaExe.getAyat());


    }

    @Override
    public int getItemCount() {
        return almaedaExes.size();
    }


}


