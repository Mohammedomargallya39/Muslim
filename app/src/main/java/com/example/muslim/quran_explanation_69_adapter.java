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

public class quran_explanation_69_adapter extends RecyclerView.Adapter<quran_explanation_69_adapter.quranExplanation69Holder> {

    ArrayList<AlhaqahEx> alhaqahExes ;
    Context context ;

    public quran_explanation_69_adapter(ArrayList<AlhaqahEx> alhaqahExes, Context context) {
        this.alhaqahExes = alhaqahExes;
        this.context = context;
    }

    class quranExplanation69Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation69;
        LinearLayout linearLayout;

        public quranExplanation69Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation69 = itemView.findViewById(R.id.explanation69_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_69);
        }
    }

    @NonNull
    @Override
    public quranExplanation69Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_69_item, parent , false);
        return new quranExplanation69Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation69Holder holder, int position) {
        AlhaqahEx alhaqahEx = alhaqahExes.get(position);
        holder.textViewExplanation69.setText(alhaqahEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alhaqahExes.size();
    }


}


