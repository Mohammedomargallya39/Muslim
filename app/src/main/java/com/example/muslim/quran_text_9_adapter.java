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

public class quran_text_9_adapter extends RecyclerView.Adapter<quran_text_9_adapter.quranText9Holder> {

    ArrayList<Altouba> altoubas ;
    Context context ;

    public quran_text_9_adapter(ArrayList<Altouba> altoubas, Context context) {
        this.altoubas = altoubas;
        this.context = context;
    }

    class quranText9Holder extends RecyclerView.ViewHolder {
        TextView textViewText9;
        LinearLayout linearLayout;

        public quranText9Holder(@NonNull View itemView) {
            super(itemView);
            textViewText9 = itemView.findViewById(R.id.text9_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_9);
        }
    }

    @NonNull
    @Override
    public quranText9Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_9_item, parent , false);
        return new quranText9Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText9Holder holder, int position) {
        Altouba altouba = altoubas.get(position);
        holder.textViewText9.setText(altouba.getAyat());


    }

    @Override
    public int getItemCount() {
        return altoubas.size();
    }


}


