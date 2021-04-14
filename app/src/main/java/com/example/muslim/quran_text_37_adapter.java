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

public class quran_text_37_adapter extends RecyclerView.Adapter<quran_text_37_adapter.quranText37Holder> {

    ArrayList<Alsafat> alsafats ;
    Context context ;

    public quran_text_37_adapter(ArrayList<Alsafat> alsafats, Context context) {
        this.alsafats = alsafats;
        this.context = context;
    }

    class quranText37Holder extends RecyclerView.ViewHolder {
        TextView textViewText37;
        LinearLayout linearLayout;

        public quranText37Holder(@NonNull View itemView) {
            super(itemView);
            textViewText37 = itemView.findViewById(R.id.text37_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_37);
        }
    }

    @NonNull
    @Override
    public quranText37Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_37_item, parent , false);
        return new quranText37Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText37Holder holder, int position) {
        Alsafat alsafat = alsafats.get(position);
        holder.textViewText37.setText(alsafat.getAyat());


    }

    @Override
    public int getItemCount() {
        return alsafats.size();
    }


}


