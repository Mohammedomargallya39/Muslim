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

public class quran_explanation_85_adapter extends RecyclerView.Adapter<quran_explanation_85_adapter.quranExplanation85Holder> {

    ArrayList<AlborogEx> alborogExes ;
    Context context ;

    public quran_explanation_85_adapter(ArrayList<AlborogEx> alborogExes, Context context) {
        this.alborogExes = alborogExes;
        this.context = context;
    }

    class quranExplanation85Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation85;
        LinearLayout linearLayout;

        public quranExplanation85Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation85 = itemView.findViewById(R.id.explanation85_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_85);
        }
    }

    @NonNull
    @Override
    public quranExplanation85Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_85_item, parent , false);
        return new quranExplanation85Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation85Holder holder, int position) {
        AlborogEx alborogEx = alborogExes.get(position);
        holder.textViewExplanation85.setText(alborogEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alborogExes.size();
    }


}


