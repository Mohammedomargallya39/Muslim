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

public class quran_text_93_adapter extends RecyclerView.Adapter<quran_text_93_adapter.quranText93Holder> {

    ArrayList<Aldoha> aldohas ;
    Context context ;

    public quran_text_93_adapter(ArrayList<Aldoha> aldohas, Context context) {
        this.aldohas = aldohas;
        this.context = context;
    }

    class quranText93Holder extends RecyclerView.ViewHolder {
        TextView textViewText93;
        LinearLayout linearLayout;

        public quranText93Holder(@NonNull View itemView) {
            super(itemView);
            textViewText93 = itemView.findViewById(R.id.text93_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_93);
        }
    }

    @NonNull
    @Override
    public quranText93Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_93_item, parent , false);
        return new quranText93Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText93Holder holder, int position) {
        Aldoha aldoha = aldohas.get(position);
        holder.textViewText93.setText(aldoha.getAyat());


    }

    @Override
    public int getItemCount() {
        return aldohas.size();
    }


}


