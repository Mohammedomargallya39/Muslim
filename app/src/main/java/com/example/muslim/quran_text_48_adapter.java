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

public class quran_text_48_adapter extends RecyclerView.Adapter<quran_text_48_adapter.quranText48Holder> {

    ArrayList<Alfath> alfaths;
    Context context ;

    public quran_text_48_adapter(ArrayList<Alfath> alfaths, Context context) {
        this.alfaths = alfaths;
        this.context = context;
    }

    class quranText48Holder extends RecyclerView.ViewHolder {
        TextView textViewText48;
        LinearLayout linearLayout;

        public quranText48Holder(@NonNull View itemView) {
            super(itemView);
            textViewText48 = itemView.findViewById(R.id.text48_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_48);
        }
    }

    @NonNull
    @Override
    public quranText48Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_48_item, parent , false);
        return new quranText48Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText48Holder holder, int position) {
        Alfath alfath = alfaths.get(position);
        holder.textViewText48.setText(alfath.getAyat());


    }

    @Override
    public int getItemCount() {
        return alfaths.size();
    }


}


