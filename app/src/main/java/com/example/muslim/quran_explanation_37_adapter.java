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

public class quran_explanation_37_adapter extends RecyclerView.Adapter<quran_explanation_37_adapter.quranExplanation37Holder> {

    ArrayList<AlsafatEx> alsafatExes ;
    Context context ;

    public quran_explanation_37_adapter(ArrayList<AlsafatEx> alsafatExes, Context context) {
        this.alsafatExes = alsafatExes;
        this.context = context;
    }

    class quranExplanation37Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation37;
        LinearLayout linearLayout;

        public quranExplanation37Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation37 = itemView.findViewById(R.id.explanation37_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_37);
        }
    }

    @NonNull
    @Override
    public quranExplanation37Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_37_item, parent , false);
        return new quranExplanation37Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation37Holder holder, int position) {
        AlsafatEx alsafatEx = alsafatExes.get(position);
        holder.textViewExplanation37.setText(alsafatEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alsafatExes.size();
    }


}


