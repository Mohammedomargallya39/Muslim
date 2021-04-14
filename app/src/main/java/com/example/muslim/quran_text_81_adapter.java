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

public class quran_text_81_adapter extends RecyclerView.Adapter<quran_text_81_adapter.quranText81Holder> {

    ArrayList<Altakwer> altakwers ;
    Context context ;

    public quran_text_81_adapter(ArrayList<Altakwer> altakwers, Context context) {
        this.altakwers = altakwers;
        this.context = context;
    }

    class quranText81Holder extends RecyclerView.ViewHolder {
        TextView textViewText81;
        LinearLayout linearLayout;

        public quranText81Holder(@NonNull View itemView) {
            super(itemView);
            textViewText81 = itemView.findViewById(R.id.text81_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_81);
        }
    }

    @NonNull
    @Override
    public quranText81Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_81_item, parent , false);
        return new quranText81Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText81Holder holder, int position) {
        Altakwer altakwer = altakwers.get(position);
        holder.textViewText81.setText(altakwer.getAyat());


    }

    @Override
    public int getItemCount() {
        return altakwers.size();
    }


}


