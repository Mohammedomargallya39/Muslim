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

public class quran_explanation_11_adapter extends RecyclerView.Adapter<quran_explanation_11_adapter.quranExplanation11Holder> {

    ArrayList<HoodEx> hoodExes ;
    Context context ;

    public quran_explanation_11_adapter(ArrayList<HoodEx> hoodExes, Context context) {
        this.hoodExes = hoodExes;
        this.context = context;
    }

    class quranExplanation11Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation11;
        LinearLayout linearLayout;

        public quranExplanation11Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation11 = itemView.findViewById(R.id.explanation11_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_11);
        }
    }

    @NonNull
    @Override
    public quranExplanation11Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_11_item, parent , false);
        return new quranExplanation11Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation11Holder holder, int position) {
        HoodEx hoodEx = hoodExes.get(position);
        holder.textViewExplanation11.setText(hoodEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return hoodExes.size();
    }


}


