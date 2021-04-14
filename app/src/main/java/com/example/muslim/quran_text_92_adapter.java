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

public class quran_text_92_adapter extends RecyclerView.Adapter<quran_text_92_adapter.quranText92Holder> {

    ArrayList<Allail> allails ;
    Context context ;

    public quran_text_92_adapter(ArrayList<Allail> allails, Context context) {
        this.allails = allails;
        this.context = context;
    }

    class quranText92Holder extends RecyclerView.ViewHolder {
        TextView textViewText92;
        LinearLayout linearLayout;

        public quranText92Holder(@NonNull View itemView) {
            super(itemView);
            textViewText92 = itemView.findViewById(R.id.text92_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_92);
        }
    }

    @NonNull
    @Override
    public quranText92Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_92_item, parent , false);
        return new quranText92Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText92Holder holder, int position) {
        Allail allail = allails.get(position);
        holder.textViewText92.setText(allail.getAyat());


    }

    @Override
    public int getItemCount() {
        return allails.size();
    }


}


