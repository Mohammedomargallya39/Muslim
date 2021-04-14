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

public class quran_explanation_111_adapter extends RecyclerView.Adapter<quran_explanation_111_adapter.quranExplanation111Holder> {

    ArrayList<AlmasadEx> almasadExes ;
    Context context ;

    public quran_explanation_111_adapter(ArrayList<AlmasadEx> almasadExes, Context context) {
        this.almasadExes = almasadExes;
        this.context = context;
    }

    class quranExplanation111Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation111;
        LinearLayout linearLayout;

        public quranExplanation111Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation111 = itemView.findViewById(R.id.explanation111_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_111);
        }
    }

    @NonNull
    @Override
    public quranExplanation111Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_111_item, parent , false);
        return new quranExplanation111Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation111Holder holder, int position) {
        AlmasadEx almasadEx = almasadExes.get(position);
        holder.textViewExplanation111.setText(almasadEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return almasadExes.size();
    }


}


