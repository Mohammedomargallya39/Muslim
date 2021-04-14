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

public class quran_text_19_adapter extends RecyclerView.Adapter<quran_text_19_adapter.quranText19Holder> {

    ArrayList<Mariam> mariams ;
    Context context ;

    public quran_text_19_adapter(ArrayList<Mariam> mariams, Context context) {
        this.mariams = mariams;
        this.context = context;
    }

    class quranText19Holder extends RecyclerView.ViewHolder {
        TextView textViewText19;
        LinearLayout linearLayout;

        public quranText19Holder(@NonNull View itemView) {
            super(itemView);
            textViewText19 = itemView.findViewById(R.id.text19_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_19);
        }
    }

    @NonNull
    @Override
    public quranText19Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_19_item, parent , false);
        return new quranText19Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText19Holder holder, int position) {
        Mariam mariam = mariams.get(position);
        holder.textViewText19.setText(mariam.getAyat());


    }

    @Override
    public int getItemCount() {
        return mariams.size();
    }


}


