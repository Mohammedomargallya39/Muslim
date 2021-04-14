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

public class quran_explanation_61_adapter extends RecyclerView.Adapter<quran_explanation_61_adapter.quranExplanation61Holder> {

    ArrayList<AlsafEx> alsafExes ;
    Context context ;

    public quran_explanation_61_adapter(ArrayList<AlsafEx> alsafExes, Context context) {
        this.alsafExes = alsafExes;
        this.context = context;
    }

    class quranExplanation61Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation61;
        LinearLayout linearLayout;

        public quranExplanation61Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation61 = itemView.findViewById(R.id.explanation61_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_61);
        }
    }

    @NonNull
    @Override
    public quranExplanation61Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_61_item, parent , false);
        return new quranExplanation61Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation61Holder holder, int position) {
        AlsafEx alsafEx = alsafExes.get(position);
        holder.textViewExplanation61.setText(alsafEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alsafExes.size();
    }


}


