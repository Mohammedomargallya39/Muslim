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

public class quran_text_38_adapter extends RecyclerView.Adapter<quran_text_38_adapter.quranText38Holder> {

    ArrayList<Sad> sads ;
    Context context ;

    public quran_text_38_adapter(ArrayList<Sad> sads, Context context) {
        this.sads = sads;
        this.context = context;
    }

    class quranText38Holder extends RecyclerView.ViewHolder {
        TextView textViewText38;
        LinearLayout linearLayout;

        public quranText38Holder(@NonNull View itemView) {
            super(itemView);
            textViewText38 = itemView.findViewById(R.id.text38_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_38);
        }
    }

    @NonNull
    @Override
    public quranText38Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_38_item, parent , false);
        return new quranText38Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText38Holder holder, int position) {
        Sad sad = sads.get(position);
        holder.textViewText38.setText(sad.getAyat());


    }

    @Override
    public int getItemCount() {
        return sads.size();
    }


}


