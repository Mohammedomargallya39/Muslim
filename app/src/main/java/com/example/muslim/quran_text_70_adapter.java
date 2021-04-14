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

public class quran_text_70_adapter extends RecyclerView.Adapter<quran_text_70_adapter.quranText70Holder> {

    ArrayList<Almaareg> almaaregs ;
    Context context ;

    public quran_text_70_adapter(ArrayList<Almaareg> almaaregs, Context context) {
        this.almaaregs = almaaregs;
        this.context = context;
    }

    class quranText70Holder extends RecyclerView.ViewHolder {
        TextView textViewText70;
        LinearLayout linearLayout;

        public quranText70Holder(@NonNull View itemView) {
            super(itemView);
            textViewText70 = itemView.findViewById(R.id.text70_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_70);
        }
    }

    @NonNull
    @Override
    public quranText70Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_70_item, parent , false);
        return new quranText70Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText70Holder holder, int position) {
        Almaareg almaareg = almaaregs.get(position);
        holder.textViewText70.setText(almaareg.getAyat());


    }

    @Override
    public int getItemCount() {
        return almaaregs.size();
    }


}


