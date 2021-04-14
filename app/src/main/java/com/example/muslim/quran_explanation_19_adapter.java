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

public class quran_explanation_19_adapter extends RecyclerView.Adapter<quran_explanation_19_adapter.quranExplanation19Holder> {

    ArrayList<MariamEx> mariamExes ;
    Context context ;

    public quran_explanation_19_adapter(ArrayList<MariamEx> mariamExes, Context context) {
        this.mariamExes = mariamExes;
        this.context = context;
    }

    class quranExplanation19Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation19;
        LinearLayout linearLayout;

        public quranExplanation19Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation19 = itemView.findViewById(R.id.explanation19_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_19);
        }
    }

    @NonNull
    @Override
    public quranExplanation19Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_19_item, parent , false);
        return new quranExplanation19Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation19Holder holder, int position) {
        MariamEx mariamEx = mariamExes.get(position);
        holder.textViewExplanation19.setText(mariamEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return mariamExes.size();
    }


}


