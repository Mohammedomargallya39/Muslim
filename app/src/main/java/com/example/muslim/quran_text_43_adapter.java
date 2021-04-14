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

public class quran_text_43_adapter extends RecyclerView.Adapter<quran_text_43_adapter.quranText43Holder> {

    ArrayList<Alzokhrof> alzokhrofs;
    Context context ;

    public quran_text_43_adapter(ArrayList<Alzokhrof> alzokhrofs, Context context) {
        this.alzokhrofs = alzokhrofs;
        this.context = context;
    }

    class quranText43Holder extends RecyclerView.ViewHolder {
        TextView textViewText43;
        LinearLayout linearLayout;

        public quranText43Holder(@NonNull View itemView) {
            super(itemView);
            textViewText43 = itemView.findViewById(R.id.text43_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_43);
        }
    }

    @NonNull
    @Override
    public quranText43Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_43_item, parent , false);
        return new quranText43Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText43Holder holder, int position) {
        Alzokhrof alzokhrof = alzokhrofs.get(position);
        holder.textViewText43.setText(alzokhrof.getAyat());


    }

    @Override
    public int getItemCount() {
        return alzokhrofs.size();
    }


}


