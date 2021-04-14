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

public class quran_text_27_adapter extends RecyclerView.Adapter<quran_text_27_adapter.quranText27Holder> {

    ArrayList<Alnaml> alnamls ;
    Context context ;

    public quran_text_27_adapter(ArrayList<Alnaml> alnamls, Context context) {
        this.alnamls = alnamls;
        this.context = context;
    }

    class quranText27Holder extends RecyclerView.ViewHolder {
        TextView textViewText27;
        LinearLayout linearLayout;

        public quranText27Holder(@NonNull View itemView) {
            super(itemView);
            textViewText27 = itemView.findViewById(R.id.text27_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_27);
        }
    }

    @NonNull
    @Override
    public quranText27Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_27_item, parent , false);
        return new quranText27Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText27Holder holder, int position) {
        Alnaml alnaml = alnamls.get(position);
        holder.textViewText27.setText(alnaml.getAyat());


    }

    @Override
    public int getItemCount() {
        return alnamls.size();
    }


}


