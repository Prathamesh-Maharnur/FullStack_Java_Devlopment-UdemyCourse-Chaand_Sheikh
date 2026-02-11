package org.studyeasy;

public enum Learning {
    COREJAVA(10),COLLECTIONS(20), GENERICS(30), JSP(40) , MULTITHREADING(50);

    private int i;

    Learning(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}
