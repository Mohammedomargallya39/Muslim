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

public class quran_explanation_59_adapter extends RecyclerView.Adapter<quran_explanation_59_adapter.quranExplanation59Holder> {

    ArrayList<AlhashrEx> alhashrExes ;
    Context context ;

    public quran_explanation_59_adapter(ArrayList<AlhashrEx> alhashrExes, Context context) {
        this.alhashrExes = alhashrExes;
        this.context = context;
    }

    class quranExplanation59Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation59;
        LinearLayout linearLayout;

        public quranExplanation59Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation59 = itemView.findViewById(R.id.explanation59_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_59);
        }
    }

    @NonNull
    @Override
    public quranExplanation59Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_59_item, parent , false);
        return new quranExplanation59Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation59Holder holder, int position) {
        AlhashrEx alhashrEx = alhashrExes.get(position);
        holder.textViewExplanation59.setText(alhashrEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alhashrExes.size();
    }


}


