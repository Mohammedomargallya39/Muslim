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

public class quran_explanation_29_adapter extends RecyclerView.Adapter<quran_explanation_29_adapter.quranExplanation29Holder> {

    ArrayList<AlankaboutEx> alankaboutExes ;
    Context context ;

    public quran_explanation_29_adapter(ArrayList<AlankaboutEx> alankaboutExes, Context context) {
        this.alankaboutExes = alankaboutExes;
        this.context = context;
    }

    class quranExplanation29Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation29;
        LinearLayout linearLayout;

        public quranExplanation29Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation29 = itemView.findViewById(R.id.explanation29_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_29);
        }
    }

    @NonNull
    @Override
    public quranExplanation29Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_29_item, parent , false);
        return new quranExplanation29Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation29Holder holder, int position) {
        AlankaboutEx alankaboutEx = alankaboutExes.get(position);
        holder.textViewExplanation29.setText(alankaboutEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alankaboutExes.size();
    }


}


