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

public class quran_text_100_adapter extends RecyclerView.Adapter<quran_text_100_adapter.quranText100Holder> {

    ArrayList<Aladiat> aladiats ;
    Context context ;

    public quran_text_100_adapter(ArrayList<Aladiat> aladiats, Context context) {
        this.aladiats = aladiats;
        this.context = context;
    }

    class quranText100Holder extends RecyclerView.ViewHolder {
        TextView textViewText100;
        LinearLayout linearLayout;

        public quranText100Holder(@NonNull View itemView) {
            super(itemView);
            textViewText100 = itemView.findViewById(R.id.text100_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_100);
        }
    }

    @NonNull
    @Override
    public quranText100Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_100_item, parent , false);
        return new quranText100Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText100Holder holder, int position) {
        Aladiat aladiat = aladiats.get(position);
        holder.textViewText100.setText(aladiat.getAyat());


    }

    @Override
    public int getItemCount() {
        return aladiats.size();
    }


}


