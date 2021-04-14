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

public class quran_explanation_34_adapter extends RecyclerView.Adapter<quran_explanation_34_adapter.quranExplanation34Holder> {

    ArrayList<SabaaEx> sabaaExes ;
    Context context ;

    public quran_explanation_34_adapter(ArrayList<SabaaEx> sabaaExes, Context context) {
        this.sabaaExes = sabaaExes;
        this.context = context;
    }

    class quranExplanation34Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation34;
        LinearLayout linearLayout;

        public quranExplanation34Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation34 = itemView.findViewById(R.id.explanation34_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_34);
        }
    }

    @NonNull
    @Override
    public quranExplanation34Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_34_item, parent , false);
        return new quranExplanation34Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation34Holder holder, int position) {
        SabaaEx sabaaEx = sabaaExes.get(position);
        holder.textViewExplanation34.setText(sabaaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return sabaaExes.size();
    }


}


