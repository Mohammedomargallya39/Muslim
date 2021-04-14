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

public class quran_text_111_adapter extends RecyclerView.Adapter<quran_text_111_adapter.quranText111Holder> {

    ArrayList<Almasad> almasads ;
    Context context ;

    public quran_text_111_adapter(ArrayList<Almasad> almasads, Context context) {
        this.almasads = almasads;
        this.context = context;
    }

    class quranText111Holder extends RecyclerView.ViewHolder {
        TextView textViewText111;
        LinearLayout linearLayout;

        public quranText111Holder(@NonNull View itemView) {
            super(itemView);
            textViewText111 = itemView.findViewById(R.id.text111_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_111);
        }
    }

    @NonNull
    @Override
    public quranText111Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_111_item, parent , false);
        return new quranText111Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText111Holder holder, int position) {
        Almasad almasad = almasads.get(position);
        holder.textViewText111.setText(almasad.getAyat());


    }

    @Override
    public int getItemCount() {
        return almasads.size();
    }


}


