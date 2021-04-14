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

public class quran_explanation_12_adapter extends RecyclerView.Adapter<quran_explanation_12_adapter.quranExplanation12Holder> {

    ArrayList<YoussefEx> youssefExes ;
    Context context ;

    public quran_explanation_12_adapter(ArrayList<YoussefEx> youssefExes, Context context) {
        this.youssefExes = youssefExes;
        this.context = context;
    }

    class quranExplanation12Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation12;
        LinearLayout linearLayout;

        public quranExplanation12Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation12 = itemView.findViewById(R.id.explanation12_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_12);
        }
    }

    @NonNull
    @Override
    public quranExplanation12Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_12_item, parent , false);
        return new quranExplanation12Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation12Holder holder, int position) {
        YoussefEx youssefEx = youssefExes.get(position);
        holder.textViewExplanation12.setText(youssefEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return youssefExes.size();
    }


}


