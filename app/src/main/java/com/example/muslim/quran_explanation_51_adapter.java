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

public class quran_explanation_51_adapter extends RecyclerView.Adapter<quran_explanation_51_adapter.quranExplanation51Holder> {

    ArrayList<AlzoriatEx> alzoriatExes ;
    Context context ;

    public quran_explanation_51_adapter(ArrayList<AlzoriatEx> alzoriatExes, Context context) {
        this.alzoriatExes = alzoriatExes;
        this.context = context;
    }

    class quranExplanation51Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation51;
        LinearLayout linearLayout;

        public quranExplanation51Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation51 = itemView.findViewById(R.id.explanation51_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_51);
        }
    }

    @NonNull
    @Override
    public quranExplanation51Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_51_item, parent , false);
        return new quranExplanation51Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation51Holder holder, int position) {
        AlzoriatEx alzoriatEx = alzoriatExes.get(position);
        holder.textViewExplanation51.setText(alzoriatEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alzoriatExes.size();
    }


}


