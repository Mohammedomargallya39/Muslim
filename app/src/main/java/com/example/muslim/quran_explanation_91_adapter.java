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

public class quran_explanation_91_adapter extends RecyclerView.Adapter<quran_explanation_91_adapter.quranExplanation91Holder> {

    ArrayList<AlshamsEx> alshamsExes ;
    Context context ;

    public quran_explanation_91_adapter(ArrayList<AlshamsEx> alshamsExes, Context context) {
        this.alshamsExes = alshamsExes;
        this.context = context;
    }

    class quranExplanation91Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation91;
        LinearLayout linearLayout;

        public quranExplanation91Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation91 = itemView.findViewById(R.id.explanation91_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_91);
        }
    }

    @NonNull
    @Override
    public quranExplanation91Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_91_item, parent , false);
        return new quranExplanation91Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation91Holder holder, int position) {
        AlshamsEx alshamsEx = alshamsExes.get(position);
        holder.textViewExplanation91.setText(alshamsEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alshamsExes.size();
    }


}


