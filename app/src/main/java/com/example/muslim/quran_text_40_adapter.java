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

public class quran_text_40_adapter extends RecyclerView.Adapter<quran_text_40_adapter.quranText40Holder> {

    ArrayList<Ghafer> ghafers;
    Context context ;

    public quran_text_40_adapter(ArrayList<Ghafer> ghafers, Context context) {
        this.ghafers = ghafers;
        this.context = context;
    }

    class quranText40Holder extends RecyclerView.ViewHolder {
        TextView textViewText40;
        LinearLayout linearLayout;

        public quranText40Holder(@NonNull View itemView) {
            super(itemView);
            textViewText40 = itemView.findViewById(R.id.text40_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_40);
        }
    }

    @NonNull
    @Override
    public quranText40Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_40_item, parent , false);
        return new quranText40Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText40Holder holder, int position) {
        Ghafer ghafer = ghafers.get(position);
        holder.textViewText40.setText(ghafer.getAyat());


    }

    @Override
    public int getItemCount() {
        return ghafers.size();
    }


}


