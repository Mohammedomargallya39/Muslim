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

public class quran_text_105_adapter extends RecyclerView.Adapter<quran_text_105_adapter.quranText105Holder> {

    ArrayList<Alfel> alfels ;
    Context context ;

    public quran_text_105_adapter(ArrayList<Alfel> alfels, Context context) {
        this.alfels = alfels;
        this.context = context;
    }

    class quranText105Holder extends RecyclerView.ViewHolder {
        TextView textViewText105;
        LinearLayout linearLayout;

        public quranText105Holder(@NonNull View itemView) {
            super(itemView);
            textViewText105 = itemView.findViewById(R.id.text105_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_105);
        }
    }

    @NonNull
    @Override
    public quranText105Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_105_item, parent , false);
        return new quranText105Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText105Holder holder, int position) {
        Alfel alfel = alfels.get(position);
        holder.textViewText105.setText(alfel.getAyat());


    }

    @Override
    public int getItemCount() {
        return alfels.size();
    }


}


