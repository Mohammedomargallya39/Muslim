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

public class quran_explanation_35_adapter extends RecyclerView.Adapter<quran_explanation_35_adapter.quranExplanation35Holder> {

    ArrayList<FaterEx> faterExes ;
    Context context ;

    public quran_explanation_35_adapter(ArrayList<FaterEx> faterExes, Context context) {
        this.faterExes = faterExes;
        this.context = context;
    }

    class quranExplanation35Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation35;
        LinearLayout linearLayout;

        public quranExplanation35Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation35 = itemView.findViewById(R.id.explanation35_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_35);
        }
    }

    @NonNull
    @Override
    public quranExplanation35Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_35_item, parent , false);
        return new quranExplanation35Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation35Holder holder, int position) {
        FaterEx faterEx = faterExes.get(position);
        holder.textViewExplanation35.setText(faterEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return faterExes.size();
    }


}


