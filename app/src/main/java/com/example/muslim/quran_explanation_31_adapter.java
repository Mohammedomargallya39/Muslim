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

public class quran_explanation_31_adapter extends RecyclerView.Adapter<quran_explanation_31_adapter.quranExplanation31Holder> {

    ArrayList<LoqmanEx> loqmanExes ;
    Context context ;

    public quran_explanation_31_adapter(ArrayList<LoqmanEx> loqmanExes, Context context) {
        this.loqmanExes = loqmanExes;
        this.context = context;
    }

    class quranExplanation31Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation31;
        LinearLayout linearLayout;

        public quranExplanation31Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation31 = itemView.findViewById(R.id.explanation31_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_31);
        }
    }

    @NonNull
    @Override
    public quranExplanation31Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_31_item, parent , false);
        return new quranExplanation31Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation31Holder holder, int position) {
        LoqmanEx loqmanEx = loqmanExes.get(position);
        holder.textViewExplanation31.setText(loqmanEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return loqmanExes.size();
    }


}


