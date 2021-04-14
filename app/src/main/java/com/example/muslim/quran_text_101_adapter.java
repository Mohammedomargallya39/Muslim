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

public class quran_text_101_adapter extends RecyclerView.Adapter<quran_text_101_adapter.quranText101Holder> {

    ArrayList<Alkareaa> alkareaas ;
    Context context ;

    public quran_text_101_adapter(ArrayList<Alkareaa> alkareaas, Context context) {
        this.alkareaas = alkareaas;
        this.context = context;
    }

    class quranText101Holder extends RecyclerView.ViewHolder {
        TextView textViewText101;
        LinearLayout linearLayout;

        public quranText101Holder(@NonNull View itemView) {
            super(itemView);
            textViewText101 = itemView.findViewById(R.id.text101_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_101);
        }
    }

    @NonNull
    @Override
    public quranText101Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_101_item, parent , false);
        return new quranText101Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText101Holder holder, int position) {
        Alkareaa alkareaa = alkareaas.get(position);
        holder.textViewText101.setText(alkareaa.getAyat());


    }

    @Override
    public int getItemCount() {
        return alkareaas.size();
    }


}


