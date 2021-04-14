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

public class quran_text_108_adapter extends RecyclerView.Adapter<quran_text_108_adapter.quranText108Holder> {

    ArrayList<Alkaouther> alkaouthers ;
    Context context ;

    public quran_text_108_adapter(ArrayList<Alkaouther> alkaouthers, Context context) {
        this.alkaouthers = alkaouthers;
        this.context = context;
    }

    class quranText108Holder extends RecyclerView.ViewHolder {
        TextView textViewText108;
        LinearLayout linearLayout;

        public quranText108Holder(@NonNull View itemView) {
            super(itemView);
            textViewText108 = itemView.findViewById(R.id.text108_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_108);
        }
    }

    @NonNull
    @Override
    public quranText108Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_108_item, parent , false);
        return new quranText108Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText108Holder holder, int position) {
        Alkaouther alkaouther = alkaouthers.get(position);
        holder.textViewText108.setText(alkaouther.getAyat());


    }

    @Override
    public int getItemCount() {
        return alkaouthers.size();
    }


}


