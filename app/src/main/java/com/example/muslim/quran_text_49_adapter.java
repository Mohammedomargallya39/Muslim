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

public class quran_text_49_adapter extends RecyclerView.Adapter<quran_text_49_adapter.quranText49Holder> {

    ArrayList<Alhograt> alhograts;
    Context context ;

    public quran_text_49_adapter(ArrayList<Alhograt> alhograts, Context context) {
        this.alhograts = alhograts;
        this.context = context;
    }

    class quranText49Holder extends RecyclerView.ViewHolder {
        TextView textViewText49;
        LinearLayout linearLayout;

        public quranText49Holder(@NonNull View itemView) {
            super(itemView);
            textViewText49 = itemView.findViewById(R.id.text49_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_49);
        }
    }

    @NonNull
    @Override
    public quranText49Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_49_item, parent , false);
        return new quranText49Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText49Holder holder, int position) {
        Alhograt alhograt = alhograts.get(position);
        holder.textViewText49.setText(alhograt.getAyat());


    }

    @Override
    public int getItemCount() {
        return alhograts.size();
    }


}


