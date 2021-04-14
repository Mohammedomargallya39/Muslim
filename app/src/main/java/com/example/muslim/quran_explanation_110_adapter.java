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

public class quran_explanation_110_adapter extends RecyclerView.Adapter<quran_explanation_110_adapter.quranExplanation110Holder> {

    ArrayList<AlnasrEx> alnasrExes ;
    Context context ;

    public quran_explanation_110_adapter(ArrayList<AlnasrEx> alnasrExes, Context context) {
        this.alnasrExes = alnasrExes;
        this.context = context;
    }

    class quranExplanation110Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation110;
        LinearLayout linearLayout;

        public quranExplanation110Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation110 = itemView.findViewById(R.id.explanation110_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_110);
        }
    }

    @NonNull
    @Override
    public quranExplanation110Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_110_item, parent , false);
        return new quranExplanation110Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation110Holder holder, int position) {
        AlnasrEx alnasrEx = alnasrExes.get(position);
        holder.textViewExplanation110.setText(alnasrEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnasrExes.size();
    }


}


