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

public class quran_text_85_adapter extends RecyclerView.Adapter<quran_text_85_adapter.quranText85Holder> {

    ArrayList<Alborog> alborogs ;
    Context context ;

    public quran_text_85_adapter(ArrayList<Alborog> alborogs, Context context) {
        this.alborogs = alborogs;
        this.context = context;
    }

    class quranText85Holder extends RecyclerView.ViewHolder {
        TextView textViewText85;
        LinearLayout linearLayout;

        public quranText85Holder(@NonNull View itemView) {
            super(itemView);
            textViewText85 = itemView.findViewById(R.id.text85_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_85);
        }
    }

    @NonNull
    @Override
    public quranText85Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_85_item, parent , false);
        return new quranText85Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText85Holder holder, int position) {
        Alborog alborog = alborogs.get(position);
        holder.textViewText85.setText(alborog.getAyat());


    }

    @Override
    public int getItemCount() {
        return alborogs.size();
    }


}


