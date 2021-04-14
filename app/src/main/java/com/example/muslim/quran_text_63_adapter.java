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

public class quran_text_63_adapter extends RecyclerView.Adapter<quran_text_63_adapter.quranText63Holder> {

    ArrayList<Almonafeqon> almonafeqons ;
    Context context ;

    public quran_text_63_adapter(ArrayList<Almonafeqon> almonafeqons, Context context) {
        this.almonafeqons = almonafeqons;
        this.context = context;
    }

    class quranText63Holder extends RecyclerView.ViewHolder {
        TextView textViewText63;
        LinearLayout linearLayout;

        public quranText63Holder(@NonNull View itemView) {
            super(itemView);
            textViewText63 = itemView.findViewById(R.id.text63_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_63);
        }
    }

    @NonNull
    @Override
    public quranText63Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_63_item, parent , false);
        return new quranText63Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText63Holder holder, int position) {
        Almonafeqon almonafeqon = almonafeqons.get(position);
        holder.textViewText63.setText(almonafeqon.getAyat());


    }

    @Override
    public int getItemCount() {
        return almonafeqons.size();
    }


}


