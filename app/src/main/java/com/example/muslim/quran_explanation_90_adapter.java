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

public class quran_explanation_90_adapter extends RecyclerView.Adapter<quran_explanation_90_adapter.quranExplanation90Holder> {

    ArrayList<AlbaladEx> albaladExes ;
    Context context ;

    public quran_explanation_90_adapter(ArrayList<AlbaladEx> albaladExes, Context context) {
        this.albaladExes = albaladExes;
        this.context = context;
    }

    class quranExplanation90Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation90;
        LinearLayout linearLayout;

        public quranExplanation90Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation90 = itemView.findViewById(R.id.explanation90_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_90);
        }
    }

    @NonNull
    @Override
    public quranExplanation90Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_90_item, parent , false);
        return new quranExplanation90Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation90Holder holder, int position) {
        AlbaladEx albaladEx = albaladExes.get(position);
        holder.textViewExplanation90.setText(albaladEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return albaladExes.size();
    }


}


