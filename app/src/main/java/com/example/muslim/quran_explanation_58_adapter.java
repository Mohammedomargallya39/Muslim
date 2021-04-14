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

public class quran_explanation_58_adapter extends RecyclerView.Adapter<quran_explanation_58_adapter.quranExplanation58Holder> {

    ArrayList<AlmogadalaEx> almogadalaExes ;
    Context context ;

    public quran_explanation_58_adapter(ArrayList<AlmogadalaEx> almogadalaExes, Context context) {
        this.almogadalaExes = almogadalaExes;
        this.context = context;
    }

    class quranExplanation58Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation58;
        LinearLayout linearLayout;

        public quranExplanation58Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation58 = itemView.findViewById(R.id.explanation58_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_58);
        }
    }

    @NonNull
    @Override
    public quranExplanation58Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_58_item, parent , false);
        return new quranExplanation58Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation58Holder holder, int position) {
        AlmogadalaEx almogadalaEx = almogadalaExes.get(position);
        holder.textViewExplanation58.setText(almogadalaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return almogadalaExes.size();
    }


}


