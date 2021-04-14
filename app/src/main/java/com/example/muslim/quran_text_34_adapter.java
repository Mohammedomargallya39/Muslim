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

public class quran_text_34_adapter extends RecyclerView.Adapter<quran_text_34_adapter.quranText34Holder> {

    ArrayList<Sabaa> sabaas ;
    Context context ;

    public quran_text_34_adapter(ArrayList<Sabaa> sabaas, Context context) {
        this.sabaas = sabaas;
        this.context = context;
    }

    class quranText34Holder extends RecyclerView.ViewHolder {
        TextView textViewText34;
        LinearLayout linearLayout;

        public quranText34Holder(@NonNull View itemView) {
            super(itemView);
            textViewText34 = itemView.findViewById(R.id.text34_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_34);
        }
    }

    @NonNull
    @Override
    public quranText34Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_34_item, parent , false);
        return new quranText34Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText34Holder holder, int position) {
        Sabaa sabaa = sabaas.get(position);
        holder.textViewText34.setText(sabaa.getAyat());


    }

    @Override
    public int getItemCount() {
        return sabaas.size();
    }


}


