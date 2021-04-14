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

public class quran_text_42_adapter extends RecyclerView.Adapter<quran_text_42_adapter.quranText42Holder> {

    ArrayList<Alshora> alshoras;
    Context context ;

    public quran_text_42_adapter(ArrayList<Alshora> alshoras, Context context) {
        this.alshoras = alshoras;
        this.context = context;
    }

    class quranText42Holder extends RecyclerView.ViewHolder {
        TextView textViewText42;
        LinearLayout linearLayout;

        public quranText42Holder(@NonNull View itemView) {
            super(itemView);
            textViewText42 = itemView.findViewById(R.id.text42_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_42);
        }
    }

    @NonNull
    @Override
    public quranText42Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_42_item, parent , false);
        return new quranText42Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText42Holder holder, int position) {
        Alshora alshora = alshoras.get(position);
        holder.textViewText42.setText(alshora.getAyat());


    }

    @Override
    public int getItemCount() {
        return alshoras.size();
    }


}


