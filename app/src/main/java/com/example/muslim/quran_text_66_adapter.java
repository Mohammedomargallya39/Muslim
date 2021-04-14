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

public class quran_text_66_adapter extends RecyclerView.Adapter<quran_text_66_adapter.quranText66Holder> {

    ArrayList<Altahrim> altahrims ;
    Context context ;

    public quran_text_66_adapter(ArrayList<Altahrim> altahrims, Context context) {
        this.altahrims = altahrims;
        this.context = context;
    }

    class quranText66Holder extends RecyclerView.ViewHolder {
        TextView textViewText66;
        LinearLayout linearLayout;

        public quranText66Holder(@NonNull View itemView) {
            super(itemView);
            textViewText66 = itemView.findViewById(R.id.text66_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_66);
        }
    }

    @NonNull
    @Override
    public quranText66Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_66_item, parent , false);
        return new quranText66Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText66Holder holder, int position) {
        Altahrim altahrim = altahrims.get(position);
        holder.textViewText66.setText(altahrim.getAyat());


    }

    @Override
    public int getItemCount() {
        return altahrims.size();
    }


}


