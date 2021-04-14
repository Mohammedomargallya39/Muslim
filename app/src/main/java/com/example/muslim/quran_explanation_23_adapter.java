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

public class quran_explanation_23_adapter extends RecyclerView.Adapter<quran_explanation_23_adapter.quranExplanation23Holder> {

    ArrayList<AlmoemenonEx> almoemenonExes ;
    Context context ;

    public quran_explanation_23_adapter(ArrayList<AlmoemenonEx> almoemenonExes, Context context) {
        this.almoemenonExes = almoemenonExes;
        this.context = context;
    }

    class quranExplanation23Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation23;
        LinearLayout linearLayout;

        public quranExplanation23Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation23 = itemView.findViewById(R.id.explanation23_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_23);
        }
    }

    @NonNull
    @Override
    public quranExplanation23Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_23_item, parent , false);
        return new quranExplanation23Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation23Holder holder, int position) {
        AlmoemenonEx almoemenonEx = almoemenonExes.get(position);
        holder.textViewExplanation23.setText(almoemenonEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return almoemenonExes.size();
    }


}


