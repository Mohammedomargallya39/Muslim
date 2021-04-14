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

public class quran_text_8_adapter extends RecyclerView.Adapter<quran_text_8_adapter.quranText8Holder> {

    ArrayList<Alanfal> alanfals ;
    Context context ;

    public quran_text_8_adapter(ArrayList<Alanfal> alanfals, Context context) {
        this.alanfals = alanfals;
        this.context = context;
    }

    class quranText8Holder extends RecyclerView.ViewHolder {
        TextView textViewText8;
        LinearLayout linearLayout;

        public quranText8Holder(@NonNull View itemView) {
            super(itemView);
            textViewText8 = itemView.findViewById(R.id.text8_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_8);
        }
    }

    @NonNull
    @Override
    public quranText8Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_8_item, parent , false);
        return new quranText8Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText8Holder holder, int position) {
        Alanfal alanfal = alanfals.get(position);
        holder.textViewText8.setText(alanfal.getAyat());


    }

    @Override
    public int getItemCount() {
        return alanfals.size();
    }


}


