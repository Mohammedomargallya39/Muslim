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

public class quran_explanation_42_adapter extends RecyclerView.Adapter<quran_explanation_42_adapter.quranExplanation42Holder> {

    ArrayList<AlshoraEx> alshoraExes ;
    Context context ;

    public quran_explanation_42_adapter(ArrayList<AlshoraEx> alshoraExes, Context context) {
        this.alshoraExes = alshoraExes;
        this.context = context;
    }

    class quranExplanation42Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation42;
        LinearLayout linearLayout;

        public quranExplanation42Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation42 = itemView.findViewById(R.id.explanation42_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_42);
        }
    }

    @NonNull
    @Override
    public quranExplanation42Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_42_item, parent , false);
        return new quranExplanation42Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation42Holder holder, int position) {
        AlshoraEx alshoraEx = alshoraExes.get(position);
        holder.textViewExplanation42.setText(alshoraEx.getAyat());
    }

    @Override
    public int getItemCount() {
        return alshoraExes.size();
    }


}


