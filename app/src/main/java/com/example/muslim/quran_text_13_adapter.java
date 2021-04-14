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

public class quran_text_13_adapter extends RecyclerView.Adapter<quran_text_13_adapter.quranText13Holder> {

    ArrayList<Alraad> alraads ;
    Context context ;

    public quran_text_13_adapter(ArrayList<Alraad> alraads, Context context) {
        this.alraads = alraads;
        this.context = context;
    }

    class quranText13Holder extends RecyclerView.ViewHolder {
        TextView textViewText13;
        LinearLayout linearLayout;

        public quranText13Holder(@NonNull View itemView) {
            super(itemView);
            textViewText13 = itemView.findViewById(R.id.text13_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_13);
        }
    }

    @NonNull
    @Override
    public quranText13Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_13_item, parent , false);
        return new quranText13Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText13Holder holder, int position) {
        Alraad alraad = alraads.get(position);
        holder.textViewText13.setText(alraad.getAyat());


    }

    @Override
    public int getItemCount() {
        return alraads.size();
    }


}


