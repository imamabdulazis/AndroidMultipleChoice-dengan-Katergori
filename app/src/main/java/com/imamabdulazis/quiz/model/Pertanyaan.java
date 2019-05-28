package com.imamabdulazis.quiz.model;

public class Pertanyaan {
    private int id;
    private String pertanyaantext,pertanyaanGambar,jawabA,jawabB,JawabC,jawabD,jawabanBenar;
    private int kategoriID;
    private int isGambarPertanyaan;

    public Pertanyaan(){}

    public Pertanyaan(int id, String pertanyaantext, String pertanyaanGambar, String jawabA, String jawabB, String jawabC, String jawabD, String jawabanBenar, int kategoriID, int isGambarPertanyaan) {
        this.id = id;
        this.pertanyaantext = pertanyaantext;
        this.pertanyaanGambar = pertanyaanGambar;
        this.jawabA = jawabA;
        this.jawabB = jawabB;
        JawabC = jawabC;
        this.jawabD = jawabD;
        this.jawabanBenar = jawabanBenar;
        this.kategoriID = kategoriID;
        this.isGambarPertanyaan = isGambarPertanyaan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPertanyaantext() {
        return pertanyaantext;
    }

    public void setPertanyaantext(String pertanyaantext) {
        this.pertanyaantext = pertanyaantext;
    }

    public String getPertanyaanGambar() {
        return pertanyaanGambar;
    }

    public void setPertanyaanGambar(String pertanyaanGambar) {
        this.pertanyaanGambar = pertanyaanGambar;
    }

    public String getJawabA() {
        return jawabA;
    }

    public void setJawabA(String jawabA) {
        this.jawabA = jawabA;
    }

    public String getJawabB() {
        return jawabB;
    }

    public void setJawabB(String jawabB) {
        this.jawabB = jawabB;
    }

    public String getJawabC() {
        return JawabC;
    }

    public void setJawabC(String jawabC) {
        JawabC = jawabC;
    }

    public String getJawabD() {
        return jawabD;
    }

    public void setJawabD(String jawabD) {
        this.jawabD = jawabD;
    }

    public String getJawabanBenar() {
        return jawabanBenar;
    }

    public void setJawabanBenar(String jawabanBenar) {
        this.jawabanBenar = jawabanBenar;
    }

    public int getKategoriID() {
        return kategoriID;
    }

    public void setKategoriID(int kategoriID) {
        this.kategoriID = kategoriID;
    }

    public int getIsGambarPertanyaan() {
        return isGambarPertanyaan;
    }

    public void setIsGambarPertanyaan(int isGambarPertanyaan) {
        this.isGambarPertanyaan = isGambarPertanyaan;
    }
}
