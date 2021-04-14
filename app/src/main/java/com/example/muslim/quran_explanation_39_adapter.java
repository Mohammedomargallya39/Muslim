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

public class quran_explanation_39_adapter extends RecyclerView.Adapter<quran_explanation_39_adapter.quranExplanation39Holder> {

    ArrayList<AlzomrEx> alzomrExes ;
    Context context ;

    public quran_explanation_39_adapter(ArrayList<AlzomrEx> alzomrExes, Context context) {
        this.alzomrExes = alzomrExes;
        this.context = context;
    }

    class quranExplanation39Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation39;
        LinearLayout linearLayout;

        public quranExplanation39Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation39 = itemView.findViewById(R.id.explanation39_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_39);
        }
    }

    @NonNull
    @Override
    public quranExplanation39Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_39_item, parent , false);
        return new quranExplanation39Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation39Holder holder, int position) {
        AlzomrEx alzomrEx = alzomrExes.get(position);
        holder.textViewExplanation39.setText(alzomrEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alzomrExes.size();
    }


}


