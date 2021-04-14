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

public class quran_explanation_72_adapter extends RecyclerView.Adapter<quran_explanation_72_adapter.quranExplanation72Holder> {

    ArrayList<AlgenEx> algenExes ;
    Context context ;

    public quran_explanation_72_adapter(ArrayList<AlgenEx> algenExes, Context context) {
        this.algenExes = algenExes;
        this.context = context;
    }

    class quranExplanation72Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation72;
        LinearLayout linearLayout;

        public quranExplanation72Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation72 = itemView.findViewById(R.id.explanation72_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_72);
        }
    }

    @NonNull
    @Override
    public quranExplanation72Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_72_item, parent , false);
        return new quranExplanation72Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation72Holder holder, int position) {
        AlgenEx algenEx = algenExes.get(position);
        holder.textViewExplanation72.setText(algenEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return algenExes.size();
    }


}


