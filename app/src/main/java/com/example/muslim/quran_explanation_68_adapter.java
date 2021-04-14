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

public class quran_explanation_68_adapter extends RecyclerView.Adapter<quran_explanation_68_adapter.quranExplanation68Holder> {

    ArrayList<AlqalamEx> alqalamExes ;
    Context context ;

    public quran_explanation_68_adapter(ArrayList<AlqalamEx> alqalamExes, Context context) {
        this.alqalamExes = alqalamExes;
        this.context = context;
    }

    class quranExplanation68Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation68;
        LinearLayout linearLayout;

        public quranExplanation68Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation68 = itemView.findViewById(R.id.explanation68_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_68);
        }
    }

    @NonNull
    @Override
    public quranExplanation68Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_68_item, parent , false);
        return new quranExplanation68Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation68Holder holder, int position) {
        AlqalamEx alqalamEx = alqalamExes.get(position);
        holder.textViewExplanation68.setText(alqalamEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alqalamExes.size();
    }


}


