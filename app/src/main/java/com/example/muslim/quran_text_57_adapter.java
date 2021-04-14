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

public class quran_text_57_adapter extends RecyclerView.Adapter<quran_text_57_adapter.quranText57Holder> {

    ArrayList<Alhaded> alhadeds ;
    Context context ;

    public quran_text_57_adapter(ArrayList<Alhaded> alhadeds, Context context) {
        this.alhadeds = alhadeds;
        this.context = context;
    }

    class quranText57Holder extends RecyclerView.ViewHolder {
        TextView textViewText57;
        LinearLayout linearLayout;

        public quranText57Holder(@NonNull View itemView) {
            super(itemView);
            textViewText57 = itemView.findViewById(R.id.text57_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_57);
        }
    }

    @NonNull
    @Override
    public quranText57Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_57_item, parent , false);
        return new quranText57Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText57Holder holder, int position) {
        Alhaded alhaded = alhadeds.get(position);
        holder.textViewText57.setText(alhaded.getAyat());


    }

    @Override
    public int getItemCount() {
        return alhadeds.size();
    }


}


