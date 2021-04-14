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

public class quran_text_74_adapter extends RecyclerView.Adapter<quran_text_74_adapter.quranText74Holder> {

    ArrayList<Almodather> almodathers ;
    Context context ;

    public quran_text_74_adapter(ArrayList<Almodather> almodathers, Context context) {
        this.almodathers = almodathers;
        this.context = context;
    }

    class quranText74Holder extends RecyclerView.ViewHolder {
        TextView textViewText74;
        LinearLayout linearLayout;

        public quranText74Holder(@NonNull View itemView) {
            super(itemView);
            textViewText74 = itemView.findViewById(R.id.text74_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_74);
        }
    }

    @NonNull
    @Override
    public quranText74Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_74_item, parent , false);
        return new quranText74Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText74Holder holder, int position) {
        Almodather almodather = almodathers.get(position);
        holder.textViewText74.setText(almodather.getAyat());


    }

    @Override
    public int getItemCount() {
        return almodathers.size();
    }


}


