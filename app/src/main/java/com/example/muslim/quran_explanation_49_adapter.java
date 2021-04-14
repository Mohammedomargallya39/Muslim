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

public class quran_explanation_49_adapter extends RecyclerView.Adapter<quran_explanation_49_adapter.quranExplanation49Holder> {

    ArrayList<AlhogratEx> alhogratExes ;
    Context context ;

    public quran_explanation_49_adapter(ArrayList<AlhogratEx> alhogratExes, Context context) {
        this.alhogratExes = alhogratExes;
        this.context = context;
    }

    class quranExplanation49Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation49;
        LinearLayout linearLayout;

        public quranExplanation49Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation49 = itemView.findViewById(R.id.explanation49_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_49);
        }
    }

    @NonNull
    @Override
    public quranExplanation49Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_49_item, parent , false);
        return new quranExplanation49Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation49Holder holder, int position) {
        AlhogratEx alhogratEx = alhogratExes.get(position);
        holder.textViewExplanation49.setText(alhogratEx.getAyat());
    }

    @Override
    public int getItemCount() {
        return alhogratExes.size();
    }


}


