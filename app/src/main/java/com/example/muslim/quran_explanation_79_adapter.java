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

public class quran_explanation_79_adapter extends RecyclerView.Adapter<quran_explanation_79_adapter.quranExplanation79Holder> {

    ArrayList<AlnazeatEx> alnazeatExes ;
    Context context ;

    public quran_explanation_79_adapter(ArrayList<AlnazeatEx> alnazeatExes, Context context) {
        this.alnazeatExes = alnazeatExes;
        this.context = context;
    }

    class quranExplanation79Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation79;
        LinearLayout linearLayout;

        public quranExplanation79Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation79 = itemView.findViewById(R.id.explanation79_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_79);
        }
    }

    @NonNull
    @Override
    public quranExplanation79Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_79_item, parent , false);
        return new quranExplanation79Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation79Holder holder, int position) {
        AlnazeatEx alnazeatEx = alnazeatExes.get(position);
        holder.textViewExplanation79.setText(alnazeatEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnazeatExes.size();
    }


}


