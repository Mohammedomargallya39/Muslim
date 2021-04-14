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

public class quran_explanation_62_adapter extends RecyclerView.Adapter<quran_explanation_62_adapter.quranExplanation62Holder> {

    ArrayList<AlgomaaEx> algomaaExes ;
    Context context ;

    public quran_explanation_62_adapter(ArrayList<AlgomaaEx> algomaaExes, Context context) {
        this.algomaaExes = algomaaExes;
        this.context = context;
    }

    class quranExplanation62Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation62;
        LinearLayout linearLayout;

        public quranExplanation62Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation62 = itemView.findViewById(R.id.explanation62_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_62);
        }
    }

    @NonNull
    @Override
    public quranExplanation62Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_62_item, parent , false);
        return new quranExplanation62Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation62Holder holder, int position) {
        AlgomaaEx algomaaEx = algomaaExes.get(position);
        holder.textViewExplanation62.setText(algomaaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return algomaaExes.size();
    }


}


