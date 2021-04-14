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

public class quran_explanation_89_adapter extends RecyclerView.Adapter<quran_explanation_89_adapter.quranExplanation89Holder> {

    ArrayList<AlfagrEx> alfagrExes ;
    Context context ;

    public quran_explanation_89_adapter(ArrayList<AlfagrEx> alfagrExes, Context context) {
        this.alfagrExes = alfagrExes;
        this.context = context;
    }

    class quranExplanation89Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation89;
        LinearLayout linearLayout;

        public quranExplanation89Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation89 = itemView.findViewById(R.id.explanation89_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_89);
        }
    }

    @NonNull
    @Override
    public quranExplanation89Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_89_item, parent , false);
        return new quranExplanation89Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation89Holder holder, int position) {
        AlfagrEx alfagrEx = alfagrExes.get(position);
        holder.textViewExplanation89.setText(alfagrEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alfagrExes.size();
    }


}


