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

public class quran_text_54_adapter extends RecyclerView.Adapter<quran_text_54_adapter.quranText54Holder> {

    ArrayList<Alqamr> alqamrs ;
    Context context ;

    public quran_text_54_adapter(ArrayList<Alqamr> alqamrs, Context context) {
        this.alqamrs = alqamrs;
        this.context = context;
    }

    class quranText54Holder extends RecyclerView.ViewHolder {
        TextView textViewText54;
        LinearLayout linearLayout;

        public quranText54Holder(@NonNull View itemView) {
            super(itemView);
            textViewText54 = itemView.findViewById(R.id.text54_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_54);
        }
    }

    @NonNull
    @Override
    public quranText54Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_54_item, parent , false);
        return new quranText54Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText54Holder holder, int position) {
        Alqamr alqamr = alqamrs.get(position);
        holder.textViewText54.setText(alqamr.getAyat());


    }

    @Override
    public int getItemCount() {
        return alqamrs.size();
    }


}


