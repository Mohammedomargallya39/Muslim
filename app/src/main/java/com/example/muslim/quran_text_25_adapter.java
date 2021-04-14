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

public class quran_text_25_adapter extends RecyclerView.Adapter<quran_text_25_adapter.quranText25Holder> {

    ArrayList<Alfourqan> alfourqans ;
    Context context ;

    public quran_text_25_adapter(ArrayList<Alfourqan> alfourqans, Context context) {
        this.alfourqans = alfourqans;
        this.context = context;
    }

    class quranText25Holder extends RecyclerView.ViewHolder {
        TextView textViewText25;
        LinearLayout linearLayout;

        public quranText25Holder(@NonNull View itemView) {
            super(itemView);
            textViewText25 = itemView.findViewById(R.id.text25_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_25);
        }
    }

    @NonNull
    @Override
    public quranText25Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_25_item, parent , false);
        return new quranText25Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText25Holder holder, int position) {
        Alfourqan alfourqan = alfourqans.get(position);
        holder.textViewText25.setText(alfourqan.getAyat());


    }

    @Override
    public int getItemCount() {
        return alfourqans.size();
    }


}


