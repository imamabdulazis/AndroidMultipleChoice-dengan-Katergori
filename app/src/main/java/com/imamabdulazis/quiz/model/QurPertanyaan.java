package com.imamabdulazis.quiz.model;

import com.imamabdulazis.quiz.common.Common;

public class QurPertanyaan {
    private int indexpertanyaan;
    private Common.TIPE_JAWAB type;

    public QurPertanyaan(int indexpertanyaan, Common.TIPE_JAWAB type) {
        this.indexpertanyaan = indexpertanyaan;
        this.type = type;
    }

    public int getIndexpertanyaan() {
        return indexpertanyaan;
    }

    public void setIndexpertanyaan(int indexpertanyaan) {
        this.indexpertanyaan = indexpertanyaan;
    }

    public Common.TIPE_JAWAB getType() {
        return type;
    }

    public void setType(Common.TIPE_JAWAB type) {
        this.type = type;
    }
}
