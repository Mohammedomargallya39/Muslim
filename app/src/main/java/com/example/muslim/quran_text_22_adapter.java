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

public class quran_text_22_adapter extends RecyclerView.Adapter<quran_text_22_adapter.quranText22Holder> {

    ArrayList<Alhag>alhags ;
    Context context ;

    public quran_text_22_adapter(ArrayList<Alhag> alhags, Context context) {
        this.alhags = alhags;
        this.context = context;
    }

    class quranText22Holder extends RecyclerView.ViewHolder {
        TextView textViewText22;
        LinearLayout linearLayout;

        public quranText22Holder(@NonNull View itemView) {
            super(itemView);
            textViewText22 = itemView.findViewById(R.id.text22_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_22);
        }
    }

    @NonNull
    @Override
    public quranText22Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_22_item, parent , false);
        return new quranText22Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText22Holder holder, int position) {
        Alhag alhag = alhags.get(position);
        holder.textViewText22.setText(alhag.getAyat());


    }

    @Override
    public int getItemCount() {
        return alhags.size();
    }


}


