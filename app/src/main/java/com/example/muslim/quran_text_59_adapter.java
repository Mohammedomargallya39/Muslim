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

public class quran_text_59_adapter extends RecyclerView.Adapter<quran_text_59_adapter.quranText59Holder> {

    ArrayList<Alhashr> alhashrs ;
    Context context ;

    public quran_text_59_adapter(ArrayList<Alhashr> alhashrs, Context context) {
        this.alhashrs = alhashrs;
        this.context = context;
    }

    class quranText59Holder extends RecyclerView.ViewHolder {
        TextView textViewText59;
        LinearLayout linearLayout;

        public quranText59Holder(@NonNull View itemView) {
            super(itemView);
            textViewText59 = itemView.findViewById(R.id.text59_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_59);
        }
    }

    @NonNull
    @Override
    public quranText59Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_59_item, parent , false);
        return new quranText59Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText59Holder holder, int position) {
        Alhashr alhashr = alhashrs.get(position);
        holder.textViewText59.setText(alhashr.getAyat());


    }

    @Override
    public int getItemCount() {
        return alhashrs.size();
    }


}


