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

public class quran_explanation_86_adapter extends RecyclerView.Adapter<quran_explanation_86_adapter.quranExplanation86Holder> {

    ArrayList<AltareqEx> altareqExes ;
    Context context ;

    public quran_explanation_86_adapter(ArrayList<AltareqEx> altareqExes, Context context) {
        this.altareqExes = altareqExes;
        this.context = context;
    }

    class quranExplanation86Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation86;
        LinearLayout linearLayout;

        public quranExplanation86Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation86 = itemView.findViewById(R.id.explanation86_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_86);
        }
    }

    @NonNull
    @Override
    public quranExplanation86Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_86_item, parent , false);
        return new quranExplanation86Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation86Holder holder, int position) {
        AltareqEx altareqEx = altareqExes.get(position);
        holder.textViewExplanation86.setText(altareqEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return altareqExes.size();
    }


}


