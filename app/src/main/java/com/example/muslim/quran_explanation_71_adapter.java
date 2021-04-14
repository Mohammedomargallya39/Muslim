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

public class quran_explanation_71_adapter extends RecyclerView.Adapter<quran_explanation_71_adapter.quranExplanation71Holder> {

    ArrayList<NouhEx> nouhExes ;
    Context context ;

    public quran_explanation_71_adapter(ArrayList<NouhEx> nouhExes, Context context) {
        this.nouhExes = nouhExes;
        this.context = context;
    }

    class quranExplanation71Holder extends RecyclerView.ViewHolder {
        TextView textViewExplanation71;
        LinearLayout linearLayout;

        public quranExplanation71Holder(@NonNull View itemView) {
            super(itemView);
            textViewExplanation71 = itemView.findViewById(R.id.explanation71_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_explanation_71);
        }
    }

    @NonNull
    @Override
    public quranExplanation71Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_explanation_71_item, parent , false);
        return new quranExplanation71Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranExplanation71Holder holder, int position) {
        NouhEx nouhEx = nouhExes.get(position);
        holder.textViewExplanation71.setText(nouhEx.getAyat());


    }

    @Override
    public int getItemCount() {
        return nouhExes.size();
    }


}


