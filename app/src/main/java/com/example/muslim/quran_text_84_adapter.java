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

public class quran_text_84_adapter extends RecyclerView.Adapter<quran_text_84_adapter.quranText84Holder> {

    ArrayList<Alensheqaq> alensheqaqs ;
    Context context ;

    public quran_text_84_adapter(ArrayList<Alensheqaq> alensheqaqs, Context context) {
        this.alensheqaqs = alensheqaqs;
        this.context = context;
    }

    class quranText84Holder extends RecyclerView.ViewHolder {
        TextView textViewText84;
        LinearLayout linearLayout;

        public quranText84Holder(@NonNull View itemView) {
            super(itemView);
            textViewText84 = itemView.findViewById(R.id.text84_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_84);
        }
    }

    @NonNull
    @Override
    public quranText84Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_84_item, parent , false);
        return new quranText84Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText84Holder holder, int position) {
        Alensheqaq alensheqaq = alensheqaqs.get(position);
        holder.textViewText84.setText(alensheqaq.getAyat());


    }

    @Override
    public int getItemCount() {
        return alensheqaqs.size();
    }


}


