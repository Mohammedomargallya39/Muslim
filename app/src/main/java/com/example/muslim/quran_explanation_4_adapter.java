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

public class quran_explanation_4_adapter extends RecyclerView.Adapter<quran_explanation_4_adapter.quranExplanation4Holder> {

    ArrayList<AlnesaaEx> alnesaaExes ;
    Context context ;

    public quran_explanation_4_adapter(ArrayList<AlnesaaEx> alnesaaExes, Context context) {
        this.alnesaaExes = alnesaaExes;
        this.context = context;
    }

    class quranExplanation4Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation4;
        LinearLayout linearLayout;

        public quranExplanation4Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation4 = itemView.findViewById(R.id.explanation4_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_4);
        }
    }

    @NonNull
    @Override
    public quranExplanation4Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_4_item, parent , false);
        return new quranExplanation4Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation4Holder holder, int position) {
        AlnesaaEx alnesaaExe = alnesaaExes.get(position);
        holder.textViewExplanation4.setText(alnesaaExe.getAyat());
  }

    @Override
    public int getItemCount() {
        return alnesaaExes.size();
    }


}


