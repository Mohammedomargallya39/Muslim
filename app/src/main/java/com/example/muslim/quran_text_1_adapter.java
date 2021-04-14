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

public class quran_text_1_adapter extends RecyclerView.Adapter<quran_text_1_adapter.quranText1Holder> {

    ArrayList<Elfateha> elfatehas ;
    Context context ;

    public quran_text_1_adapter(ArrayList<Elfateha> elfatehas, Context context) {
        this.elfatehas = elfatehas;
        this.context = context;
    }

    class quranText1Holder extends RecyclerView.ViewHolder {
        TextView textViewText1;
        LinearLayout linearLayout;

        public quranText1Holder(@NonNull View itemView) {
            super(itemView);
            textViewText1 = itemView.findViewById(R.id.text1_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_1);
        }
    }

    @NonNull
    @Override
    public quranText1Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_1_item, parent , false);
        return new quranText1Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText1Holder holder, int position) {
        Elfateha elfateha = elfatehas.get(position);
        holder.textViewText1.setText(elfateha.getAyat());


    }

    @Override
    public int getItemCount() {
        return elfatehas.size();
    }


    }


