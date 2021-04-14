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

public class quran_text_87_adapter extends RecyclerView.Adapter<quran_text_87_adapter.quranText87Holder> {

    ArrayList<Alaala> alaalas ;
    Context context ;

    public quran_text_87_adapter(ArrayList<Alaala> alaalas, Context context) {
        this.alaalas = alaalas;
        this.context = context;
    }

    class quranText87Holder extends RecyclerView.ViewHolder {
        TextView textViewText87;
        LinearLayout linearLayout;

        public quranText87Holder(@NonNull View itemView) {
            super(itemView);
            textViewText87 = itemView.findViewById(R.id.text87_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_87);
        }
    }

    @NonNull
    @Override
    public quranText87Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_87_item, parent , false);
        return new quranText87Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText87Holder holder, int position) {
        Alaala alaala = alaalas.get(position);
        holder.textViewText87.setText(alaala.getAyat());


    }

    @Override
    public int getItemCount() {
        return alaalas.size();
    }


}


