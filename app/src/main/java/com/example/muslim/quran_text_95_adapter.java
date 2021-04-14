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

public class quran_text_95_adapter extends RecyclerView.Adapter<quran_text_95_adapter.quranText95Holder> {

    ArrayList<Alten> altens ;
    Context context ;

    public quran_text_95_adapter(ArrayList<Alten> altens, Context context) {
        this.altens = altens;
        this.context = context;
    }

    class quranText95Holder extends RecyclerView.ViewHolder {
        TextView textViewText95;
        LinearLayout linearLayout;

        public quranText95Holder(@NonNull View itemView) {
            super(itemView);
            textViewText95 = itemView.findViewById(R.id.text95_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_95);
        }
    }

    @NonNull
    @Override
    public quranText95Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_95_item, parent , false);
        return new quranText95Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText95Holder holder, int position) {
        Alten alten = altens.get(position);
        holder.textViewText95.setText(alten.getAyat());


    }

    @Override
    public int getItemCount() {
        return altens.size();
    }


}


