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

public class quran_text_114_adapter extends RecyclerView.Adapter<quran_text_114_adapter.quranText114Holder> {
    ArrayList<Elnas> elnass;
    Context context ;

    public quran_text_114_adapter(ArrayList<Elnas> elnass, Context context) {
        this.elnass = elnass;
        this.context = context;
    }
    class quranText114Holder extends RecyclerView.ViewHolder {
        TextView textViewText114;
        LinearLayout linearLayout;

        public quranText114Holder(@NonNull View itemView) {
            super(itemView);
            textViewText114 = itemView.findViewById(R.id.text114_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_114);
        }
    }
    @NonNull
    @Override
    public quran_text_114_adapter.quranText114Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_114_item, parent , false);
        return new quran_text_114_adapter.quranText114Holder(view);

    }
    @Override
    public void onBindViewHolder(@NonNull quran_text_114_adapter.quranText114Holder holder, int position) {
        Elnas elnas = elnass.get(position);
        holder.textViewText114.setText(elnas.getAyat());

    }


    @Override
    public int getItemCount() {
        return elnass.size();
    }
}

