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

public class quran_explanation_101_adapter extends RecyclerView.Adapter<quran_explanation_101_adapter.quranExplanation101Holder> {

    ArrayList<AlqareaEx> alqareaExes ;
    Context context ;

    public quran_explanation_101_adapter(ArrayList<AlqareaEx> alqareaExes, Context context) {
        this.alqareaExes = alqareaExes;
        this.context = context;
    }

    class quranExplanation101Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation101;
        LinearLayout linearLayout;

        public quranExplanation101Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation101 = itemView.findViewById(R.id.explanation101_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_101);
        }
    }

    @NonNull
    @Override
    public quranExplanation101Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_101_item, parent , false);
        return new quranExplanation101Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation101Holder holder, int position) {
        AlqareaEx alqareaEx = alqareaExes.get(position);
        holder.textViewExplanation101.setText(alqareaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alqareaExes.size();
    }


}


