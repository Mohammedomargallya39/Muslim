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

public class quran_explanation_102_adapter extends RecyclerView.Adapter<quran_explanation_102_adapter.quranExplanation102Holder> {

    ArrayList<AltkathorEx> altkathorExes ;
    Context context ;

    public quran_explanation_102_adapter(ArrayList<AltkathorEx> altkathorExes, Context context) {
        this.altkathorExes = altkathorExes;
        this.context = context;
    }

    class quranExplanation102Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation102;
        LinearLayout linearLayout;

        public quranExplanation102Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation102 = itemView.findViewById(R.id.explanation102_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_102);
        }
    }

    @NonNull
    @Override
    public quranExplanation102Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_102_item, parent , false);
        return new quranExplanation102Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation102Holder holder, int position) {
        AltkathorEx altkathorEx = altkathorExes.get(position);
        holder.textViewExplanation102.setText(altkathorEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return altkathorExes.size();
    }


}


