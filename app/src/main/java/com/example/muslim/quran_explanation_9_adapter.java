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

public class quran_explanation_9_adapter extends RecyclerView.Adapter<quran_explanation_9_adapter.quranExplanation9Holder> {

    ArrayList<AltoubaEx> altoubaExes ;
    Context context ;

    public quran_explanation_9_adapter(ArrayList<AltoubaEx> altoubaExes, Context context) {
        this.altoubaExes = altoubaExes;
        this.context = context;
    }

    class quranExplanation9Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation9;
        LinearLayout linearLayout;

        public quranExplanation9Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation9 = itemView.findViewById(R.id.explanation9_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_9);
        }
    }

    @NonNull
    @Override
    public quranExplanation9Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_9_item, parent , false);
        return new quranExplanation9Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation9Holder holder, int position) {
        AltoubaEx altoubaExe = altoubaExes.get(position);
        holder.textViewExplanation9.setText(altoubaExe.getAyat());


    }

    @Override
    public int getItemCount() {
        return altoubaExes.size();
    }


}


