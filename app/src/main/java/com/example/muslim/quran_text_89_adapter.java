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

public class quran_text_89_adapter extends RecyclerView.Adapter<quran_text_89_adapter.quranText89Holder> {

    ArrayList<Alfagr> alfagrs ;
    Context context ;

    public quran_text_89_adapter(ArrayList<Alfagr> alfagrs, Context context) {
        this.alfagrs = alfagrs;
        this.context = context;
    }

    class quranText89Holder extends RecyclerView.ViewHolder {
        TextView textViewText89;
        LinearLayout linearLayout;

        public quranText89Holder(@NonNull View itemView) {
            super(itemView);
            textViewText89 = itemView.findViewById(R.id.text89_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_89);
        }
    }

    @NonNull
    @Override
    public quranText89Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_89_item, parent , false);
        return new quranText89Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText89Holder holder, int position) {
        Alfagr alfagr = alfagrs.get(position);
        holder.textViewText89.setText(alfagr.getAyat());


    }

    @Override
    public int getItemCount() {
        return alfagrs.size();
    }


}


