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

public class quran_text_55_adapter extends RecyclerView.Adapter<quran_text_55_adapter.quranText55Holder> {

    ArrayList<Alrahman> alrahmans ;
    Context context ;

    public quran_text_55_adapter(ArrayList<Alrahman> alrahmans, Context context) {
        this.alrahmans = alrahmans;
        this.context = context;
    }

    class quranText55Holder extends RecyclerView.ViewHolder {
        TextView textViewText55;
        LinearLayout linearLayout;

        public quranText55Holder(@NonNull View itemView) {
            super(itemView);
            textViewText55 = itemView.findViewById(R.id.text55_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_55);
        }
    }

    @NonNull
    @Override
    public quranText55Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_55_item, parent , false);
        return new quranText55Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText55Holder holder, int position) {
        Alrahman alrahman = alrahmans.get(position);
        holder.textViewText55.setText(alrahman.getAyat());


    }

    @Override
    public int getItemCount() {
        return alrahmans.size();
    }


}


