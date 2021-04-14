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

public class quran_explanation_112_adapter extends RecyclerView.Adapter<quran_explanation_112_adapter.quranExplanation112Holder> {

    ArrayList<AlekhlasEx> alekhlasExes ;
    Context context ;

    public quran_explanation_112_adapter(ArrayList<AlekhlasEx> alekhlasExes, Context context) {
        this.alekhlasExes = alekhlasExes;
        this.context = context;
    }

    class quranExplanation112Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation112;
        LinearLayout linearLayout;

        public quranExplanation112Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation112 = itemView.findViewById(R.id.explanation112_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_112);
        }
    }

    @NonNull
    @Override
    public quranExplanation112Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_112_item, parent , false);
        return new quranExplanation112Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation112Holder holder, int position) {
        AlekhlasEx alekhlasEx = alekhlasExes.get(position);
        holder.textViewExplanation112.setText(alekhlasEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alekhlasExes.size();
    }


}


