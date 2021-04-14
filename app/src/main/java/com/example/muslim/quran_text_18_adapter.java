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

public class quran_text_18_adapter extends RecyclerView.Adapter<quran_text_18_adapter.quranText18Holder> {

    ArrayList<Elkahf> elkahfs ;
    Context context ;

    public quran_text_18_adapter(ArrayList<Elkahf> elkahfs, Context context) {
        this.elkahfs = elkahfs;
        this.context = context;
    }

    class quranText18Holder extends RecyclerView.ViewHolder {
        TextView textViewText18;
        LinearLayout linearLayout;

        public quranText18Holder(@NonNull View itemView) {
            super(itemView);
            textViewText18 = itemView.findViewById(R.id.text18_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_18);
        }
    }

    @NonNull
    @Override
    public quranText18Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_18_item, parent , false);
        return new quranText18Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText18Holder holder, int position) {
        Elkahf elkahf = elkahfs.get(position);
        holder.textViewText18.setText(elkahf.getAyat());


    }

    @Override
    public int getItemCount() {
        return elkahfs.size();
    }


}


