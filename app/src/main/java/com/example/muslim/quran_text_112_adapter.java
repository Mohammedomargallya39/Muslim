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

public class quran_text_112_adapter extends RecyclerView.Adapter<quran_text_112_adapter.quranText112Holder> {

    ArrayList<Alekhlas> alekhlas ;
    Context context ;

    public quran_text_112_adapter(ArrayList<Alekhlas> alekhlas, Context context) {
        this.alekhlas = alekhlas;
        this.context = context;
    }

    class quranText112Holder extends RecyclerView.ViewHolder {
        TextView textViewText112;
        LinearLayout linearLayout;

        public quranText112Holder(@NonNull View itemView) {
            super(itemView);
            textViewText112 = itemView.findViewById(R.id.text112_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_112);
        }
    }

    @NonNull
    @Override
    public quranText112Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_112_item, parent , false);
        return new quranText112Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText112Holder holder, int position) {
        Alekhlas alekhla = alekhlas.get(position);
        holder.textViewText112.setText(alekhla.getAyat());


    }

    @Override
    public int getItemCount() {
        return alekhlas.size();
    }


}


