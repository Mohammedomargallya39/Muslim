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

public class quran_text_97_adapter extends RecyclerView.Adapter<quran_text_97_adapter.quranText97Holder> {

    ArrayList<Alqadr> alqadrs ;
    Context context ;

    public quran_text_97_adapter(ArrayList<Alqadr> alqadrs, Context context) {
        this.alqadrs = alqadrs;
        this.context = context;
    }

    class quranText97Holder extends RecyclerView.ViewHolder {
        TextView textViewText97;
        LinearLayout linearLayout;

        public quranText97Holder(@NonNull View itemView) {
            super(itemView);
            textViewText97 = itemView.findViewById(R.id.text97_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_97);
        }
    }

    @NonNull
    @Override
    public quranText97Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_97_item, parent , false);
        return new quranText97Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText97Holder holder, int position) {
        Alqadr alqadr = alqadrs.get(position);
        holder.textViewText97.setText(alqadr.getAyat());


    }

    @Override
    public int getItemCount() {
        return alqadrs.size();
    }


}


