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

public class quran_text_82_adapter extends RecyclerView.Adapter<quran_text_82_adapter.quranText82Holder> {

    ArrayList<Alenfetar> alenfetars ;
    Context context ;

    public quran_text_82_adapter(ArrayList<Alenfetar> alenfetars, Context context) {
        this.alenfetars = alenfetars;
        this.context = context;
    }

    class quranText82Holder extends RecyclerView.ViewHolder {
        TextView textViewText82;
        LinearLayout linearLayout;

        public quranText82Holder(@NonNull View itemView) {
            super(itemView);
            textViewText82 = itemView.findViewById(R.id.text82_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_82);
        }
    }

    @NonNull
    @Override
    public quranText82Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_82_item, parent , false);
        return new quranText82Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText82Holder holder, int position) {
        Alenfetar alenfetar = alenfetars.get(position);
        holder.textViewText82.setText(alenfetar.getAyat());


    }

    @Override
    public int getItemCount() {
        return alenfetars.size();
    }


}


