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

public class quran_text_10_adapter extends RecyclerView.Adapter<quran_text_10_adapter.quranText10Holder> {

    ArrayList<Younes> younes ;
    Context context ;

    public quran_text_10_adapter(ArrayList<Younes> younes, Context context) {
        this.younes = younes;
        this.context = context;
    }

    class quranText10Holder extends RecyclerView.ViewHolder {
        TextView textViewText10;
        LinearLayout linearLayout;

        public quranText10Holder(@NonNull View itemView) {
            super(itemView);
            textViewText10 = itemView.findViewById(R.id.text10_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_10);
        }
    }

    @NonNull
    @Override
    public quranText10Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_10_item, parent , false);
        return new quranText10Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText10Holder holder, int position) {
        Younes youne = younes.get(position);
        holder.textViewText10.setText(youne.getAyat());


    }

    @Override
    public int getItemCount() {
        return younes.size();
    }


}


