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

public class quran_text_45_adapter extends RecyclerView.Adapter<quran_text_45_adapter.quranText45Holder> {

    ArrayList<Algatheya> algatheyas;
    Context context ;

    public quran_text_45_adapter(ArrayList<Algatheya> algatheyas, Context context) {
        this.algatheyas = algatheyas;
        this.context = context;
    }

    class quranText45Holder extends RecyclerView.ViewHolder {
        TextView textViewText45;
        LinearLayout linearLayout;

        public quranText45Holder(@NonNull View itemView) {
            super(itemView);
            textViewText45 = itemView.findViewById(R.id.text45_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_45);
        }
    }

    @NonNull
    @Override
    public quranText45Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_45_item, parent , false);
        return new quranText45Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText45Holder holder, int position) {
        Algatheya algatheya = algatheyas.get(position);
        holder.textViewText45.setText(algatheya.getAyat());


    }

    @Override
    public int getItemCount() {
        return algatheyas.size();
    }


}


