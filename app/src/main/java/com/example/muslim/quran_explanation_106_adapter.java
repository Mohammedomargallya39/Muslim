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

public class quran_explanation_106_adapter extends RecyclerView.Adapter<quran_explanation_106_adapter.quranExplanation106Holder> {

    ArrayList<QoraishEx> qoraishExes ;
    Context context ;

    public quran_explanation_106_adapter(ArrayList<QoraishEx> qoraishExes, Context context) {
        this.qoraishExes = qoraishExes;
        this.context = context;
    }

    class quranExplanation106Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation106;
        LinearLayout linearLayout;

        public quranExplanation106Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation106 = itemView.findViewById(R.id.explanation106_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_106);
        }
    }

    @NonNull
    @Override
    public quranExplanation106Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_106_item, parent , false);
        return new quranExplanation106Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation106Holder holder, int position) {
        QoraishEx qoraishEx = qoraishExes.get(position);
        holder.textViewExplanation106.setText(qoraishEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return qoraishExes.size();
    }


}


