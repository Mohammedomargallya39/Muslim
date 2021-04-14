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

public class quran_explanation_109_adapter extends RecyclerView.Adapter<quran_explanation_109_adapter.quranExplanation109Holder> {

    ArrayList<AlkaferonEx> alkaferonExes ;
    Context context ;

    public quran_explanation_109_adapter(ArrayList<AlkaferonEx> alkaferonExes, Context context) {
        this.alkaferonExes = alkaferonExes;
        this.context = context;
    }

    class quranExplanation109Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation109;
        LinearLayout linearLayout;

        public quranExplanation109Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation109 = itemView.findViewById(R.id.explanation109_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_109);
        }
    }

    @NonNull
    @Override
    public quranExplanation109Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_109_item, parent , false);
        return new quranExplanation109Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation109Holder holder, int position) {
        AlkaferonEx alkaferonEx = alkaferonExes.get(position);
        holder.textViewExplanation109.setText(alkaferonEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alkaferonExes.size();
    }


}


