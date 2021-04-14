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

public class quran_text_17_adapter extends RecyclerView.Adapter<quran_text_17_adapter.quranText17Holder> {

    ArrayList<Alesraa> alesraas ;
    Context context ;

    public quran_text_17_adapter(ArrayList<Alesraa> alesraas, Context context) {
        this.alesraas = alesraas;
        this.context = context;
    }

    class quranText17Holder extends RecyclerView.ViewHolder {
        TextView textViewText17;
        LinearLayout linearLayout;

        public quranText17Holder(@NonNull View itemView) {
            super(itemView);
            textViewText17 = itemView.findViewById(R.id.text17_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_17);
        }
    }

    @NonNull
    @Override
    public quranText17Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_17_item, parent , false);
        return new quranText17Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText17Holder holder, int position) {
        Alesraa alesraa = alesraas.get(position);
        holder.textViewText17.setText(alesraa.getAyat());


    }

    @Override
    public int getItemCount() {
        return alesraas.size();
    }


}


