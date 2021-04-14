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

public class quran_text_69_adapter extends RecyclerView.Adapter<quran_text_69_adapter.quranText69Holder> {

    ArrayList<Alhaqah> alhaqahs ;
    Context context ;

    public quran_text_69_adapter(ArrayList<Alhaqah> alhaqahs, Context context) {
        this.alhaqahs = alhaqahs;
        this.context = context;
    }

    class quranText69Holder extends RecyclerView.ViewHolder {
        TextView textViewText69;
        LinearLayout linearLayout;

        public quranText69Holder(@NonNull View itemView) {
            super(itemView);
            textViewText69 = itemView.findViewById(R.id.text69_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_69);
        }
    }

    @NonNull
    @Override
    public quranText69Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_69_item, parent , false);
        return new quranText69Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText69Holder holder, int position) {
        Alhaqah alhaqah = alhaqahs.get(position);
        holder.textViewText69.setText(alhaqah.getAyat());


    }

    @Override
    public int getItemCount() {
        return alhaqahs.size();
    }


}


