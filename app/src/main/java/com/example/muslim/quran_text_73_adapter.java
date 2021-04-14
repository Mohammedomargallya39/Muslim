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

public class quran_text_73_adapter extends RecyclerView.Adapter<quran_text_73_adapter.quranText73Holder> {

    ArrayList<Almozamel> almozamels ;
    Context context ;

    public quran_text_73_adapter(ArrayList<Almozamel> almozamels, Context context) {
        this.almozamels = almozamels;
        this.context = context;
    }

    class quranText73Holder extends RecyclerView.ViewHolder {
        TextView textViewText73;
        LinearLayout linearLayout;

        public quranText73Holder(@NonNull View itemView) {
            super(itemView);
            textViewText73 = itemView.findViewById(R.id.text73_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_73);
        }
    }

    @NonNull
    @Override
    public quranText73Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_73_item, parent , false);
        return new quranText73Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText73Holder holder, int position) {
        Almozamel almozamel = almozamels.get(position);
        holder.textViewText73.setText(almozamel.getAyat());


    }

    @Override
    public int getItemCount() {
        return almozamels.size();
    }


}


