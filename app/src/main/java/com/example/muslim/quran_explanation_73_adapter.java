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

public class quran_explanation_73_adapter extends RecyclerView.Adapter<quran_explanation_73_adapter.quranExplanation73Holder> {

    ArrayList<AlmozamelEx> almozamelExes ;
    Context context ;

    public quran_explanation_73_adapter(ArrayList<AlmozamelEx> almozamelExes, Context context) {
        this.almozamelExes = almozamelExes;
        this.context = context;
    }

    class quranExplanation73Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation73;
        LinearLayout linearLayout;

        public quranExplanation73Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation73 = itemView.findViewById(R.id.explanation73_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_73);
        }
    }

    @NonNull
    @Override
    public quranExplanation73Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_73_item, parent , false);
        return new quranExplanation73Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation73Holder holder, int position) {
        AlmozamelEx almozamelEx = almozamelExes.get(position);
        holder.textViewExplanation73.setText(almozamelEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return almozamelExes.size();
    }


}


