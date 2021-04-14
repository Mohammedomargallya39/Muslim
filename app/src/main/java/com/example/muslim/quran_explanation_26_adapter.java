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

public class quran_explanation_26_adapter extends RecyclerView.Adapter<quran_explanation_26_adapter.quranExplanation26Holder> {

    ArrayList<AlshoaraaEx> alshoaraaExes ;
    Context context ;

    public quran_explanation_26_adapter(ArrayList<AlshoaraaEx> alshoaraaExes, Context context) {
        this.alshoaraaExes = alshoaraaExes;
        this.context = context;
    }

    class quranExplanation26Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation26;
        LinearLayout linearLayout;

        public quranExplanation26Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation26 = itemView.findViewById(R.id.explanation26_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_26);
        }
    }

    @NonNull
    @Override
    public quranExplanation26Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_26_item, parent , false);
        return new quranExplanation26Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation26Holder holder, int position) {
        AlshoaraaEx alshoaraaEx = alshoaraaExes.get(position);
        holder.textViewExplanation26.setText(alshoaraaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alshoaraaExes.size();
    }


}


