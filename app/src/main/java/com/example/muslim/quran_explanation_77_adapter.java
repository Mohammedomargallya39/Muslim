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

public class quran_explanation_77_adapter extends RecyclerView.Adapter<quran_explanation_77_adapter.quranExplanation77Holder> {

    ArrayList<AlmorsalatEx> almorsalatExes ;
    Context context ;

    public quran_explanation_77_adapter(ArrayList<AlmorsalatEx> almorsalatExes, Context context) {
        this.almorsalatExes = almorsalatExes;
        this.context = context;
    }

    class quranExplanation77Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation77;
        LinearLayout linearLayout;

        public quranExplanation77Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation77 = itemView.findViewById(R.id.explanation77_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_77);
        }
    }

    @NonNull
    @Override
    public quranExplanation77Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_77_item, parent , false);
        return new quranExplanation77Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation77Holder holder, int position) {
        AlmorsalatEx almorsalatEx = almorsalatExes.get(position);
        holder.textViewExplanation77.setText(almorsalatEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return almorsalatExes.size();
    }


}


