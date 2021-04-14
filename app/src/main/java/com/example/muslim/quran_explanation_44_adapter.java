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

public class quran_explanation_44_adapter extends RecyclerView.Adapter<quran_explanation_44_adapter.quranExplanation44Holder> {

    ArrayList<AldokhanEx> aldokhanExes ;
    Context context ;

    public quran_explanation_44_adapter(ArrayList<AldokhanEx> aldokhanExes, Context context) {
        this.aldokhanExes = aldokhanExes;
        this.context = context;
    }

    class quranExplanation44Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation44;
        LinearLayout linearLayout;

        public quranExplanation44Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation44 = itemView.findViewById(R.id.explanation44_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_44);
        }
    }

    @NonNull
    @Override
    public quranExplanation44Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_44_item, parent , false);
        return new quranExplanation44Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation44Holder holder, int position) {
        AldokhanEx aldokhanEx = aldokhanExes.get(position);
        holder.textViewExplanation44.setText(aldokhanEx.getAyat());
    }

    @Override
    public int getItemCount() {
        return aldokhanExes.size();
    }


}


