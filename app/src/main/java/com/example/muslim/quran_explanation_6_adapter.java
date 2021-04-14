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

public class quran_explanation_6_adapter extends RecyclerView.Adapter<quran_explanation_6_adapter.quranExplanation6Holder> {

    ArrayList<AlanaamEx> alanaamExes ;
    Context context ;

    public quran_explanation_6_adapter(ArrayList<AlanaamEx> alanaamExes, Context context) {
        this.alanaamExes = alanaamExes;
        this.context = context;
    }

    class quranExplanation6Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation6;
        LinearLayout linearLayout;

        public quranExplanation6Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation6 = itemView.findViewById(R.id.explanation6_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_6);
        }
    }

    @NonNull
    @Override
    public quranExplanation6Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_6_item, parent , false);
        return new quranExplanation6Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation6Holder holder, int position) {
        AlanaamEx alanaamExe = alanaamExes.get(position);
        holder.textViewExplanation6.setText(alanaamExe.getAyat());


    }

    @Override
    public int getItemCount() {
        return alanaamExes.size();
    }


}


