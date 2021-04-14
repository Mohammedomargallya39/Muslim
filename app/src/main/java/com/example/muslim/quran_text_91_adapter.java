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

public class quran_text_91_adapter extends RecyclerView.Adapter<quran_text_91_adapter.quranText91Holder> {

    ArrayList<Alshams> alshams ;
    Context context ;

    public quran_text_91_adapter(ArrayList<Alshams> alshams, Context context) {
        this.alshams = alshams;
        this.context = context;
    }

    class quranText91Holder extends RecyclerView.ViewHolder {
        TextView textViewText91;
        LinearLayout linearLayout;

        public quranText91Holder(@NonNull View itemView) {
            super(itemView);
            textViewText91 = itemView.findViewById(R.id.text91_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_91);
        }
    }

    @NonNull
    @Override
    public quranText91Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_91_item, parent , false);
        return new quranText91Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText91Holder holder, int position) {
        Alshams alsham = alshams.get(position);
        holder.textViewText91.setText(alsham.getAyat());


    }

    @Override
    public int getItemCount() {
        return alshams.size();
    }


}


