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

public class quran_text_14_adapter extends RecyclerView.Adapter<quran_text_14_adapter.quranText14Holder> {

    ArrayList<Ebrahim> ebrahims ;
    Context context ;

    public quran_text_14_adapter(ArrayList<Ebrahim> ebrahims, Context context) {
        this.ebrahims = ebrahims;
        this.context = context;
    }

    class quranText14Holder extends RecyclerView.ViewHolder {
        TextView textViewText14;
        LinearLayout linearLayout;

        public quranText14Holder(@NonNull View itemView) {
            super(itemView);
            textViewText14 = itemView.findViewById(R.id.text14_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_14);
        }
    }

    @NonNull
    @Override
    public quranText14Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_14_item, parent , false);
        return new quranText14Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText14Holder holder, int position) {
        Ebrahim ebrahim = ebrahims.get(position);
        holder.textViewText14.setText(ebrahim.getAyat());


    }

    @Override
    public int getItemCount() {
        return ebrahims.size();
    }


}


