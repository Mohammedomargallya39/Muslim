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

public class quran_explanation_74_adapter extends RecyclerView.Adapter<quran_explanation_74_adapter.quranExplanation74Holder> {

    ArrayList<AlmodatherEx> almodatherExes ;
    Context context ;

    public quran_explanation_74_adapter(ArrayList<AlmodatherEx> almodatherExes, Context context) {
        this.almodatherExes = almodatherExes;
        this.context = context;
    }

    class quranExplanation74Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation74;
        LinearLayout linearLayout;

        public quranExplanation74Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation74 = itemView.findViewById(R.id.explanation74_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_74);
        }
    }

    @NonNull
    @Override
    public quranExplanation74Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_74_item, parent , false);
        return new quranExplanation74Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation74Holder holder, int position) {
        AlmodatherEx almodatherEx = almodatherExes.get(position);
        holder.textViewExplanation74.setText(almodatherEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return almodatherExes.size();
    }


}


