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

public class quran_text_88_adapter extends RecyclerView.Adapter<quran_text_88_adapter.quranText88Holder> {

    ArrayList<Alghashia> alghashias ;
    Context context ;

    public quran_text_88_adapter(ArrayList<Alghashia> alghashias, Context context) {
        this.alghashias = alghashias;
        this.context = context;
    }

    class quranText88Holder extends RecyclerView.ViewHolder {
        TextView textViewText88;
        LinearLayout linearLayout;

        public quranText88Holder(@NonNull View itemView) {
            super(itemView);
            textViewText88 = itemView.findViewById(R.id.text88_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_88);
        }
    }

    @NonNull
    @Override
    public quranText88Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_88_item, parent , false);
        return new quranText88Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText88Holder holder, int position) {
        Alghashia alghashia = alghashias.get(position);
        holder.textViewText88.setText(alghashia.getAyat());


    }

    @Override
    public int getItemCount() {
        return alghashias.size();
    }


}


