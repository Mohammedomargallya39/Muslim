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

public class quran_text_80_adapter extends RecyclerView.Adapter<quran_text_80_adapter.quranText80Holder> {

    ArrayList<Abasa> abasas ;
    Context context ;

    public quran_text_80_adapter(ArrayList<Abasa> abasas, Context context) {
        this.abasas = abasas;
        this.context = context;
    }

    class quranText80Holder extends RecyclerView.ViewHolder {
        TextView textViewText80;
        LinearLayout linearLayout;

        public quranText80Holder(@NonNull View itemView) {
            super(itemView);
            textViewText80 = itemView.findViewById(R.id.text80_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_80);
        }
    }

    @NonNull
    @Override
    public quranText80Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_80_item, parent , false);
        return new quranText80Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText80Holder holder, int position) {
        Abasa abasa = abasas.get(position);
        holder.textViewText80.setText(abasa.getAyat());


    }

    @Override
    public int getItemCount() {
        return abasas.size();
    }


}


