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

public class quran_text_28_adapter extends RecyclerView.Adapter<quran_text_28_adapter.quranText28Holder> {

    ArrayList<Alqass> alqasses ;
    Context context ;

    public quran_text_28_adapter(ArrayList<Alqass> alqasses, Context context) {
        this.alqasses = alqasses;
        this.context = context;
    }

    class quranText28Holder extends RecyclerView.ViewHolder {
        TextView textViewText28;
        LinearLayout linearLayout;

        public quranText28Holder(@NonNull View itemView) {
            super(itemView);
            textViewText28 = itemView.findViewById(R.id.text28_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_28);
        }
    }

    @NonNull
    @Override
    public quranText28Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_28_item, parent , false);
        return new quranText28Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText28Holder holder, int position) {
        Alqass alqasse = alqasses.get(position);
        holder.textViewText28.setText(alqasse.getAyat());


    }

    @Override
    public int getItemCount() {
        return alqasses.size();
    }


}


