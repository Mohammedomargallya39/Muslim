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

public class quran_explanation_104_adapter extends RecyclerView.Adapter<quran_explanation_104_adapter.quranExplanation104Holder> {

    ArrayList<AlhomazaEx> alhomazaExes ;
    Context context ;

    public quran_explanation_104_adapter(ArrayList<AlhomazaEx> alhomazaExes, Context context) {
        this.alhomazaExes = alhomazaExes;
        this.context = context;
    }

    class quranExplanation104Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation104;
        LinearLayout linearLayout;

        public quranExplanation104Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation104 = itemView.findViewById(R.id.explanation104_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_104);
        }
    }

    @NonNull
    @Override
    public quranExplanation104Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_104_item, parent , false);
        return new quranExplanation104Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation104Holder holder, int position) {
        AlhomazaEx alhomazaEx = alhomazaExes.get(position);
        holder.textViewExplanation104.setText(alhomazaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alhomazaExes.size();
    }


}


