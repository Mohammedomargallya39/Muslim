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

public class quran_explanation_3_adapter extends RecyclerView.Adapter<quran_explanation_3_adapter.quranExplanation3Holder> {

    ArrayList<AlemranEx> alemranExes ;
    Context context ;

    public quran_explanation_3_adapter(ArrayList<AlemranEx> alemranExes, Context context) {
        this.alemranExes = alemranExes;
        this.context = context;
    }

    class quranExplanation3Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation3;
        LinearLayout linearLayout;

        public quranExplanation3Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation3 = itemView.findViewById(R.id.explanation3_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_3);
        }
    }

    @NonNull
    @Override
    public quranExplanation3Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_3_item, parent , false);
        return new quranExplanation3Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation3Holder holder, int position) {
        AlemranEx alemranExe = alemranExes.get(position);
        holder.textViewExplanation3.setText(alemranExe.getAyat());


    }

    @Override
    public int getItemCount() {
        return alemranExes.size();
    }


}


