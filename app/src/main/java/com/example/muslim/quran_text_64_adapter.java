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

public class quran_text_64_adapter extends RecyclerView.Adapter<quran_text_64_adapter.quranText64Holder> {

    ArrayList<Altghabon> altghabons ;
    Context context ;

    public quran_text_64_adapter(ArrayList<Altghabon> altghabons, Context context) {
        this.altghabons = altghabons;
        this.context = context;
    }

    class quranText64Holder extends RecyclerView.ViewHolder {
        TextView textViewText64;
        LinearLayout linearLayout;

        public quranText64Holder(@NonNull View itemView) {
            super(itemView);
            textViewText64 = itemView.findViewById(R.id.text64_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_64);
        }
    }

    @NonNull
    @Override
    public quranText64Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_64_item, parent , false);
        return new quranText64Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText64Holder holder, int position) {
        Altghabon altghabon = altghabons.get(position);
        holder.textViewText64.setText(altghabon.getAyat());


    }

    @Override
    public int getItemCount() {
        return altghabons.size();
    }


}


