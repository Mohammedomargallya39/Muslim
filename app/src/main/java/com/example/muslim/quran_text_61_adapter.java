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

public class quran_text_61_adapter extends RecyclerView.Adapter<quran_text_61_adapter.quranText61Holder> {

    ArrayList<Alsaf> alsafs ;
    Context context ;

    public quran_text_61_adapter(ArrayList<Alsaf> alsafs, Context context) {
        this.alsafs = alsafs;
        this.context = context;
    }

    class quranText61Holder extends RecyclerView.ViewHolder {
        TextView textViewText61;
        LinearLayout linearLayout;

        public quranText61Holder(@NonNull View itemView) {
            super(itemView);
            textViewText61 = itemView.findViewById(R.id.text61_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_61);
        }
    }

    @NonNull
    @Override
    public quranText61Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_61_item, parent , false);
        return new quranText61Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText61Holder holder, int position) {
        Alsaf alsaf = alsafs.get(position);
        holder.textViewText61.setText(alsaf.getAyat());


    }

    @Override
    public int getItemCount() {
        return alsafs.size();
    }


}


