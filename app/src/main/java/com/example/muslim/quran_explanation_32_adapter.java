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

public class quran_explanation_32_adapter extends RecyclerView.Adapter<quran_explanation_32_adapter.quranExplanation32Holder> {

    ArrayList<AlsagdaEx> alsagdaExes ;
    Context context ;

    public quran_explanation_32_adapter(ArrayList<AlsagdaEx> alsagdaExes, Context context) {
        this.alsagdaExes = alsagdaExes;
        this.context = context;
    }

    class quranExplanation32Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation32;
        LinearLayout linearLayout;

        public quranExplanation32Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation32 = itemView.findViewById(R.id.explanation32_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_32);
        }
    }

    @NonNull
    @Override
    public quranExplanation32Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_32_item, parent , false);
        return new quranExplanation32Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation32Holder holder, int position) {
        AlsagdaEx alsagdaEx = alsagdaExes.get(position);
        holder.textViewExplanation32.setText(alsagdaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alsagdaExes.size();
    }


}


