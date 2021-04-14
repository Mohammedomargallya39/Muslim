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

public class quran_explanation_54_adapter extends RecyclerView.Adapter<quran_explanation_54_adapter.quranExplanation54Holder> {

    ArrayList<AlqamarEx> alqamarExes ;
    Context context ;

    public quran_explanation_54_adapter(ArrayList<AlqamarEx> alqamarExes, Context context) {
        this.alqamarExes = alqamarExes;
        this.context = context;
    }

    class quranExplanation54Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation54;
        LinearLayout linearLayout;

        public quranExplanation54Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation54 = itemView.findViewById(R.id.explanation54_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_54);
        }
    }

    @NonNull
    @Override
    public quranExplanation54Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_54_item, parent , false);
        return new quranExplanation54Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation54Holder holder, int position) {
        AlqamarEx alqamarEx = alqamarExes.get(position);
        holder.textViewExplanation54.setText(alqamarEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alqamarExes.size();
    }


}


