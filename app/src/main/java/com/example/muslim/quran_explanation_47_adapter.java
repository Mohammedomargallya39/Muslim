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

public class quran_explanation_47_adapter extends RecyclerView.Adapter<quran_explanation_47_adapter.quranExplanation47Holder> {

    ArrayList<MohammedEx> mohammedExes ;
    Context context ;

    public quran_explanation_47_adapter(ArrayList<MohammedEx> mohammedExes, Context context) {
        this.mohammedExes = mohammedExes;
        this.context = context;
    }

    class quranExplanation47Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation47;
        LinearLayout linearLayout;

        public quranExplanation47Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation47 = itemView.findViewById(R.id.explanation47_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_47);
        }
    }

    @NonNull
    @Override
    public quranExplanation47Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_47_item, parent , false);
        return new quranExplanation47Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation47Holder holder, int position) {
        MohammedEx mohammedEx = mohammedExes.get(position);
        holder.textViewExplanation47.setText(mohammedEx.getAyat());
    }

    @Override
    public int getItemCount() {
        return mohammedExes.size();
    }


}


