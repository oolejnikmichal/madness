package pl.put.poznan.sortingapp.rest;

import java.util.ArrayList;
import java.util.Map;


/**
 * Klasa odzwierciedlajaca przekazany przez uzytkownika ciag obiektow do posortowania.
 * */

public class SortRequest {
    private String algorytm;
    private int[] values;


    public String getAlgorytm() {
        return algorytm;
    }

    public void setAlgorytm(String algorytm) {
        this.algorytm = algorytm;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public String toString() {
        return "Nasz algorytm to " + values;
    }
}
