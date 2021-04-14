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

public class quran_text_31_adapter extends RecyclerView.Adapter<quran_text_31_adapter.quranText31Holder> {

    ArrayList<Loqman> loqmans ;
    Context context ;

    public quran_text_31_adapter(ArrayList<Loqman> loqmans, Context context) {
        this.loqmans = loqmans;
        this.context = context;
    }

    class quranText31Holder extends RecyclerView.ViewHolder {
        TextView textViewText31;
        LinearLayout linearLayout;

        public quranText31Holder(@NonNull View itemView) {
            super(itemView);
            textViewText31 = itemView.findViewById(R.id.text31_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_31);
        }
    }

    @NonNull
    @Override
    public quranText31Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_31_item, parent , false);
        return new quranText31Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText31Holder holder, int position) {
        Loqman loqman = loqmans.get(position);
        holder.textViewText31.setText(loqman.getAyat());


    }

    @Override
    public int getItemCount() {
        return loqmans.size();
    }


}


