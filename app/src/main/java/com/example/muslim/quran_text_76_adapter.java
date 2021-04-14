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

public class quran_text_76_adapter extends RecyclerView.Adapter<quran_text_76_adapter.quranText76Holder> {

    ArrayList<Alensan> alensans ;
    Context context ;

    public quran_text_76_adapter(ArrayList<Alensan> alensans, Context context) {
        this.alensans = alensans;
        this.context = context;
    }

    class quranText76Holder extends RecyclerView.ViewHolder {
        TextView textViewText76;
        LinearLayout linearLayout;

        public quranText76Holder(@NonNull View itemView) {
            super(itemView);
            textViewText76 = itemView.findViewById(R.id.text76_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_76);
        }
    }

    @NonNull
    @Override
    public quranText76Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_76_item, parent , false);
        return new quranText76Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText76Holder holder, int position) {
        Alensan alensan = alensans.get(position);
        holder.textViewText76.setText(alensan.getAyat());


    }

    @Override
    public int getItemCount() {
        return alensans.size();
    }


}


