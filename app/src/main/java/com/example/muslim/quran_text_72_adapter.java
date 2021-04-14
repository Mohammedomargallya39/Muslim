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

public class quran_text_72_adapter extends RecyclerView.Adapter<quran_text_72_adapter.quranText72Holder> {

    ArrayList<Algen> algens ;
    Context context ;

    public quran_text_72_adapter(ArrayList<Algen> algens, Context context) {
        this.algens = algens;
        this.context = context;
    }

    class quranText72Holder extends RecyclerView.ViewHolder {
        TextView textViewText72;
        LinearLayout linearLayout;

        public quranText72Holder(@NonNull View itemView) {
            super(itemView);
            textViewText72 = itemView.findViewById(R.id.text72_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_72);
        }
    }

    @NonNull
    @Override
    public quranText72Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_72_item, parent , false);
        return new quranText72Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText72Holder holder, int position) {
        Algen algen = algens.get(position);
        holder.textViewText72.setText(algen.getAyat());


    }

    @Override
    public int getItemCount() {
        return algens.size();
    }


}


