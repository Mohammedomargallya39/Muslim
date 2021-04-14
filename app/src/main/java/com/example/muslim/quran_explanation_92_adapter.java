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

public class quran_explanation_92_adapter extends RecyclerView.Adapter<quran_explanation_92_adapter.quranExplanation92Holder> {

    ArrayList<AllailEx> allailExes ;
    Context context ;

    public quran_explanation_92_adapter(ArrayList<AllailEx> allailExes, Context context) {
        this.allailExes = allailExes;
        this.context = context;
    }

    class quranExplanation92Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation92;
        LinearLayout linearLayout;

        public quranExplanation92Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation92 = itemView.findViewById(R.id.explanation92_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_92);
        }
    }

    @NonNull
    @Override
    public quranExplanation92Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_92_item, parent , false);
        return new quranExplanation92Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation92Holder holder, int position) {
        AllailEx allailEx = allailExes.get(position);
        holder.textViewExplanation92.setText(allailEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return allailExes.size();
    }


}


