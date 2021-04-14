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

public class quran_text_20_adapter extends RecyclerView.Adapter<quran_text_20_adapter.quranText20Holder> {

    ArrayList<Taha> tahas ;
    Context context ;

    public quran_text_20_adapter(ArrayList<Taha> tahas, Context context) {
        this.tahas = tahas;
        this.context = context;
    }

    class quranText20Holder extends RecyclerView.ViewHolder {
        TextView textViewText20;
        LinearLayout linearLayout;

        public quranText20Holder(@NonNull View itemView) {
            super(itemView);
            textViewText20 = itemView.findViewById(R.id.text20_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_20);
        }
    }

    @NonNull
    @Override
    public quranText20Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_20_item, parent , false);
        return new quranText20Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText20Holder holder, int position) {
        Taha taha = tahas.get(position);
        holder.textViewText20.setText(taha.getAyat());


    }

    @Override
    public int getItemCount() {
        return tahas.size();
    }


}


