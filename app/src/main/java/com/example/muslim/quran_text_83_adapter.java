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

public class quran_text_83_adapter extends RecyclerView.Adapter<quran_text_83_adapter.quranText83Holder> {

    ArrayList<Almotafefen> almotafefens ;
    Context context ;

    public quran_text_83_adapter(ArrayList<Almotafefen> almotafefens, Context context) {
        this.almotafefens = almotafefens;
        this.context = context;
    }

    class quranText83Holder extends RecyclerView.ViewHolder {
        TextView textViewText83;
        LinearLayout linearLayout;

        public quranText83Holder(@NonNull View itemView) {
            super(itemView);
            textViewText83 = itemView.findViewById(R.id.text83_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_83);
        }
    }

    @NonNull
    @Override
    public quranText83Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_83_item, parent , false);
        return new quranText83Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText83Holder holder, int position) {
        Almotafefen almotafefen = almotafefens.get(position);
        holder.textViewText83.setText(almotafefen.getAyat());


    }

    @Override
    public int getItemCount() {
        return almotafefens.size();
    }


}


