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

public class quran_text_36_adapter extends RecyclerView.Adapter<quran_text_36_adapter.quranText36Holder> {

    ArrayList<Yacen> yacens ;
    Context context ;

    public quran_text_36_adapter(ArrayList<Yacen> yacens, Context context) {
        this.yacens = yacens;
        this.context = context;
    }

    class quranText36Holder extends RecyclerView.ViewHolder {
        TextView textViewText36;
        LinearLayout linearLayout;

        public quranText36Holder(@NonNull View itemView) {
            super(itemView);
            textViewText36 = itemView.findViewById(R.id.text36_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_36);
        }
    }

    @NonNull
    @Override
    public quranText36Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_36_item, parent , false);
        return new quranText36Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText36Holder holder, int position) {
        Yacen yacen = yacens.get(position);
        holder.textViewText36.setText(yacen.getAyat());


    }

    @Override
    public int getItemCount() {
        return yacens.size();
    }


}


