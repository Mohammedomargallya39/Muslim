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

public class quran_explanation_41_adapter extends RecyclerView.Adapter<quran_explanation_41_adapter.quranExplanation41Holder> {

    ArrayList<FoselatEx> foselatExes ;
    Context context ;

    public quran_explanation_41_adapter(ArrayList<FoselatEx> foselatExes, Context context) {
        this.foselatExes = foselatExes;
        this.context = context;
    }

    class quranExplanation41Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation41;
        LinearLayout linearLayout;

        public quranExplanation41Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation41 = itemView.findViewById(R.id.explanation41_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_41);
        }
    }

    @NonNull
    @Override
    public quranExplanation41Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_41_item, parent , false);
        return new quranExplanation41Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation41Holder holder, int position) {
        FoselatEx foselatEx = foselatExes.get(position);
        holder.textViewExplanation41.setText(foselatEx.getAyat());
    }

    @Override
    public int getItemCount() {
        return foselatExes.size();
    }


}


