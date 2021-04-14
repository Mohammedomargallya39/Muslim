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

public class quran_explanation_24_adapter extends RecyclerView.Adapter<quran_explanation_24_adapter.quranExplanation24Holder> {

    ArrayList<AlnourEx> alnourExes ;
    Context context ;

    public quran_explanation_24_adapter(ArrayList<AlnourEx> alnourExes, Context context) {
        this.alnourExes = alnourExes;
        this.context = context;
    }

    class quranExplanation24Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation24;
        LinearLayout linearLayout;

        public quranExplanation24Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation24 = itemView.findViewById(R.id.explanation24_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_24);
        }
    }

    @NonNull
    @Override
    public quranExplanation24Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_24_item, parent , false);
        return new quranExplanation24Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation24Holder holder, int position) {
        AlnourEx alnourEx = alnourExes.get(position);
        holder.textViewExplanation24.setText(alnourEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnourExes.size();
    }


}


