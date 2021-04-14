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

public class quran_text_71_adapter extends RecyclerView.Adapter<quran_text_71_adapter.quranText71Holder> {

    ArrayList<Nouh> nouhs ;
    Context context ;

    public quran_text_71_adapter(ArrayList<Nouh> nouhs, Context context) {
        this.nouhs = nouhs;
        this.context = context;
    }

    class quranText71Holder extends RecyclerView.ViewHolder {
        TextView textViewText71;
        LinearLayout linearLayout;

        public quranText71Holder(@NonNull View itemView) {
            super(itemView);
            textViewText71 = itemView.findViewById(R.id.text71_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_71);
        }
    }

    @NonNull
    @Override
    public quranText71Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_71_item, parent , false);
        return new quranText71Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText71Holder holder, int position) {
        Nouh nouh = nouhs.get(position);
        holder.textViewText71.setText(nouh.getAyat());


    }

    @Override
    public int getItemCount() {
        return nouhs.size();
    }


}


