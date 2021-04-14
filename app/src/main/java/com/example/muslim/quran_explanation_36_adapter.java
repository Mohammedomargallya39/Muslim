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

public class quran_explanation_36_adapter extends RecyclerView.Adapter<quran_explanation_36_adapter.quranExplanation36Holder> {

    ArrayList<YacenEx> yacenExes ;
    Context context ;

    public quran_explanation_36_adapter(ArrayList<YacenEx> yacenExes, Context context) {
        this.yacenExes = yacenExes;
        this.context = context;
    }

    class quranExplanation36Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation36;
        LinearLayout linearLayout;

        public quranExplanation36Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation36 = itemView.findViewById(R.id.explanation36_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_36);
        }
    }

    @NonNull
    @Override
    public quranExplanation36Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_36_item, parent , false);
        return new quranExplanation36Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation36Holder holder, int position) {
        YacenEx yacenEx = yacenExes.get(position);
        holder.textViewExplanation36.setText(yacenEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return yacenExes.size();
    }


}


