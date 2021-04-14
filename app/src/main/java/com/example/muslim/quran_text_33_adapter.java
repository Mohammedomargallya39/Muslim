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

public class quran_text_33_adapter extends RecyclerView.Adapter<quran_text_33_adapter.quranText33Holder> {

    ArrayList<Alahzab> alahzabs ;
    Context context ;

    public quran_text_33_adapter(ArrayList<Alahzab> alahzabs, Context context) {
        this.alahzabs = alahzabs;
        this.context = context;
    }

    class quranText33Holder extends RecyclerView.ViewHolder {
        TextView textViewText33;
        LinearLayout linearLayout;

        public quranText33Holder(@NonNull View itemView) {
            super(itemView);
            textViewText33 = itemView.findViewById(R.id.text33_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_33);
        }
    }

    @NonNull
    @Override
    public quranText33Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_33_item, parent , false);
        return new quranText33Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText33Holder holder, int position) {
        Alahzab alahzab = alahzabs.get(position);
        holder.textViewText33.setText(alahzab.getAyat());


    }

    @Override
    public int getItemCount() {
        return alahzabs.size();
    }


}


