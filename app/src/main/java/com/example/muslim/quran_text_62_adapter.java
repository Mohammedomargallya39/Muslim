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

public class quran_text_62_adapter extends RecyclerView.Adapter<quran_text_62_adapter.quranText62Holder> {

    ArrayList<Algomaa> algomaas ;
    Context context ;

    public quran_text_62_adapter(ArrayList<Algomaa> algomaas, Context context) {
        this.algomaas = algomaas;
        this.context = context;
    }

    class quranText62Holder extends RecyclerView.ViewHolder {
        TextView textViewText62;
        LinearLayout linearLayout;

        public quranText62Holder(@NonNull View itemView) {
            super(itemView);
            textViewText62 = itemView.findViewById(R.id.text62_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_62);
        }
    }

    @NonNull
    @Override
    public quranText62Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_62_item, parent , false);
        return new quranText62Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText62Holder holder, int position) {
        Algomaa algomaa = algomaas.get(position);
        holder.textViewText62.setText(algomaa.getAyat());


    }

    @Override
    public int getItemCount() {
        return algomaas.size();
    }


}


