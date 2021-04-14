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

public class quran_text_106_adapter extends RecyclerView.Adapter<quran_text_106_adapter.quranText106Holder> {

    ArrayList<Qoraish> qoraishes ;
    Context context ;

    public quran_text_106_adapter(ArrayList<Qoraish> qoraishes, Context context) {
        this.qoraishes = qoraishes;
        this.context = context;
    }

    class quranText106Holder extends RecyclerView.ViewHolder {
        TextView textViewText106;
        LinearLayout linearLayout;

        public quranText106Holder(@NonNull View itemView) {
            super(itemView);
            textViewText106 = itemView.findViewById(R.id.text106_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_106);
        }
    }

    @NonNull
    @Override
    public quranText106Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_106_item, parent , false);
        return new quranText106Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText106Holder holder, int position) {
        Qoraish qoraishe = qoraishes.get(position);
        holder.textViewText106.setText(qoraishe.getAyat());


    }

    @Override
    public int getItemCount() {
        return qoraishes.size();
    }


}


