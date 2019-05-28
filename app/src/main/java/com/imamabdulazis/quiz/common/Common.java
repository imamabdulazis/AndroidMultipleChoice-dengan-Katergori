package com.imamabdulazis.quiz.common;

import com.imamabdulazis.quiz.model.Kategori;
import com.imamabdulazis.quiz.model.Pertanyaan;
import com.imamabdulazis.quiz.model.QurPertanyaan;

import java.util.ArrayList;
import java.util.List;

public class Common {

    public static final int TOTAL_WAKTU = 20*60*1000;//20 menit
    public static List<Pertanyaan> pertanyaanList=new ArrayList<>();
    public static Kategori pilihKategori=new Kategori();
    public static List<QurPertanyaan> jawabanSheetList=new ArrayList<>();

    public enum TIPE_JAWAB{
        TIDAK_JAWAB,
        SALAH_JAWAB,
        BENAR_JAWAB
    }
}
