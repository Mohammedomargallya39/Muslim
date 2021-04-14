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

public class quran_explanation_53_adapter extends RecyclerView.Adapter<quran_explanation_53_adapter.quranExplanation53Holder> {

    ArrayList<AlnagmEx> alnagmExes ;
    Context context ;

    public quran_explanation_53_adapter(ArrayList<AlnagmEx> alnagmExes, Context context) {
        this.alnagmExes = alnagmExes;
        this.context = context;
    }

    class quranExplanation53Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation53;
        LinearLayout linearLayout;

        public quranExplanation53Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation53 = itemView.findViewById(R.id.explanation53_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_53);
        }
    }

    @NonNull
    @Override
    public quranExplanation53Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_53_item, parent , false);
        return new quranExplanation53Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation53Holder holder, int position) {
        AlnagmEx alnagmEx = alnagmExes.get(position);
        holder.textViewExplanation53.setText(alnagmEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnagmExes.size();
    }


}


