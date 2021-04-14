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

public class quran_text_79_adapter extends RecyclerView.Adapter<quran_text_79_adapter.quranText79Holder> {

    ArrayList<Alnazeat> alnazeats ;
    Context context ;

    public quran_text_79_adapter(ArrayList<Alnazeat> alnazeats, Context context) {
        this.alnazeats = alnazeats;
        this.context = context;
    }

    class quranText79Holder extends RecyclerView.ViewHolder {
        TextView textViewText79;
        LinearLayout linearLayout;

        public quranText79Holder(@NonNull View itemView) {
            super(itemView);
            textViewText79 = itemView.findViewById(R.id.text79_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_79);
        }
    }

    @NonNull
    @Override
    public quranText79Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_79_item, parent , false);
        return new quranText79Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText79Holder holder, int position) {
        Alnazeat alnazeat = alnazeats.get(position);
        holder.textViewText79.setText(alnazeat.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnazeats.size();
    }


}


