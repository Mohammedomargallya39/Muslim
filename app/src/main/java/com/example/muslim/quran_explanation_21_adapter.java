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

public class quran_explanation_21_adapter extends RecyclerView.Adapter<quran_explanation_21_adapter.quranExplanation21Holder> {

    ArrayList<AlaanbiaaEx> alaanbiaaExes ;
    Context context ;

    public quran_explanation_21_adapter(ArrayList<AlaanbiaaEx> alaanbiaaExes, Context context) {
        this.alaanbiaaExes = alaanbiaaExes;
        this.context = context;
    }

    class quranExplanation21Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation21;
        LinearLayout linearLayout;

        public quranExplanation21Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation21 = itemView.findViewById(R.id.explanation21_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_21);
        }
    }

    @NonNull
    @Override
    public quranExplanation21Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_21_item, parent , false);
        return new quranExplanation21Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation21Holder holder, int position) {
        AlaanbiaaEx alaanbiaaEx = alaanbiaaExes.get(position);
        holder.textViewExplanation21.setText(alaanbiaaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alaanbiaaExes.size();
    }


}


