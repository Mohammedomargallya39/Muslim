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

public class quran_explanation_57_adapter extends RecyclerView.Adapter<quran_explanation_57_adapter.quranExplanation57Holder> {

    ArrayList<AlhadedEx> alhadedExes ;
    Context context ;

    public quran_explanation_57_adapter(ArrayList<AlhadedEx> alhadedExes, Context context) {
        this.alhadedExes = alhadedExes;
        this.context = context;
    }

    class quranExplanation57Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation57;
        LinearLayout linearLayout;

        public quranExplanation57Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation57 = itemView.findViewById(R.id.explanation57_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_57);
        }
    }

    @NonNull
    @Override
    public quranExplanation57Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_57_item, parent , false);
        return new quranExplanation57Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation57Holder holder, int position) {
        AlhadedEx alhadedEx = alhadedExes.get(position);
        holder.textViewExplanation57.setText(alhadedEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alhadedExes.size();
    }


}


