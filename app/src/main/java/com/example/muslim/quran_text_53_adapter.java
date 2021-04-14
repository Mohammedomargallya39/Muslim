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

public class quran_text_53_adapter extends RecyclerView.Adapter<quran_text_53_adapter.quranText53Holder> {

    ArrayList<Alnagm> alnagms ;
    Context context ;

    public quran_text_53_adapter(ArrayList<Alnagm> alnagms, Context context) {
        this.alnagms = alnagms;
        this.context = context;
    }

    class quranText53Holder extends RecyclerView.ViewHolder {
        TextView textViewText53;
        LinearLayout linearLayout;

        public quranText53Holder(@NonNull View itemView) {
            super(itemView);
            textViewText53 = itemView.findViewById(R.id.text53_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_53);
        }
    }

    @NonNull
    @Override
    public quranText53Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_53_item, parent , false);
        return new quranText53Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText53Holder holder, int position) {
        Alnagm alnagm = alnagms.get(position);
        holder.textViewText53.setText(alnagm.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnagms.size();
    }


}


