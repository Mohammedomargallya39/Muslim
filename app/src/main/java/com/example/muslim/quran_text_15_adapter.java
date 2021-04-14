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

public class quran_text_15_adapter extends RecyclerView.Adapter<quran_text_15_adapter.quranText15Holder> {

    ArrayList<Alhagr> alhagrs ;
    Context context ;

    public quran_text_15_adapter(ArrayList<Alhagr> alhagrs, Context context) {
        this.alhagrs = alhagrs;
        this.context = context;
    }

    class quranText15Holder extends RecyclerView.ViewHolder {
        TextView textViewText15;
        LinearLayout linearLayout;

        public quranText15Holder(@NonNull View itemView) {
            super(itemView);
            textViewText15 = itemView.findViewById(R.id.text15_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_15);
        }
    }

    @NonNull
    @Override
    public quranText15Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_15_item, parent , false);
        return new quranText15Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText15Holder holder, int position) {
        Alhagr alhagr = alhagrs.get(position);
        holder.textViewText15.setText(alhagr.getAyat());


    }

    @Override
    public int getItemCount() {
        return alhagrs.size();
    }


}


