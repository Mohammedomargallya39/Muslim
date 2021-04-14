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

public class quran_text_65_adapter extends RecyclerView.Adapter<quran_text_65_adapter.quranText65Holder> {

    ArrayList<Altalaq> altalaqs ;
    Context context ;

    public quran_text_65_adapter(ArrayList<Altalaq> altalaqs, Context context) {
        this.altalaqs = altalaqs;
        this.context = context;
    }

    class quranText65Holder extends RecyclerView.ViewHolder {
        TextView textViewText65;
        LinearLayout linearLayout;

        public quranText65Holder(@NonNull View itemView) {
            super(itemView);
            textViewText65 = itemView.findViewById(R.id.text65_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_65);
        }
    }

    @NonNull
    @Override
    public quranText65Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_65_item, parent , false);
        return new quranText65Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText65Holder holder, int position) {
        Altalaq altalaq = altalaqs.get(position);
        holder.textViewText65.setText(altalaq.getAyat());


    }

    @Override
    public int getItemCount() {
        return altalaqs.size();
    }


}


