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

public class quran_text_56_adapter extends RecyclerView.Adapter<quran_text_56_adapter.quranText56Holder> {

    ArrayList<Alwakeaa> alwakeaas ;
    Context context ;

    public quran_text_56_adapter(ArrayList<Alwakeaa> alwakeaas, Context context) {
        this.alwakeaas = alwakeaas;
        this.context = context;
    }

    class quranText56Holder extends RecyclerView.ViewHolder {
        TextView textViewText56;
        LinearLayout linearLayout;

        public quranText56Holder(@NonNull View itemView) {
            super(itemView);
            textViewText56 = itemView.findViewById(R.id.text56_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_56);
        }
    }

    @NonNull
    @Override
    public quranText56Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_56_item, parent , false);
        return new quranText56Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText56Holder holder, int position) {
        Alwakeaa alwakeaa = alwakeaas.get(position);
        holder.textViewText56.setText(alwakeaa.getAyat());


    }

    @Override
    public int getItemCount() {
        return alwakeaas.size();
    }


}


