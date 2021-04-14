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

public class quran_explanation_18_adapter extends RecyclerView.Adapter<quran_explanation_18_adapter.quranExplanation18Holder> {

    ArrayList<AlkahfEx> alkahfExes ;
    Context context ;

    public quran_explanation_18_adapter(ArrayList<AlkahfEx> alkahfExes, Context context) {
        this.alkahfExes = alkahfExes;
        this.context = context;
    }

    class quranExplanation18Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation18;
        LinearLayout linearLayout;

        public quranExplanation18Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation18 = itemView.findViewById(R.id.explanation18_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_18);
        }
    }

    @NonNull
    @Override
    public quranExplanation18Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_18_item, parent , false);
        return new quranExplanation18Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation18Holder holder, int position) {
        AlkahfEx alkahfEx = alkahfExes.get(position);
        holder.textViewExplanation18.setText(alkahfEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alkahfExes.size();
    }


}


