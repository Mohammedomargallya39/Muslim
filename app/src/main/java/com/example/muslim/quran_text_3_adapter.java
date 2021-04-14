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

public class quran_text_3_adapter extends RecyclerView.Adapter<quran_text_3_adapter.quranText3Holder> {

    ArrayList<Alomran> alomrans;
    Context context ;

    public quran_text_3_adapter(ArrayList<Alomran> alomrans, Context context) {
        this.alomrans = alomrans;
        this.context = context;
    }

    class quranText3Holder extends RecyclerView.ViewHolder {
        TextView textViewText3;
        LinearLayout linearLayout;

        public quranText3Holder(@NonNull View itemView) {
            super(itemView);
            textViewText3 = itemView.findViewById(R.id.text3_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_3);
        }
    }

    @NonNull
    @Override
    public quranText3Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_3_item, parent , false);
        return new quranText3Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText3Holder holder, int position) {
        Alomran alomran = alomrans.get(position);
        holder.textViewText3.setText(alomran.getAyat());


    }

    @Override
    public int getItemCount() {
        return alomrans.size();
    }


}


