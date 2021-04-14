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

public class quran_explanation_107_adapter extends RecyclerView.Adapter<quran_explanation_107_adapter.quranExplanation107Holder> {

    ArrayList<AlmaaonEx> almaaonExes ;
    Context context ;

    public quran_explanation_107_adapter(ArrayList<AlmaaonEx> almaaonExes, Context context) {
        this.almaaonExes = almaaonExes;
        this.context = context;
    }

    class quranExplanation107Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation107;
        LinearLayout linearLayout;

        public quranExplanation107Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation107 = itemView.findViewById(R.id.explanation107_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_107);
        }
    }

    @NonNull
    @Override
    public quranExplanation107Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_107_item, parent , false);
        return new quranExplanation107Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation107Holder holder, int position) {
        AlmaaonEx almaaonEx = almaaonExes.get(position);
        holder.textViewExplanation107.setText(almaaonEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return almaaonExes.size();
    }


}


