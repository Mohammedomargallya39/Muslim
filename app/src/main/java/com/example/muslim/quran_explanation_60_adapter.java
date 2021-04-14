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

public class quran_explanation_60_adapter extends RecyclerView.Adapter<quran_explanation_60_adapter.quranExplanation60Holder> {

    ArrayList<AlmomtahanaEx> almomtahanaExes ;
    Context context ;

    public quran_explanation_60_adapter(ArrayList<AlmomtahanaEx> almomtahanaExes, Context context) {
        this.almomtahanaExes = almomtahanaExes;
        this.context = context;
    }

    class quranExplanation60Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation60;
        LinearLayout linearLayout;

        public quranExplanation60Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation60 = itemView.findViewById(R.id.explanation60_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_60);
        }
    }

    @NonNull
    @Override
    public quranExplanation60Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_60_item, parent , false);
        return new quranExplanation60Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation60Holder holder, int position) {
        AlmomtahanaEx almomtahanaEx = almomtahanaExes.get(position);
        holder.textViewExplanation60.setText(almomtahanaEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return almomtahanaExes.size();
    }


}


