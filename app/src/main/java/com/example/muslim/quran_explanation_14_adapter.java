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

public class quran_explanation_14_adapter extends RecyclerView.Adapter<quran_explanation_14_adapter.quranExplanation14Holder> {

    ArrayList<EbrahimEx> ebrahimExes ;
    Context context ;

    public quran_explanation_14_adapter(ArrayList<EbrahimEx> ebrahimExes, Context context) {
        this.ebrahimExes = ebrahimExes;
        this.context = context;
    }

    class quranExplanation14Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation14;
        LinearLayout linearLayout;

        public quranExplanation14Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation14 = itemView.findViewById(R.id.explanation14_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_14);
        }
    }

    @NonNull
    @Override
    public quranExplanation14Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_14_item, parent , false);
        return new quranExplanation14Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation14Holder holder, int position) {
        EbrahimEx ebrahimEx = ebrahimExes.get(position);
        holder.textViewExplanation14.setText(ebrahimEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return ebrahimExes.size();
    }


}


