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

public class quran_explanation_55_adapter extends RecyclerView.Adapter<quran_explanation_55_adapter.quranExplanation55Holder> {

    ArrayList<AlrahmanEx> alrahmanExes ;
    Context context ;

    public quran_explanation_55_adapter(ArrayList<AlrahmanEx> alrahmanExes, Context context) {
        this.alrahmanExes = alrahmanExes;
        this.context = context;
    }

    class quranExplanation55Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation55;
        LinearLayout linearLayout;

        public quranExplanation55Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation55 = itemView.findViewById(R.id.explanation55_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_55);
        }
    }

    @NonNull
    @Override
    public quranExplanation55Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_55_item, parent , false);
        return new quranExplanation55Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation55Holder holder, int position) {
        AlrahmanEx alrahmanEx = alrahmanExes.get(position);
        holder.textViewExplanation55.setText(alrahmanEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alrahmanExes.size();
    }


}


