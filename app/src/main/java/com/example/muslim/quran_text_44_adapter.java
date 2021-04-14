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

public class quran_text_44_adapter extends RecyclerView.Adapter<quran_text_44_adapter.quranText44Holder> {

    ArrayList<Aldokhan> aldokhans;
    Context context ;

    public quran_text_44_adapter(ArrayList<Aldokhan> aldokhans, Context context) {
        this.aldokhans = aldokhans;
        this.context = context;
    }

    class quranText44Holder extends RecyclerView.ViewHolder {
        TextView textViewText44;
        LinearLayout linearLayout;

        public quranText44Holder(@NonNull View itemView) {
            super(itemView);
            textViewText44 = itemView.findViewById(R.id.text44_item);
            linearLayout = itemView.findViewById(R.id.ayat_item_44);
        }
    }

    @NonNull
    @Override
    public quranText44Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quran_text_44_item, parent , false);
        return new quranText44Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull quranText44Holder holder, int position) {
        Aldokhan aldokhan = aldokhans.get(position);
        holder.textViewText44.setText(aldokhan.getAyat());


    }

    @Override
    public int getItemCount() {
        return aldokhans.size();
    }


}


