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

public class quran_text_47_adapter extends RecyclerView.Adapter<quran_text_47_adapter.quranText47Holder> {

    ArrayList<Mohammed> mohammeds;
    Context context ;

    public quran_text_47_adapter(ArrayList<Mohammed> mohammeds, Context context) {
        this.mohammeds = mohammeds;
        this.context = context;
    }

    class quranText47Holder extends RecyclerView.ViewHolder {
        TextView textViewText47;
        LinearLayout linearLayout;

        public quranText47Holder(@NonNull View itemView) {
            super(itemView);
            textViewText47 = itemView.findViewById(R.id.text47_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_47);
        }
    }

    @NonNull
    @Override
    public quranText47Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_47_item, parent , false);
        return new quranText47Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText47Holder holder, int position) {
        Mohammed mohammed = mohammeds.get(position);
        holder.textViewText47.setText(mohammed.getAyat());


    }

    @Override
    public int getItemCount() {
        return mohammeds.size();
    }


}


