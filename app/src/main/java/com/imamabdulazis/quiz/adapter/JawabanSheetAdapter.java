package com.imamabdulazis.quiz.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.imamabdulazis.quiz.QuizActivity;
import com.imamabdulazis.quiz.R;
import com.imamabdulazis.quiz.common.Common;
import com.imamabdulazis.quiz.model.Pertanyaan;
import com.imamabdulazis.quiz.model.QurPertanyaan;

import java.util.List;

public class JawabanSheetAdapter extends RecyclerView.Adapter<JawabanSheetAdapter.ViewHolder> {
    Context context;
    List<QurPertanyaan> qurPertanyaans;

    public JawabanSheetAdapter(QuizActivity quizActivity, List<QurPertanyaan> jawabanSheetList) {
    }

    public JawabanSheetAdapter(Context context, List<QurPertanyaan> qurPertanyaans) {
        this.context = context;
        this.qurPertanyaans = qurPertanyaans;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.layout_grid_jawaban_sheet_item,viewGroup,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        if (qurPertanyaans.get(position).getType()== Common.TIPE_JAWAB.BENAR_JAWAB)
            viewHolder.itempertanyaan.setBackgroundResource(R.drawable.grid_jawaban_benar);
        else  if (qurPertanyaans.get(position).getType()== Common.TIPE_JAWAB.SALAH_JAWAB)
            viewHolder.itempertanyaan.setBackgroundResource(R.drawable.grid_salah_jawaban);
        else viewHolder.itempertanyaan.setBackgroundResource(R.drawable.grid_tidak_jawab_pertanyaan);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View itempertanyaan;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itempertanyaan=itemView.findViewById(R.id.item_pertanyaan);
        }
    }
}
