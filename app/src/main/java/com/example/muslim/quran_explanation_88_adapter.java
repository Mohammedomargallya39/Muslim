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

public class quran_explanation_88_adapter extends RecyclerView.Adapter<quran_explanation_88_adapter.quranExplanation88Holder> {

    ArrayList<AlghashiaEx> alghashiaExes ;
    Context context ;

    public quran_explanation_88_adapter(ArrayList<AlghashiaEx> alghashiaExes, Context context) {
        this.alghashiaExes = alghashiaExes;
        this.context = context;
    }

    class quranExplanation88Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation88;
        LinearLayout linearLayout;

        public quranExplanation88Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation88 = itemView.findViewById(R.id.explanation88_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_88);
        }
    }

    @NonNull
    @Override
    public quranExplanation88Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_88_item, parent , false);
        return new quranExplanation88Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation88Holder holder, int position) {
        AlghashiaEx alghashiaEx = alghashiaExes.get(position);
        holder.textViewExplanation88.setText(alghashiaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alghashiaExes.size();
    }


}


