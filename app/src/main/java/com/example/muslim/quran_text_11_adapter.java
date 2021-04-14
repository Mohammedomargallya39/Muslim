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

public class quran_text_11_adapter extends RecyclerView.Adapter<quran_text_11_adapter.quranText11Holder> {

    ArrayList<Hood> hoods ;
    Context context ;

    public quran_text_11_adapter(ArrayList<Hood> hoods, Context context) {
        this.hoods = hoods;
        this.context = context;
    }

    class quranText11Holder extends RecyclerView.ViewHolder {
        TextView textViewText11;
        LinearLayout linearLayout;

        public quranText11Holder(@NonNull View itemView) {
            super(itemView);
            textViewText11 = itemView.findViewById(R.id.text11_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_11);
        }
    }

    @NonNull
    @Override
    public quranText11Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_11_item, parent , false);
        return new quranText11Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText11Holder holder, int position) {
        Hood hood = hoods.get(position);
        holder.textViewText11.setText(hood.getAyat());


    }

    @Override
    public int getItemCount() {
        return hoods.size();
    }


}


