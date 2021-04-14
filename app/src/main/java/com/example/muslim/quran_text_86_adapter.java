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

public class quran_text_86_adapter extends RecyclerView.Adapter<quran_text_86_adapter.quranText86Holder> {

    ArrayList<Altarek> altareks ;
    Context context ;

    public quran_text_86_adapter(ArrayList<Altarek> altareks, Context context) {
        this.altareks = altareks;
        this.context = context;
    }

    class quranText86Holder extends RecyclerView.ViewHolder {
        TextView textViewText86;
        LinearLayout linearLayout;

        public quranText86Holder(@NonNull View itemView) {
            super(itemView);
            textViewText86 = itemView.findViewById(R.id.text86_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_86);
        }
    }

    @NonNull
    @Override
    public quranText86Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_86_item, parent , false);
        return new quranText86Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText86Holder holder, int position) {
        Altarek altarek = altareks.get(position);
        holder.textViewText86.setText(altarek.getAyat());


    }

    @Override
    public int getItemCount() {
        return altareks.size();
    }


}


