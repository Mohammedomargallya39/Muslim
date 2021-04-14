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

public class quran_explanation_38_adapter extends RecyclerView.Adapter<quran_explanation_38_adapter.quranExplanation38Holder> {

    ArrayList<SadEx> sadExes ;
    Context context ;

    public quran_explanation_38_adapter(ArrayList<SadEx> sadExes, Context context) {
        this.sadExes = sadExes;
        this.context = context;
    }

    class quranExplanation38Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation38;
        LinearLayout linearLayout;

        public quranExplanation38Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation38 = itemView.findViewById(R.id.explanation38_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_38);
        }
    }

    @NonNull
    @Override
    public quranExplanation38Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_38_item, parent , false);
        return new quranExplanation38Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation38Holder holder, int position) {
        SadEx sadEx = sadExes.get(position);
        holder.textViewExplanation38.setText(sadEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return sadExes.size();
    }


}


