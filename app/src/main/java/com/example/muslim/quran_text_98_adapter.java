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

public class quran_text_98_adapter extends RecyclerView.Adapter<quran_text_98_adapter.quranText98Holder> {

    ArrayList<Albaiena> albaienas ;
    Context context ;

    public quran_text_98_adapter(ArrayList<Albaiena> albaienas, Context context) {
        this.albaienas = albaienas;
        this.context = context;
    }

    class quranText98Holder extends RecyclerView.ViewHolder {
        TextView textViewText98;
        LinearLayout linearLayout;

        public quranText98Holder(@NonNull View itemView) {
            super(itemView);
            textViewText98 = itemView.findViewById(R.id.text98_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_98);
        }
    }

    @NonNull
    @Override
    public quranText98Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_98_item, parent , false);
        return new quranText98Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText98Holder holder, int position) {
        Albaiena albaiena = albaienas.get(position);
        holder.textViewText98.setText(albaiena.getAyat());


    }

    @Override
    public int getItemCount() {
        return albaienas.size();
    }


}


