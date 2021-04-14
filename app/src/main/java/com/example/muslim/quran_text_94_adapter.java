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

public class quran_text_94_adapter extends RecyclerView.Adapter<quran_text_94_adapter.quranText94Holder> {

    ArrayList<Alsharh> alsharhs ;
    Context context ;

    public quran_text_94_adapter(ArrayList<Alsharh> alsharhs, Context context) {
        this.alsharhs = alsharhs;
        this.context = context;
    }

    class quranText94Holder extends RecyclerView.ViewHolder {
        TextView textViewText94;
        LinearLayout linearLayout;

        public quranText94Holder(@NonNull View itemView) {
            super(itemView);
            textViewText94 = itemView.findViewById(R.id.text94_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_94);
        }
    }

    @NonNull
    @Override
    public quranText94Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_94_item, parent , false);
        return new quranText94Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText94Holder holder, int position) {
        Alsharh alsharh = alsharhs.get(position);
        holder.textViewText94.setText(alsharh.getAyat());


    }

    @Override
    public int getItemCount() {
        return alsharhs.size();
    }


}


