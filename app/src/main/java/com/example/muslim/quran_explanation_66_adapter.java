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

public class quran_explanation_66_adapter extends RecyclerView.Adapter<quran_explanation_66_adapter.quranExplanation66Holder> {

    ArrayList<AltahremEx> altahremExes ;
    Context context ;

    public quran_explanation_66_adapter(ArrayList<AltahremEx> altahremExes, Context context) {
        this.altahremExes = altahremExes;
        this.context = context;
    }

    class quranExplanation66Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation66;
        LinearLayout linearLayout;

        public quranExplanation66Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation66 = itemView.findViewById(R.id.explanation66_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_66);
        }
    }

    @NonNull
    @Override
    public quranExplanation66Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_66_item, parent , false);
        return new quranExplanation66Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation66Holder holder, int position) {
        AltahremEx altahremEx = altahremExes.get(position);
        holder.textViewExplanation66.setText(altahremEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return altahremExes.size();
    }


}


