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

public class quran_text_99_adapter extends RecyclerView.Adapter<quran_text_99_adapter.quranText99Holder> {

    ArrayList<Alzelzala> alzelzalas ;
    Context context ;

    public quran_text_99_adapter(ArrayList<Alzelzala> alzelzalas, Context context) {
        this.alzelzalas = alzelzalas;
        this.context = context;
    }

    class quranText99Holder extends RecyclerView.ViewHolder {
        TextView textViewText99;
        LinearLayout linearLayout;

        public quranText99Holder(@NonNull View itemView) {
            super(itemView);
            textViewText99 = itemView.findViewById(R.id.text99_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_99);
        }
    }

    @NonNull
    @Override
    public quranText99Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_99_item, parent , false);
        return new quranText99Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText99Holder holder, int position) {
        Alzelzala alzelzala = alzelzalas.get(position);
        holder.textViewText99.setText(alzelzala.getAyat());


    }

    @Override
    public int getItemCount() {
        return alzelzalas.size();
    }


}


