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

public class quran_explanation_10_adapter extends RecyclerView.Adapter<quran_explanation_10_adapter.quranExplanation10Holder> {

    ArrayList<YounesEx> younesExes ;
    Context context ;

    public quran_explanation_10_adapter(ArrayList<YounesEx> younesExes, Context context) {
        this.younesExes = younesExes;
        this.context = context;
    }

    class quranExplanation10Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation10;
        LinearLayout linearLayout;

        public quranExplanation10Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation10 = itemView.findViewById(R.id.explanation10_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_10);
        }
    }

    @NonNull
    @Override
    public quranExplanation10Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_10_item, parent , false);
        return new quranExplanation10Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation10Holder holder, int position) {
        YounesEx younesExe = younesExes.get(position);
        holder.textViewExplanation10.setText(younesExe.getAyat());


    }

    @Override
    public int getItemCount() {
        return younesExes.size();
    }


}


