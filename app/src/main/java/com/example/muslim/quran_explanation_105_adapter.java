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

public class quran_explanation_105_adapter extends RecyclerView.Adapter<quran_explanation_105_adapter.quranExplanation105Holder> {

    ArrayList<AlfelEx> alfelExes ;
    Context context ;

    public quran_explanation_105_adapter(ArrayList<AlfelEx> alfelExes, Context context) {
        this.alfelExes = alfelExes;
        this.context = context;
    }

    class quranExplanation105Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation105;
        LinearLayout linearLayout;

        public quranExplanation105Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation105 = itemView.findViewById(R.id.explanation105_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_105);
        }
    }

    @NonNull
    @Override
    public quranExplanation105Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_105_item, parent , false);
        return new quranExplanation105Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation105Holder holder, int position) {
        AlfelEx alfelEx = alfelExes.get(position);
        holder.textViewExplanation105.setText(alfelEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alfelExes.size();
    }


}


