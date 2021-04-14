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

public class quran_explanation_94_adapter extends RecyclerView.Adapter<quran_explanation_94_adapter.quranExplanation94Holder> {

    ArrayList<AlsharhEx> alsharhExes ;
    Context context ;

    public quran_explanation_94_adapter(ArrayList<AlsharhEx> alsharhExes, Context context) {
        this.alsharhExes = alsharhExes;
        this.context = context;
    }

    class quranExplanation94Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation94;
        LinearLayout linearLayout;

        public quranExplanation94Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation94 = itemView.findViewById(R.id.explanation94_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_94);
        }
    }

    @NonNull
    @Override
    public quranExplanation94Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_94_item, parent , false);
        return new quranExplanation94Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation94Holder holder, int position) {
        AlsharhEx alsharhEx = alsharhExes.get(position);
        holder.textViewExplanation94.setText(alsharhEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alsharhExes.size();
    }


}


