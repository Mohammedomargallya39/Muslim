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

public class quran_text_78_adapter extends RecyclerView.Adapter<quran_text_78_adapter.quranText78Holder> {

    ArrayList<Alnabaa> alnabaas ;
    Context context ;

    public quran_text_78_adapter(ArrayList<Alnabaa> alnabaas, Context context) {
        this.alnabaas = alnabaas;
        this.context = context;
    }

    class quranText78Holder extends RecyclerView.ViewHolder {
        TextView textViewText78;
        LinearLayout linearLayout;

        public quranText78Holder(@NonNull View itemView) {
            super(itemView);
            textViewText78 = itemView.findViewById(R.id.text78_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_78);
        }
    }

    @NonNull
    @Override
    public quranText78Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_78_item, parent , false);
        return new quranText78Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText78Holder holder, int position) {
        Alnabaa alnabaa = alnabaas.get(position);
        holder.textViewText78.setText(alnabaa.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnabaas.size();
    }


}


