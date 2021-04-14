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

public class quran_text_110_adapter extends RecyclerView.Adapter<quran_text_110_adapter.quranText110Holder> {

    ArrayList<Alnasr> alnasrs ;
    Context context ;

    public quran_text_110_adapter(ArrayList<Alnasr> alnasrs, Context context) {
        this.alnasrs = alnasrs;
        this.context = context;
    }

    class quranText110Holder extends RecyclerView.ViewHolder {
        TextView textViewText110;
        LinearLayout linearLayout;

        public quranText110Holder(@NonNull View itemView) {
            super(itemView);
            textViewText110 = itemView.findViewById(R.id.text110_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_110);
        }
    }

    @NonNull
    @Override
    public quranText110Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_110_item, parent , false);
        return new quranText110Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText110Holder holder, int position) {
        Alnasr alnasr = alnasrs.get(position);
        holder.textViewText110.setText(alnasr.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnasrs.size();
    }


}


