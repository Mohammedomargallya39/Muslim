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

public class quran_text_51_adapter extends RecyclerView.Adapter<quran_text_51_adapter.quranText51Holder> {

    ArrayList<Alzoriat> alzoriats ;
    Context context ;

    public quran_text_51_adapter(ArrayList<Alzoriat> alzoriats, Context context) {
        this.alzoriats = alzoriats;
        this.context = context;
    }

    class quranText51Holder extends RecyclerView.ViewHolder {
        TextView textViewText51;
        LinearLayout linearLayout;

        public quranText51Holder(@NonNull View itemView) {
            super(itemView);
            textViewText51 = itemView.findViewById(R.id.text51_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_51);
        }
    }

    @NonNull
    @Override
    public quranText51Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_51_item, parent , false);
        return new quranText51Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText51Holder holder, int position) {
        Alzoriat alzoriat = alzoriats.get(position);
        holder.textViewText51.setText(alzoriat.getAyat());


    }

    @Override
    public int getItemCount() {
        return alzoriats.size();
    }


}


