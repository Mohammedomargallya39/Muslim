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

public class quran_explanation_28_adapter extends RecyclerView.Adapter<quran_explanation_28_adapter.quranExplanation28Holder> {

    ArrayList<AlqasasEx> alqasasExes ;
    Context context ;

    public quran_explanation_28_adapter(ArrayList<AlqasasEx> alqasasExes, Context context) {
        this.alqasasExes = alqasasExes;
        this.context = context;
    }

    class quranExplanation28Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation28;
        LinearLayout linearLayout;

        public quranExplanation28Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation28 = itemView.findViewById(R.id.explanation28_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_28);
        }
    }

    @NonNull
    @Override
    public quranExplanation28Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_28_item, parent , false);
        return new quranExplanation28Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation28Holder holder, int position) {
        AlqasasEx alqasasEx = alqasasExes.get(position);
        holder.textViewExplanation28.setText(alqasasEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alqasasExes.size();
    }


}


