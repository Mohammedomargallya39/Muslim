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

public class quran_explanation_87_adapter extends RecyclerView.Adapter<quran_explanation_87_adapter.quranExplanation87Holder> {

    ArrayList<AlaalaEx> alaalaExes ;
    Context context ;

    public quran_explanation_87_adapter(ArrayList<AlaalaEx> alaalaExes, Context context) {
        this.alaalaExes = alaalaExes;
        this.context = context;
    }

    class quranExplanation87Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation87;
        LinearLayout linearLayout;

        public quranExplanation87Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation87 = itemView.findViewById(R.id.explanation87_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_87);
        }
    }

    @NonNull
    @Override
    public quranExplanation87Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_87_item, parent , false);
        return new quranExplanation87Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation87Holder holder, int position) {
        AlaalaEx alaalaEx = alaalaExes.get(position);
        holder.textViewExplanation87.setText(alaalaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alaalaExes.size();
    }


}


