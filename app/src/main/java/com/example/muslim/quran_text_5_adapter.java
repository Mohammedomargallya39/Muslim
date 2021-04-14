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

public class quran_text_5_adapter extends RecyclerView.Adapter<quran_text_5_adapter.quranText5Holder> {

    ArrayList<Almaeda> almaedas ;
    Context context ;

    public quran_text_5_adapter(ArrayList<Almaeda> almaedas, Context context) {
        this.almaedas = almaedas;
        this.context = context;
    }

    class quranText5Holder extends RecyclerView.ViewHolder {
        TextView textViewText5;
        LinearLayout linearLayout;

        public quranText5Holder(@NonNull View itemView) {
            super(itemView);
            textViewText5 = itemView.findViewById(R.id.text5_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_5);
        }
    }

    @NonNull
    @Override
    public quranText5Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_5_item, parent , false);
        return new quranText5Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText5Holder holder, int position) {
        Almaeda almaeda = almaedas.get(position);
        holder.textViewText5.setText(almaeda.getAyat());


    }

    @Override
    public int getItemCount() {
        return almaedas.size();
    }


}


