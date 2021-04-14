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

public class quran_text_96_adapter extends RecyclerView.Adapter<quran_text_96_adapter.quranText96Holder> {

    ArrayList<Alalaq> alalaqs ;
    Context context ;

    public quran_text_96_adapter(ArrayList<Alalaq> alalaqs, Context context) {
        this.alalaqs = alalaqs;
        this.context = context;
    }

    class quranText96Holder extends RecyclerView.ViewHolder {
        TextView textViewText96;
        LinearLayout linearLayout;

        public quranText96Holder(@NonNull View itemView) {
            super(itemView);
            textViewText96 = itemView.findViewById(R.id.text96_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_96);
        }
    }

    @NonNull
    @Override
    public quranText96Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_96_item, parent , false);
        return new quranText96Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText96Holder holder, int position) {
        Alalaq alalaq = alalaqs.get(position);
        holder.textViewText96.setText(alalaq.getAyat());


    }

    @Override
    public int getItemCount() {
        return alalaqs.size();
    }


}


