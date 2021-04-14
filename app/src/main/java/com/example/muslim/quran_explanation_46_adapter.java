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

public class quran_explanation_46_adapter extends RecyclerView.Adapter<quran_explanation_46_adapter.quranExplanation46Holder> {

    ArrayList<AlahqafEx> alahqafExes ;
    Context context ;

    public quran_explanation_46_adapter(ArrayList<AlahqafEx> alahqafExes, Context context) {
        this.alahqafExes = alahqafExes;
        this.context = context;
    }

    class quranExplanation46Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation46;
        LinearLayout linearLayout;

        public quranExplanation46Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation46= itemView.findViewById(R.id.explanation46_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_46);
        }
    }

    @NonNull
    @Override
    public quranExplanation46Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_46_item, parent , false);
        return new quranExplanation46Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation46Holder holder, int position) {
        AlahqafEx alahqafEx = alahqafExes.get(position);
        holder.textViewExplanation46.setText(alahqafEx.getAyat());
    }

    @Override
    public int getItemCount() {
        return alahqafExes.size();
    }


}


