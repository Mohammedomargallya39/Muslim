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

public class quran_text_107_adapter extends RecyclerView.Adapter<quran_text_107_adapter.quranText107Holder> {

    ArrayList<Almaaon> almaaons ;
    Context context ;

    public quran_text_107_adapter(ArrayList<Almaaon> almaaons, Context context) {
        this.almaaons = almaaons;
        this.context = context;
    }

    class quranText107Holder extends RecyclerView.ViewHolder {
        TextView textViewText107;
        LinearLayout linearLayout;

        public quranText107Holder(@NonNull View itemView) {
            super(itemView);
            textViewText107 = itemView.findViewById(R.id.text107_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_107);
        }
    }

    @NonNull
    @Override
    public quranText107Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_107_item, parent , false);
        return new quranText107Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText107Holder holder, int position) {
        Almaaon almaaon = almaaons.get(position);
        holder.textViewText107.setText(almaaon.getAyat());


    }

    @Override
    public int getItemCount() {
        return almaaons.size();
    }


}


