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

public class quran_explanation_108_adapter extends RecyclerView.Adapter<quran_explanation_108_adapter.quranExplanation108Holder> {

    ArrayList<AlkautharEx> alkautharExes ;
    Context context ;

    public quran_explanation_108_adapter(ArrayList<AlkautharEx> alkautharExes, Context context) {
        this.alkautharExes = alkautharExes;
        this.context = context;
    }

    class quranExplanation108Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation108;
        LinearLayout linearLayout;

        public quranExplanation108Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation108 = itemView.findViewById(R.id.explanation108_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_108);
        }
    }

    @NonNull
    @Override
    public quranExplanation108Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_108_item, parent , false);
        return new quranExplanation108Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation108Holder holder, int position) {
        AlkautharEx alkautharEx = alkautharExes.get(position);
        holder.textViewExplanation108.setText(alkautharEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alkautharExes.size();
    }


}


