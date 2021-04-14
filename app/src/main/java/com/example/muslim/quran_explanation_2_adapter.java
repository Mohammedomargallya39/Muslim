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

public class quran_explanation_2_adapter extends RecyclerView.Adapter<quran_explanation_2_adapter.quranExplanation2Holder> {

    ArrayList<AlbaqarahEx> albaqarahExes ;
    Context context ;

    public quran_explanation_2_adapter(ArrayList<AlbaqarahEx> albaqarahExes, Context context) {
        this.albaqarahExes = albaqarahExes;
        this.context = context;
    }

    class quranExplanation2Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation2;
        LinearLayout linearLayout;

        public quranExplanation2Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation2 = itemView.findViewById(R.id.explanation2_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_2);
        }
    }

    @NonNull
    @Override
    public quranExplanation2Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_2_item, parent , false);
        return new quranExplanation2Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation2Holder holder, int position) {
        AlbaqarahEx albaqarahExe = albaqarahExes.get(position);
        holder.textViewExplanation2.setText(albaqarahExe.getAyat());


    }

    @Override
    public int getItemCount() {
        return albaqarahExes.size();
    }


}


