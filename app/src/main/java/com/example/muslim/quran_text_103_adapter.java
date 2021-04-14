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

public class quran_text_103_adapter extends RecyclerView.Adapter<quran_text_103_adapter.quranText103Holder> {

    ArrayList<Alaser> alasers ;
    Context context ;

    public quran_text_103_adapter(ArrayList<Alaser> alasers, Context context) {
        this.alasers = alasers;
        this.context = context;
    }

    class quranText103Holder extends RecyclerView.ViewHolder {
        TextView textViewText103;
        LinearLayout linearLayout;

        public quranText103Holder(@NonNull View itemView) {
            super(itemView);
            textViewText103 = itemView.findViewById(R.id.text103_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_103);
        }
    }

    @NonNull
    @Override
    public quranText103Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_103_item, parent , false);
        return new quranText103Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText103Holder holder, int position) {
        Alaser alaser = alasers.get(position);
        holder.textViewText103.setText(alaser.getAyat());


    }

    @Override
    public int getItemCount() {
        return alasers.size();
    }


}


