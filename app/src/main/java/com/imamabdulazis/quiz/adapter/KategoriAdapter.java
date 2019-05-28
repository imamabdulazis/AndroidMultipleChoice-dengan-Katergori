package com.imamabdulazis.quiz.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;
import android.widget.Toast;

import com.imamabdulazis.quiz.QuizActivity;
import com.imamabdulazis.quiz.R;
import com.imamabdulazis.quiz.common.Common;
import com.imamabdulazis.quiz.model.Kategori;

import java.util.List;

public class KategoriAdapter extends RecyclerView.Adapter<KategoriAdapter.ViewHolder> {
    Context context;
    List<Kategori> kategoris;

    public KategoriAdapter(Context context, List<Kategori> kategoris) {
        this.context = context;
        this.kategoris = kategoris;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemview= LayoutInflater.from(context).inflate(R.layout.layout_kategori_item,viewGroup,false);
        return new ViewHolder(itemview) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int posisition) {
        viewHolder.tvkategori.setText(kategoris.get(posisition).getNama());
    }

    @Override
    public int getItemCount() {
        return kategoris.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardkategori;
        TextView tvkategori;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardkategori=itemView.findViewById(R.id.cardkategori);
            tvkategori=itemView.findViewById(R.id.tvkategori);
            cardkategori.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(context, ""+kategoris.get(getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();

                    Common.pilihKategori=kategoris.get(getAdapterPosition());
                    Intent intent=new Intent(context, QuizActivity.class);
                    context.startActivity(intent);
                }
            });
        }
    }
}
