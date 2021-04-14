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

public class quran_text_102_adapter extends RecyclerView.Adapter<quran_text_102_adapter.quranText102Holder> {

    ArrayList<Altakathor> altakathors ;
    Context context ;

    public quran_text_102_adapter(ArrayList<Altakathor> altakathors, Context context) {
        this.altakathors = altakathors;
        this.context = context;
    }

    class quranText102Holder extends RecyclerView.ViewHolder {
        TextView textViewText102;
        LinearLayout linearLayout;

        public quranText102Holder(@NonNull View itemView) {
            super(itemView);
            textViewText102 = itemView.findViewById(R.id.text102_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_102);
        }
    }

    @NonNull
    @Override
    public quranText102Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_102_item, parent , false);
        return new quranText102Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText102Holder holder, int position) {
        Altakathor altakathor = altakathors.get(position);
        holder.textViewText102.setText(altakathor.getAyat());


    }

    @Override
    public int getItemCount() {
        return altakathors.size();
    }


}


