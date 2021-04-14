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

public class quran_text_104_adapter extends RecyclerView.Adapter<quran_text_104_adapter.quranText104Holder> {

    ArrayList<Alhomza> alhomzas ;
    Context context ;

    public quran_text_104_adapter(ArrayList<Alhomza> alhomzas, Context context) {
        this.alhomzas = alhomzas;
        this.context = context;
    }

    class quranText104Holder extends RecyclerView.ViewHolder {
        TextView textViewText104;
        LinearLayout linearLayout;

        public quranText104Holder(@NonNull View itemView) {
            super(itemView);
            textViewText104 = itemView.findViewById(R.id.text104_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_104);
        }
    }

    @NonNull
    @Override
    public quranText104Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_104_item, parent , false);
        return new quranText104Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText104Holder holder, int position) {
        Alhomza alhomza = alhomzas.get(position);
        holder.textViewText104.setText(alhomza.getAyat());


    }

    @Override
    public int getItemCount() {
        return alhomzas.size();
    }


}


