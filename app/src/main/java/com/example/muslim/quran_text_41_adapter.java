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

public class quran_text_41_adapter extends RecyclerView.Adapter<quran_text_41_adapter.quranText41Holder> {

    ArrayList<Foselat> foselats;
    Context context ;

    public quran_text_41_adapter(ArrayList<Foselat> foselats, Context context) {
        this.foselats = foselats;
        this.context = context;
    }

    class quranText41Holder extends RecyclerView.ViewHolder {
        TextView textViewText41;
        LinearLayout linearLayout;

        public quranText41Holder(@NonNull View itemView) {
            super(itemView);
            textViewText41 = itemView.findViewById(R.id.text41_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_41);
        }
    }

    @NonNull
    @Override
    public quranText41Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_41_item, parent , false);
        return new quranText41Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText41Holder holder, int position) {
        Foselat foselat = foselats.get(position);
        holder.textViewText41.setText(foselat.getAyat());


    }

    @Override
    public int getItemCount() {
        return foselats.size();
    }


}


