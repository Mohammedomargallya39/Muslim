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

public class quran_text_90_adapter extends RecyclerView.Adapter<quran_text_90_adapter.quranText90Holder> {

    ArrayList<Albalad> albalads ;
    Context context ;

    public quran_text_90_adapter(ArrayList<Albalad> albalads, Context context) {
        this.albalads = albalads;
        this.context = context;
    }

    class quranText90Holder extends RecyclerView.ViewHolder {
        TextView textViewText90;
        LinearLayout linearLayout;

        public quranText90Holder(@NonNull View itemView) {
            super(itemView);
            textViewText90 = itemView.findViewById(R.id.text90_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_90);
        }
    }

    @NonNull
    @Override
    public quranText90Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_90_item, parent , false);
        return new quranText90Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText90Holder holder, int position) {
        Albalad albalad = albalads.get(position);
        holder.textViewText90.setText(albalad.getAyat());


    }

    @Override
    public int getItemCount() {
        return albalads.size();
    }


}


