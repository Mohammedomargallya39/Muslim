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

public class quran_text_50_adapter extends RecyclerView.Adapter<quran_text_50_adapter.quranText50Holder> {

    ArrayList<Qaf> qafs ;
    Context context ;

    public quran_text_50_adapter(ArrayList<Qaf> qafs, Context context) {
        this.qafs = qafs;
        this.context = context;
    }

    class quranText50Holder extends RecyclerView.ViewHolder {
        TextView textViewText50;
        LinearLayout linearLayout;

        public quranText50Holder(@NonNull View itemView) {
            super(itemView);
            textViewText50 = itemView.findViewById(R.id.text50_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_50);
        }
    }

    @NonNull
    @Override
    public quranText50Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_50_item, parent , false);
        return new quranText50Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText50Holder holder, int position) {
        Qaf qaf = qafs.get(position);
        holder.textViewText50.setText(qaf.getAyat());


    }

    @Override
    public int getItemCount() {
        return qafs.size();
    }


}


