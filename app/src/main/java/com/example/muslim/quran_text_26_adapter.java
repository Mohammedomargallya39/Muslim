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

public class quran_text_26_adapter extends RecyclerView.Adapter<quran_text_26_adapter.quranText26Holder> {

    ArrayList<Alshoaraa> alshoaraas ;
    Context context ;

    public quran_text_26_adapter(ArrayList<Alshoaraa> alshoaraas, Context context) {
        this.alshoaraas = alshoaraas;
        this.context = context;
    }

    class quranText26Holder extends RecyclerView.ViewHolder {
        TextView textViewText26;
        LinearLayout linearLayout;

        public quranText26Holder(@NonNull View itemView) {
            super(itemView);
            textViewText26 = itemView.findViewById(R.id.text26_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_26);
        }
    }

    @NonNull
    @Override
    public quranText26Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_26_item, parent , false);
        return new quranText26Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText26Holder holder, int position) {
        Alshoaraa alshoaraa = alshoaraas.get(position);
        holder.textViewText26.setText(alshoaraa.getAyat());


    }

    @Override
    public int getItemCount() {
        return alshoaraas.size();
    }


}


