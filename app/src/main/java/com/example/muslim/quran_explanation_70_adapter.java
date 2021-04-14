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

public class quran_explanation_70_adapter extends RecyclerView.Adapter<quran_explanation_70_adapter.quranExplanation70Holder> {

    ArrayList<AlmaaregEx> almaaregExes ;
    Context context ;

    public quran_explanation_70_adapter(ArrayList<AlmaaregEx> almaaregExes, Context context) {
        this.almaaregExes = almaaregExes;
        this.context = context;
    }

    class quranExplanation70Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation70;
        LinearLayout linearLayout;

        public quranExplanation70Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation70 = itemView.findViewById(R.id.explanation70_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_70);
        }
    }

    @NonNull
    @Override
    public quranExplanation70Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_70_item, parent , false);
        return new quranExplanation70Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation70Holder holder, int position) {
        AlmaaregEx almaaregEx = almaaregExes.get(position);
        holder.textViewExplanation70.setText(almaaregEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return almaaregExes.size();
    }


}


