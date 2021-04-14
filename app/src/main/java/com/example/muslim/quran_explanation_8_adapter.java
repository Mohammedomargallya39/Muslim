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

public class quran_explanation_8_adapter extends RecyclerView.Adapter<quran_explanation_8_adapter.quranExplanation8Holder> {

    ArrayList<AlanfalEx> alanfalExes ;
    Context context ;

    public quran_explanation_8_adapter(ArrayList<AlanfalEx> alanfalExes, Context context) {
        this.alanfalExes = alanfalExes;
        this.context = context;
    }

    class quranExplanation8Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation8;
        LinearLayout linearLayout;

        public quranExplanation8Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation8 = itemView.findViewById(R.id.explanation8_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_8);
        }
    }

    @NonNull
    @Override
    public quranExplanation8Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_8_item, parent , false);
        return new quranExplanation8Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation8Holder holder, int position) {
        AlanfalEx alanfalExe = alanfalExes.get(position);
        holder.textViewExplanation8.setText(alanfalExe.getAyat());


    }

    @Override
    public int getItemCount() {
        return alanfalExes.size();
    }


}


