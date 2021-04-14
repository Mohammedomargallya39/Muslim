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

public class quran_explanation_22_adapter extends RecyclerView.Adapter<quran_explanation_22_adapter.quranExplanation22Holder> {

    ArrayList<AlhagEx> alhagExes ;
    Context context ;

    public quran_explanation_22_adapter(ArrayList<AlhagEx> alhagExes, Context context) {
        this.alhagExes = alhagExes;
        this.context = context;
    }

    class quranExplanation22Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation22;
        LinearLayout linearLayout;

        public quranExplanation22Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation22 = itemView.findViewById(R.id.explanation22_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_22);
        }
    }

    @NonNull
    @Override
    public quranExplanation22Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_22_item, parent , false);
        return new quranExplanation22Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation22Holder holder, int position) {
        AlhagEx alhagEx = alhagExes.get(position);
        holder.textViewExplanation22.setText(alhagEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alhagExes.size();
    }


}


