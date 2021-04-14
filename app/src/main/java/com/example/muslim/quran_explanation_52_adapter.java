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

public class quran_explanation_52_adapter extends RecyclerView.Adapter<quran_explanation_52_adapter.quranExplanation52Holder> {

    ArrayList<AltorEx> altorExes ;
    Context context ;

    public quran_explanation_52_adapter(ArrayList<AltorEx> altorExes, Context context) {
        this.altorExes = altorExes;
        this.context = context;
    }

    class quranExplanation52Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation52;
        LinearLayout linearLayout;

        public quranExplanation52Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation52 = itemView.findViewById(R.id.explanation52_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_52);
        }
    }

    @NonNull
    @Override
    public quranExplanation52Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_52_item, parent , false);
        return new quranExplanation52Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation52Holder holder, int position) {
        AltorEx altorEx = altorExes.get(position);
        holder.textViewExplanation52.setText(altorEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return altorExes.size();
    }


}


