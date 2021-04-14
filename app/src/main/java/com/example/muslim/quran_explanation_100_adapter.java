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

public class quran_explanation_100_adapter extends RecyclerView.Adapter<quran_explanation_100_adapter.quranExplanation100Holder> {

    ArrayList<AladiatEx> aladiatExes ;
    Context context ;

    public quran_explanation_100_adapter(ArrayList<AladiatEx> aladiatExes, Context context) {
        this.aladiatExes = aladiatExes;
        this.context = context;
    }

    class quranExplanation100Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation100;
        LinearLayout linearLayout;

        public quranExplanation100Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation100 = itemView.findViewById(R.id.explanation100_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_100);
        }
    }

    @NonNull
    @Override
    public quranExplanation100Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_100_item, parent , false);
        return new quranExplanation100Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation100Holder holder, int position) {
        AladiatEx aladiatEx = aladiatExes.get(position);
        holder.textViewExplanation100.setText(aladiatEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return aladiatExes.size();
    }


}


