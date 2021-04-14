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

public class quran_explanation_48_adapter extends RecyclerView.Adapter<quran_explanation_48_adapter.quranExplanation48Holder> {

    ArrayList<AlfathEx> alfathExes ;
    Context context ;

    public quran_explanation_48_adapter(ArrayList<AlfathEx> alfathExes, Context context) {
        this.alfathExes = alfathExes;
        this.context = context;
    }

    class quranExplanation48Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation48;
        LinearLayout linearLayout;

        public quranExplanation48Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation48 = itemView.findViewById(R.id.explanation48_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_48);
        }
    }

    @NonNull
    @Override
    public quranExplanation48Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_48_item, parent , false);
        return new quranExplanation48Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation48Holder holder, int position) {
        AlfathEx alfathEx = alfathExes.get(position);
        holder.textViewExplanation48.setText(alfathEx.getAyat());
    }

    @Override
    public int getItemCount() {
        return alfathExes.size();
    }


}


