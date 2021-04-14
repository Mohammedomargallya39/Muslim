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

public class quran_text_109_adapter extends RecyclerView.Adapter<quran_text_109_adapter.quranText109Holder> {

    ArrayList<Alkaferon> alkaferons ;
    Context context ;

    public quran_text_109_adapter(ArrayList<Alkaferon> alkaferons, Context context) {
        this.alkaferons = alkaferons;
        this.context = context;
    }

    class quranText109Holder extends RecyclerView.ViewHolder {
        TextView textViewText109;
        LinearLayout linearLayout;

        public quranText109Holder(@NonNull View itemView) {
            super(itemView);
            textViewText109 = itemView.findViewById(R.id.text109_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_109);
        }
    }

    @NonNull
    @Override
    public quranText109Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_109_item, parent , false);
        return new quranText109Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText109Holder holder, int position) {
        Alkaferon alkaferon = alkaferons.get(position);
        holder.textViewText109.setText(alkaferon.getAyat());


    }

    @Override
    public int getItemCount() {
        return alkaferons.size();
    }


}


