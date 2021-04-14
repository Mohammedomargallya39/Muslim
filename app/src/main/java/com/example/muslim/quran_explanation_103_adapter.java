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

public class quran_explanation_103_adapter extends RecyclerView.Adapter<quran_explanation_103_adapter.quranExplanation103Holder> {

    ArrayList<AlaserEx> alaserExes ;
    Context context ;

    public quran_explanation_103_adapter(ArrayList<AlaserEx> alaserExes, Context context) {
        this.alaserExes = alaserExes;
        this.context = context;
    }

    class quranExplanation103Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation103;
        LinearLayout linearLayout;

        public quranExplanation103Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation103 = itemView.findViewById(R.id.explanation103_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_103);
        }
    }

    @NonNull
    @Override
    public quranExplanation103Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_103_item, parent , false);
        return new quranExplanation103Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation103Holder holder, int position) {
        AlaserEx alaserEx = alaserExes.get(position);
        holder.textViewExplanation103.setText(alaserEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alaserExes.size();
    }


}


