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

public class quran_explanation_56_adapter extends RecyclerView.Adapter<quran_explanation_56_adapter.quranExplanation56Holder> {

    ArrayList<AlwakeaEx> alwakeaExes ;
    Context context ;

    public quran_explanation_56_adapter(ArrayList<AlwakeaEx> alwakeaExes, Context context) {
        this.alwakeaExes = alwakeaExes;
        this.context = context;
    }

    class quranExplanation56Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation56;
        LinearLayout linearLayout;

        public quranExplanation56Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation56 = itemView.findViewById(R.id.explanation56_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_56);
        }
    }

    @NonNull
    @Override
    public quranExplanation56Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_56_item, parent , false);
        return new quranExplanation56Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation56Holder holder, int position) {
        AlwakeaEx alwakeaEx = alwakeaExes.get(position);
        holder.textViewExplanation56.setText(alwakeaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alwakeaExes.size();
    }


}


