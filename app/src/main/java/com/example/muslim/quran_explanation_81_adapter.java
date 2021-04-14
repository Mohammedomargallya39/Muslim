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

public class quran_explanation_81_adapter extends RecyclerView.Adapter<quran_explanation_81_adapter.quranExplanation81Holder> {

    ArrayList<AltakwerEx> altakwerExes ;
    Context context ;

    public quran_explanation_81_adapter(ArrayList<AltakwerEx> altakwerExes, Context context) {
        this.altakwerExes = altakwerExes;
        this.context = context;
    }

    class quranExplanation81Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation81;
        LinearLayout linearLayout;

        public quranExplanation81Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation81 = itemView.findViewById(R.id.explanation81_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_81);
        }
    }

    @NonNull
    @Override
    public quranExplanation81Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_81_item, parent , false);
        return new quranExplanation81Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation81Holder holder, int position) {
        AltakwerEx altakwerEx = altakwerExes.get(position);
        holder.textViewExplanation81.setText(altakwerEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return altakwerExes.size();
    }


}


