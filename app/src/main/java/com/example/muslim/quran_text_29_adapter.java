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

public class quran_text_29_adapter extends RecyclerView.Adapter<quran_text_29_adapter.quranText29Holder> {

    ArrayList<Alankabout> alankabouts ;
    Context context ;

    public quran_text_29_adapter(ArrayList<Alankabout> alankabouts, Context context) {
        this.alankabouts = alankabouts;
        this.context = context;
    }

    class quranText29Holder extends RecyclerView.ViewHolder {
        TextView textViewText29;
        LinearLayout linearLayout;

        public quranText29Holder(@NonNull View itemView) {
            super(itemView);
            textViewText29 = itemView.findViewById(R.id.text29_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_29);
        }
    }

    @NonNull
    @Override
    public quranText29Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_29_item, parent , false);
        return new quranText29Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText29Holder holder, int position) {
        Alankabout alankabout = alankabouts.get(position);
        holder.textViewText29.setText(alankabout.getAyat());


    }

    @Override
    public int getItemCount() {
        return alankabouts.size();
    }


}


