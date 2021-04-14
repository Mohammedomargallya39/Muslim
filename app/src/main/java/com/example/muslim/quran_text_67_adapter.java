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

public class quran_text_67_adapter extends RecyclerView.Adapter<quran_text_67_adapter.quranText67Holder> {

    ArrayList<Almlk> almlks ;
    Context context ;

    public quran_text_67_adapter(ArrayList<Almlk> almlks, Context context) {
        this.almlks = almlks;
        this.context = context;
    }

    class quranText67Holder extends RecyclerView.ViewHolder {
        TextView textViewText67;
        LinearLayout linearLayout;

        public quranText67Holder(@NonNull View itemView) {
            super(itemView);
            textViewText67 = itemView.findViewById(R.id.text67_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_67);
        }
    }

    @NonNull
    @Override
    public quranText67Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_67_item, parent , false);
        return new quranText67Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText67Holder holder, int position) {
        Almlk almlk = almlks.get(position);
        holder.textViewText67.setText(almlk.getAyat());


    }

    @Override
    public int getItemCount() {
        return almlks.size();
    }


}


