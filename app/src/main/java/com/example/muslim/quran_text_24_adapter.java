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

public class quran_text_24_adapter extends RecyclerView.Adapter<quran_text_24_adapter.quranText24Holder> {

    ArrayList<Alnour> alnours ;
    Context context ;

    public quran_text_24_adapter(ArrayList<Alnour> alnours, Context context) {
        this.alnours = alnours;
        this.context = context;
    }

    class quranText24Holder extends RecyclerView.ViewHolder {
        TextView textViewText24;
        LinearLayout linearLayout;

        public quranText24Holder(@NonNull View itemView) {
            super(itemView);
            textViewText24 = itemView.findViewById(R.id.text24_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_24);
        }
    }

    @NonNull
    @Override
    public quranText24Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_24_item, parent , false);
        return new quranText24Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText24Holder holder, int position) {
        Alnour alnour = alnours.get(position);
        holder.textViewText24.setText(alnour.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnours.size();
    }


}


