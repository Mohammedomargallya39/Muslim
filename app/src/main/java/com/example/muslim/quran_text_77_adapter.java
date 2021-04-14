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

public class quran_text_77_adapter extends RecyclerView.Adapter<quran_text_77_adapter.quranText77Holder> {

    ArrayList<Almorsalat> almorsalats ;
    Context context ;

    public quran_text_77_adapter(ArrayList<Almorsalat> almorsalats, Context context) {
        this.almorsalats = almorsalats;
        this.context = context;
    }

    class quranText77Holder extends RecyclerView.ViewHolder {
        TextView textViewText77;
        LinearLayout linearLayout;

        public quranText77Holder(@NonNull View itemView) {
            super(itemView);
            textViewText77 = itemView.findViewById(R.id.text77_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_77);
        }
    }

    @NonNull
    @Override
    public quranText77Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_77_item, parent , false);
        return new quranText77Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText77Holder holder, int position) {
        Almorsalat almorsalat = almorsalats.get(position);
        holder.textViewText77.setText(almorsalat.getAyat());


    }

    @Override
    public int getItemCount() {
        return almorsalats.size();
    }


}


