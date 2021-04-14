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

public class quran_text_46_adapter extends RecyclerView.Adapter<quran_text_46_adapter.quranText46Holder> {

    ArrayList<Alahkaf> alahkafs;
    Context context ;

    public quran_text_46_adapter(ArrayList<Alahkaf> alahkafs, Context context) {
        this.alahkafs = alahkafs;
        this.context = context;
    }

    class quranText46Holder extends RecyclerView.ViewHolder {
        TextView textViewText46;
        LinearLayout linearLayout;

        public quranText46Holder(@NonNull View itemView) {
            super(itemView);
            textViewText46 = itemView.findViewById(R.id.text46_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_46);
        }
    }

    @NonNull
    @Override
    public quranText46Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_46_item, parent , false);
        return new quranText46Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText46Holder holder, int position) {
        Alahkaf alahkaf = alahkafs.get(position);
        holder.textViewText46.setText(alahkaf.getAyat());


    }

    @Override
    public int getItemCount() {
        return alahkafs.size();
    }


}


