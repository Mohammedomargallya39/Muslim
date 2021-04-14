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

public class quran_text_6_adapter extends RecyclerView.Adapter<quran_text_6_adapter.quranText6Holder> {

    ArrayList<Alanaam> alanaams ;
    Context context ;

    public quran_text_6_adapter(ArrayList<Alanaam> alanaams, Context context) {
        this.alanaams = alanaams;
        this.context = context;
    }

    class quranText6Holder extends RecyclerView.ViewHolder {
        TextView textViewText6;
        LinearLayout linearLayout;

        public quranText6Holder(@NonNull View itemView) {
            super(itemView);
            textViewText6 = itemView.findViewById(R.id.text6_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_6);
        }
    }

    @NonNull
    @Override
    public quranText6Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_6_item, parent , false);
        return new quranText6Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText6Holder holder, int position) {
        Alanaam alanaam = alanaams.get(position);
        holder.textViewText6.setText(alanaam.getAyat());


    }

    @Override
    public int getItemCount() {
        return alanaams.size();
    }


}


