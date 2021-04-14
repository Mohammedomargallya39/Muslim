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

public class quran_text_35_adapter extends RecyclerView.Adapter<quran_text_35_adapter.quranText35Holder> {

    ArrayList<Fater> faters ;
    Context context ;

    public quran_text_35_adapter(ArrayList<Fater> faters, Context context) {
        this.faters = faters;
        this.context = context;
    }

    class quranText35Holder extends RecyclerView.ViewHolder {
        TextView textViewText35;
        LinearLayout linearLayout;

        public quranText35Holder(@NonNull View itemView) {
            super(itemView);
            textViewText35 = itemView.findViewById(R.id.text35_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_35);
        }
    }

    @NonNull
    @Override
    public quranText35Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_35_item, parent , false);
        return new quranText35Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText35Holder holder, int position) {
        Fater fater = faters.get(position);
        holder.textViewText35.setText(fater.getAyat());


    }

    @Override
    public int getItemCount() {
        return faters.size();
    }


}


