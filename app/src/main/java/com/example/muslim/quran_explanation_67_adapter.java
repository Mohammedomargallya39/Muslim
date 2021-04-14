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

public class quran_explanation_67_adapter extends RecyclerView.Adapter<quran_explanation_67_adapter.quranExplanation67Holder> {

    ArrayList<AlmolkEx> almolkExes ;
    Context context ;

    public quran_explanation_67_adapter(ArrayList<AlmolkEx> almolkExes, Context context) {
        this.almolkExes = almolkExes;
        this.context = context;
    }

    class quranExplanation67Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation67;
        LinearLayout linearLayout;

        public quranExplanation67Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation67 = itemView.findViewById(R.id.explanation67_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_67);
        }
    }

    @NonNull
    @Override
    public quranExplanation67Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_67_item, parent , false);
        return new quranExplanation67Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation67Holder holder, int position) {
        AlmolkEx almolkEx = almolkExes.get(position);
        holder.textViewExplanation67.setText(almolkEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return almolkExes.size();
    }


}


