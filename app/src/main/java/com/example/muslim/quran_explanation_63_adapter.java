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

public class quran_explanation_63_adapter extends RecyclerView.Adapter<quran_explanation_63_adapter.quranExplanation63Holder> {

    ArrayList<AlmonafeqonEx> almonafeqonExes ;
    Context context ;

    public quran_explanation_63_adapter(ArrayList<AlmonafeqonEx> almonafeqonExes, Context context) {
        this.almonafeqonExes = almonafeqonExes;
        this.context = context;
    }

    class quranExplanation63Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation63;
        LinearLayout linearLayout;

        public quranExplanation63Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation63 = itemView.findViewById(R.id.explanation63_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_63);
        }
    }

    @NonNull
    @Override
    public quranExplanation63Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_63_item, parent , false);
        return new quranExplanation63Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation63Holder holder, int position) {
        AlmonafeqonEx almonafeqonEx = almonafeqonExes.get(position);
        holder.textViewExplanation63.setText(almonafeqonEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return almonafeqonExes.size();
    }


}


