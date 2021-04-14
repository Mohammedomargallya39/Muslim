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

public class quran_text_7_adapter extends RecyclerView.Adapter<quran_text_7_adapter.quranText7Holder> {

    ArrayList<Alaaraf> alaarafs ;
    Context context ;

    public quran_text_7_adapter(ArrayList<Alaaraf> alaarafs, Context context) {
        this.alaarafs = alaarafs;
        this.context = context;
    }

    class quranText7Holder extends RecyclerView.ViewHolder {
        TextView textViewText7;
        LinearLayout linearLayout;

        public quranText7Holder(@NonNull View itemView) {
            super(itemView);
            textViewText7 = itemView.findViewById(R.id.text7_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_7);
        }
    }

    @NonNull
    @Override
    public quranText7Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_7_item, parent , false);
        return new quranText7Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText7Holder holder, int position) {
        Alaaraf alaaraf = alaarafs.get(position);
        holder.textViewText7.setText(alaaraf.getAyat());


    }

    @Override
    public int getItemCount() {
        return alaarafs.size();
    }


}


