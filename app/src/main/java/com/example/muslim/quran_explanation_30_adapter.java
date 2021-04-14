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

public class quran_explanation_30_adapter extends RecyclerView.Adapter<quran_explanation_30_adapter.quranExplanation30Holder> {

    ArrayList<AlroomEx> alroomExes ;
    Context context ;

    public quran_explanation_30_adapter(ArrayList<AlroomEx> alroomExes, Context context) {
        this.alroomExes = alroomExes;
        this.context = context;
    }

    class quranExplanation30Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation30;
        LinearLayout linearLayout;

        public quranExplanation30Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation30 = itemView.findViewById(R.id.explanation30_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_30);
        }
    }

    @NonNull
    @Override
    public quranExplanation30Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_30_item, parent , false);
        return new quranExplanation30Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation30Holder holder, int position) {
        AlroomEx alroomEx = alroomExes.get(position);
        holder.textViewExplanation30.setText(alroomEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return alroomExes.size();
    }


}


