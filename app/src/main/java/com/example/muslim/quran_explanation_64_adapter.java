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

public class quran_explanation_64_adapter extends RecyclerView.Adapter<quran_explanation_64_adapter.quranExplanation64Holder> {

    ArrayList<AltghabonEx> altghabonExes ;
    Context context ;

    public quran_explanation_64_adapter(ArrayList<AltghabonEx> altghabonExes, Context context) {
        this.altghabonExes = altghabonExes;
        this.context = context;
    }

    class quranExplanation64Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation64;
        LinearLayout linearLayout;

        public quranExplanation64Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation64 = itemView.findViewById(R.id.explanation64_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_64);
        }
    }

    @NonNull
    @Override
    public quranExplanation64Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_64_item, parent , false);
        return new quranExplanation64Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation64Holder holder, int position) {
        AltghabonEx altghabonEx = altghabonExes.get(position);
        holder.textViewExplanation64.setText(altghabonEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return altghabonExes.size();
    }


}


