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

public class quran_explanation_97_adapter extends RecyclerView.Adapter<quran_explanation_97_adapter.quranExplanation97Holder> {

    ArrayList<AlqadrEx> alqadrExes ;
    Context context ;

    public quran_explanation_97_adapter(ArrayList<AlqadrEx> alqadrExes, Context context) {
        this.alqadrExes = alqadrExes;
        this.context = context;
    }

    class quranExplanation97Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation97;
        LinearLayout linearLayout;

        public quranExplanation97Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation97 = itemView.findViewById(R.id.explanation97_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_97);
        }
    }

    @NonNull
    @Override
    public quranExplanation97Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_97_item, parent , false);
        return new quranExplanation97Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation97Holder holder, int position) {
        AlqadrEx alqadrEx = alqadrExes.get(position);
        holder.textViewExplanation97.setText(alqadrEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alqadrExes.size();
    }


}


