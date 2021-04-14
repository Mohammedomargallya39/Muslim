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

public class quran_explanation_27_adapter extends RecyclerView.Adapter<quran_explanation_27_adapter.quranExplanation27Holder> {

    ArrayList<AlnamlEx> alnamlExes ;
    Context context ;

    public quran_explanation_27_adapter(ArrayList<AlnamlEx> alnamlExes, Context context) {
        this.alnamlExes = alnamlExes;
        this.context = context;
    }

    class quranExplanation27Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation27;
        LinearLayout linearLayout;

        public quranExplanation27Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation27 = itemView.findViewById(R.id.explanation27_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_27);
        }
    }

    @NonNull
    @Override
    public quranExplanation27Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_27_item, parent , false);
        return new quranExplanation27Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation27Holder holder, int position) {
        AlnamlEx alnamlEx = alnamlExes.get(position);
        holder.textViewExplanation27.setText(alnamlEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnamlExes.size();
    }


}


