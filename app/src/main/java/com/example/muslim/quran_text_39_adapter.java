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

public class quran_text_39_adapter extends RecyclerView.Adapter<quran_text_39_adapter.quranText39Holder> {

    ArrayList<Alzomr> alzomrs ;
    Context context ;

    public quran_text_39_adapter(ArrayList<Alzomr> alzomrs, Context context) {
        this.alzomrs = alzomrs;
        this.context = context;
    }

    class quranText39Holder extends RecyclerView.ViewHolder {
        TextView textViewText39;
        LinearLayout linearLayout;

        public quranText39Holder(@NonNull View itemView) {
            super(itemView);
            textViewText39 = itemView.findViewById(R.id.text39_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_39);
        }
    }

    @NonNull
    @Override
    public quranText39Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_39_item, parent , false);
        return new quranText39Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText39Holder holder, int position) {
        Alzomr alzomr = alzomrs.get(position);
        holder.textViewText39.setText(alzomr.getAyat());


    }

    @Override
    public int getItemCount() {
        return alzomrs.size();
    }


}


