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

public class quran_explanation_78_adapter extends RecyclerView.Adapter<quran_explanation_78_adapter.quranExplanation78Holder> {

    ArrayList<AlnabaaEx> alnabaaExes ;
    Context context ;

    public quran_explanation_78_adapter(ArrayList<AlnabaaEx> alnabaaExes, Context context) {
        this.alnabaaExes = alnabaaExes;
        this.context = context;
    }

    class quranExplanation78Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation78;
        LinearLayout linearLayout;

        public quranExplanation78Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation78 = itemView.findViewById(R.id.explanation78_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_78);
        }
    }

    @NonNull
    @Override
    public quranExplanation78Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_78_item, parent , false);
        return new quranExplanation78Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation78Holder holder, int position) {
        AlnabaaEx alnabaaEx = alnabaaExes.get(position);
        holder.textViewExplanation78.setText(alnabaaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnabaaExes.size();
    }


}


