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

public class quran_explanation_17_adapter extends RecyclerView.Adapter<quran_explanation_17_adapter.quranExplanation17Holder> {

    ArrayList<AlesraaEx> alesraaExes ;
    Context context ;

    public quran_explanation_17_adapter(ArrayList<AlesraaEx> alesraaExes, Context context) {
        this.alesraaExes = alesraaExes;
        this.context = context;
    }

    class quranExplanation17Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation17;
        LinearLayout linearLayout;

        public quranExplanation17Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation17 = itemView.findViewById(R.id.explanation17_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_17);
        }
    }

    @NonNull
    @Override
    public quranExplanation17Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_17_item, parent , false);
        return new quranExplanation17Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation17Holder holder, int position) {
        AlesraaEx alesraaEx = alesraaExes.get(position);
        holder.textViewExplanation17.setText(alesraaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alesraaExes.size();
    }


}


