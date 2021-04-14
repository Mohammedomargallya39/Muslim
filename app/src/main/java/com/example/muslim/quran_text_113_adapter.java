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

public class quran_text_113_adapter extends RecyclerView.Adapter<quran_text_113_adapter.quranText113Holder> {

    ArrayList<Alfalq> alfalqs ;
    Context context ;

    public quran_text_113_adapter(ArrayList<Alfalq> alfalqs, Context context) {
        this.alfalqs = alfalqs;
        this.context = context;
    }

    class quranText113Holder extends RecyclerView.ViewHolder {
        TextView textViewText113;
        LinearLayout linearLayout;

        public quranText113Holder(@NonNull View itemView) {
            super(itemView);
            textViewText113 = itemView.findViewById(R.id.text113_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_113);
        }
    }

    @NonNull
    @Override
    public quranText113Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_113_item, parent , false);
        return new quranText113Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText113Holder holder, int position) {
        Alfalq alfalq = alfalqs.get(position);
        holder.textViewText113.setText(alfalq.getAyat());


    }

    @Override
    public int getItemCount() {
        return alfalqs.size();
    }


}


