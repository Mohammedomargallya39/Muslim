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

public class quran_explanation_1_adapter extends RecyclerView.Adapter<quran_explanation_1_adapter.quranExplanation1Holder> {

    ArrayList<AlfatehaEx> alfatehaExes ;
    Context context ;

    public quran_explanation_1_adapter(ArrayList<AlfatehaEx> alfatehaExes, Context context) {
        this.alfatehaExes = alfatehaExes;
        this.context = context;
    }

    class quranExplanation1Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation1;
        LinearLayout linearLayout;

        public quranExplanation1Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation1 = itemView.findViewById(R.id.explanation1_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_1);
        }
    }

    @NonNull
    @Override
    public quranExplanation1Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_1_item, parent , false);
        return new quranExplanation1Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation1Holder holder, int position) {
        AlfatehaEx alfatehaExe = alfatehaExes.get(position);
        holder.textViewExplanation1.setText(alfatehaExe.getAyat());


    }

    @Override
    public int getItemCount() {
        return alfatehaExes.size();
    }


}


