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

public class quran_text_68_adapter extends RecyclerView.Adapter<quran_text_68_adapter.quranText68Holder> {

    ArrayList<Alqalm> alqalms;
    Context context ;

    public quran_text_68_adapter(ArrayList<Alqalm> alqalms, Context context) {
        this.alqalms = alqalms;
        this.context = context;
    }

    class quranText68Holder extends RecyclerView.ViewHolder {
        TextView textViewText68;
        LinearLayout linearLayout;

        public quranText68Holder(@NonNull View itemView) {
            super(itemView);
            textViewText68 = itemView.findViewById(R.id.text68_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_68);
        }
    }

    @NonNull
    @Override
    public quranText68Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_68_item, parent , false);
        return new quranText68Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText68Holder holder, int position) {
        Alqalm alqalm = alqalms.get(position);
        holder.textViewText68.setText(alqalm.getAyat());


    }

    @Override
    public int getItemCount() {
        return alqalms.size();
    }


}


