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

public class quran_explanation_93_adapter extends RecyclerView.Adapter<quran_explanation_93_adapter.quranExplanation93Holder> {

    ArrayList<AldohaEx> aldohaExes ;
    Context context ;

    public quran_explanation_93_adapter(ArrayList<AldohaEx> aldohaExes, Context context) {
        this.aldohaExes = aldohaExes;
        this.context = context;
    }

    class quranExplanation93Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation93;
        LinearLayout linearLayout;

        public quranExplanation93Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation93 = itemView.findViewById(R.id.explanation93_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_93);
        }
    }

    @NonNull
    @Override
    public quranExplanation93Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_93_item, parent , false);
        return new quranExplanation93Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation93Holder holder, int position) {
        AldohaEx aldohaEx = aldohaExes.get(position);
        holder.textViewExplanation93.setText(aldohaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return aldohaExes.size();
    }


}


