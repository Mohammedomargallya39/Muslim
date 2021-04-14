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

public class quran_explanation_40_adapter extends RecyclerView.Adapter<quran_explanation_40_adapter.quranExplanation40Holder> {

    ArrayList<GhaferEx> ghaferExes ;
    Context context ;

    public quran_explanation_40_adapter(ArrayList<GhaferEx> ghaferExes, Context context) {
        this.ghaferExes = ghaferExes;
        this.context = context;
    }

    class quranExplanation40Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation40;
        LinearLayout linearLayout;

        public quranExplanation40Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation40 = itemView.findViewById(R.id.explanation40_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_40);
        }
    }

    @NonNull
    @Override
    public quranExplanation40Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_40_item, parent , false);
        return new quranExplanation40Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation40Holder holder, int position) {
        GhaferEx ghaferEx = ghaferExes.get(position);
        holder.textViewExplanation40.setText(ghaferEx.getAyat());
    }

    @Override
    public int getItemCount() {
        return ghaferExes.size();
    }


}


