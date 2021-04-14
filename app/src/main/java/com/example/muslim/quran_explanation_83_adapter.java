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

public class quran_explanation_83_adapter extends RecyclerView.Adapter<quran_explanation_83_adapter.quranExplanation83Holder> {

    ArrayList<AlmotafefenEx> almotafefenExes ;
    Context context ;

    public quran_explanation_83_adapter(ArrayList<AlmotafefenEx> almotafefenExes, Context context) {
        this.almotafefenExes = almotafefenExes;
        this.context = context;
    }

    class quranExplanation83Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation83;
        LinearLayout linearLayout;

        public quranExplanation83Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation83 = itemView.findViewById(R.id.explanation83_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_83);
        }
    }

    @NonNull
    @Override
    public quranExplanation83Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_83_item, parent , false);
        return new quranExplanation83Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation83Holder holder, int position) {
        AlmotafefenEx almotafefenEx = almotafefenExes.get(position);
        holder.textViewExplanation83.setText(almotafefenEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return almotafefenExes.size();
    }


}


