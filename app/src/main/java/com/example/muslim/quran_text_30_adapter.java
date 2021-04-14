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

public class quran_text_30_adapter extends RecyclerView.Adapter<quran_text_30_adapter.quranText30Holder> {

    ArrayList<Alroom> alrooms ;
    Context context ;

    public quran_text_30_adapter(ArrayList<Alroom> alrooms, Context context) {
        this.alrooms = alrooms;
        this.context = context;
    }

    class quranText30Holder extends RecyclerView.ViewHolder {
        TextView textViewText30;
        LinearLayout linearLayout;

        public quranText30Holder(@NonNull View itemView) {
            super(itemView);
            textViewText30 = itemView.findViewById(R.id.text30_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_30);
        }
    }

    @NonNull
    @Override
    public quranText30Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_30_item, parent , false);
        return new quranText30Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText30Holder holder, int position) {
        Alroom alroom = alrooms.get(position);
        holder.textViewText30.setText(alroom.getAyat());


    }

    @Override
    public int getItemCount() {
        return alrooms.size();
    }


}


