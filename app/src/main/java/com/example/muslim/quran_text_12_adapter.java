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

public class quran_text_12_adapter extends RecyclerView.Adapter<quran_text_12_adapter.quranText12Holder> {

    ArrayList<Youssef> youssefs ;
    Context context ;

    public quran_text_12_adapter(ArrayList<Youssef> youssefs, Context context) {
        this.youssefs = youssefs;
        this.context = context;
    }

    class quranText12Holder extends RecyclerView.ViewHolder {
        TextView textViewText12;
        LinearLayout linearLayout;

        public quranText12Holder(@NonNull View itemView) {
            super(itemView);
            textViewText12 = itemView.findViewById(R.id.text12_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_12);
        }
    }

    @NonNull
    @Override
    public quranText12Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_12_item, parent , false);
        return new quranText12Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText12Holder holder, int position) {
        Youssef youssef = youssefs.get(position);
        holder.textViewText12.setText(youssef.getAyat());


    }

    @Override
    public int getItemCount() {
        return youssefs.size();
    }


}


