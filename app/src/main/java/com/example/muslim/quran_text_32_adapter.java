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

public class quran_text_32_adapter extends RecyclerView.Adapter<quran_text_32_adapter.quranText32Holder> {

    ArrayList<Alsagda> alsagdas ;
    Context context ;

    public quran_text_32_adapter(ArrayList<Alsagda> alsagdas, Context context) {
        this.alsagdas = alsagdas;
        this.context = context;
    }

    class quranText32Holder extends RecyclerView.ViewHolder {
        TextView textViewText32;
        LinearLayout linearLayout;

        public quranText32Holder(@NonNull View itemView) {
            super(itemView);
            textViewText32 = itemView.findViewById(R.id.text32_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_32);
        }
    }

    @NonNull
    @Override
    public quranText32Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_32_item, parent , false);
        return new quranText32Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText32Holder holder, int position) {
        Alsagda alsagda = alsagdas.get(position);
        holder.textViewText32.setText(alsagda.getAyat());


    }

    @Override
    public int getItemCount() {
        return alsagdas.size();
    }


}


