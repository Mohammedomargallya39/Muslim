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

public class quran_text_2_adapter extends RecyclerView.Adapter<quran_text_2_adapter.quranText2Holder> {

    ArrayList<Elbqra> elbqras;
    Context context ;

    public quran_text_2_adapter(ArrayList<Elbqra> elbqras, Context context) {
        this.elbqras = elbqras;
        this.context = context;
    }

    class quranText2Holder extends RecyclerView.ViewHolder {
        TextView textViewText2;
        LinearLayout linearLayout;

        public quranText2Holder(@NonNull View itemView) {
            super(itemView);
            textViewText2 = itemView.findViewById(R.id.text2_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_2);
        }
    }

    @NonNull
    @Override
    public quranText2Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_2_item, parent , false);
        return new quranText2Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText2Holder holder, int position) {
        Elbqra elbqra = elbqras.get(position);
        holder.textViewText2.setText(elbqra.getAyat());


    }

    @Override
    public int getItemCount() {
        return elbqras.size();
    }


}


