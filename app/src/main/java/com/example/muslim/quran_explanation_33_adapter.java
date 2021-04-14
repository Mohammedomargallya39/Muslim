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

public class quran_explanation_33_adapter extends RecyclerView.Adapter<quran_explanation_33_adapter.quranExplanation33Holder> {

    ArrayList<AlahzabEx> alahzabExes ;
    Context context ;

    public quran_explanation_33_adapter(ArrayList<AlahzabEx> alahzabExes, Context context) {
        this.alahzabExes = alahzabExes;
        this.context = context;
    }

    class quranExplanation33Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation33;
        LinearLayout linearLayout;

        public quranExplanation33Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation33 = itemView.findViewById(R.id.explanation33_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_33);
        }
    }

    @NonNull
    @Override
    public quranExplanation33Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_33_item, parent , false);
        return new quranExplanation33Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation33Holder holder, int position) {
        AlahzabEx alahzabEx = alahzabExes.get(position);
        holder.textViewExplanation33.setText(alahzabEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alahzabExes.size();
    }


}


