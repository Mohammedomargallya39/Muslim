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

public class quran_text_4_adapter extends RecyclerView.Adapter<quran_text_4_adapter.quranText4Holder> {

    ArrayList<Elnesaa> elnesaas;
    Context context ;

    public quran_text_4_adapter(ArrayList<Elnesaa> elnesaas, Context context) {
        this.elnesaas = elnesaas;
        this.context = context;
    }

    class quranText4Holder extends RecyclerView.ViewHolder {
        TextView textViewText4;
        LinearLayout linearLayout;

        public quranText4Holder(@NonNull View itemView) {
            super(itemView);
            textViewText4 = itemView.findViewById(R.id.text4_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_4);
        }
    }

    @NonNull
    @Override
    public quranText4Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_4_item, parent , false);
        return new quranText4Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText4Holder holder, int position) {
        Elnesaa elnesaa = elnesaas.get(position);
        holder.textViewText4.setText(elnesaa.getAyat());


    }

    @Override
    public int getItemCount() {
        return elnesaas.size();
    }


}


