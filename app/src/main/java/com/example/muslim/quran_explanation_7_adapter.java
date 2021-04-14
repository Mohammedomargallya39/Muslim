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

public class quran_explanation_7_adapter extends RecyclerView.Adapter<quran_explanation_7_adapter.quranExplanation7Holder> {

    ArrayList<AlaarafEx> alaarafExes ;
    Context context ;

    public quran_explanation_7_adapter(ArrayList<AlaarafEx> alaarafExes, Context context) {
        this.alaarafExes = alaarafExes;
        this.context = context;
    }

    class quranExplanation7Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation7;
        LinearLayout linearLayout;

        public quranExplanation7Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation7 = itemView.findViewById(R.id.explanation7_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_7);
        }
    }

    @NonNull
    @Override
    public quranExplanation7Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_7_item, parent , false);
        return new quranExplanation7Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation7Holder holder, int position) {
        AlaarafEx alaarafExe = alaarafExes.get(position);
        holder.textViewExplanation7.setText(alaarafExe.getAyat());


    }

    @Override
    public int getItemCount() {
        return alaarafExes.size();
    }


}


