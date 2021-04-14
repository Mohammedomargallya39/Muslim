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

public class quran_text_58_adapter extends RecyclerView.Adapter<quran_text_58_adapter.quranText58Holder> {

    ArrayList<Almogadala> almogadalas ;
    Context context ;

    public quran_text_58_adapter(ArrayList<Almogadala> almogadalas, Context context) {
        this.almogadalas = almogadalas;
        this.context = context;
    }

    class quranText58Holder extends RecyclerView.ViewHolder {
        TextView textViewText58;
        LinearLayout linearLayout;

        public quranText58Holder(@NonNull View itemView) {
            super(itemView);
            textViewText58 = itemView.findViewById(R.id.text58_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_58);
        }
    }

    @NonNull
    @Override
    public quranText58Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_58_item, parent , false);
        return new quranText58Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText58Holder holder, int position) {
        Almogadala almogadala = almogadalas.get(position);
        holder.textViewText58.setText(almogadala.getAyat());


    }

    @Override
    public int getItemCount() {
        return almogadalas.size();
    }


}


