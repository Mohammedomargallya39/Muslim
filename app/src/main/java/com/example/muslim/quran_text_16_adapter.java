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

public class quran_text_16_adapter extends RecyclerView.Adapter<quran_text_16_adapter.quranText16Holder> {

    ArrayList<Alnahl> alnahls ;
    Context context ;

    public quran_text_16_adapter(ArrayList<Alnahl> alnahls, Context context) {
        this.alnahls = alnahls;
        this.context = context;
    }

    class quranText16Holder extends RecyclerView.ViewHolder {
        TextView textViewText16;
        LinearLayout linearLayout;

        public quranText16Holder(@NonNull View itemView) {
            super(itemView);
            textViewText16 = itemView.findViewById(R.id.text16_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_16);
        }
    }

    @NonNull
    @Override
    public quranText16Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_16_item, parent , false);
        return new quranText16Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText16Holder holder, int position) {
        Alnahl alnahl = alnahls.get(position);
        holder.textViewText16.setText(alnahl.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnahls.size();
    }


}


