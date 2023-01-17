package pl.put.poznan.sortingapp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.sortingapp.app.SortingappApplication;
import pl.put.poznan.sortingapp.logic.*;

import java.util.Arrays;

/**
 * Klasa kontrolująca dzialanie logiki REST.
 * */

@RestController
public class SortingappApplicationController {

    /**
     *
     * @return zwraca "BAD REQUEST w przypadku podania pustego zbioru do sortowania bądź złej nazwy zbioru
     * */

    @RequestMapping("/sort")
    public String printTestSort(@RequestBody SortRequest sc) {
        if (sc.getValues().length == 0 || sc.getAlgorytm().isEmpty()) {
            return "BAD REQUEST";
        }

        /**
         * @param alg_name reprezentuje nazwę alogrytmu sortującego podaną przez użytkownika w formacie JSON
         * @param starttime oznacz czas rozpoczęcia algorytmu sortowania
         * @return zwraca nazwe podanego przez użytkownika algorytmu sortującego wraz z posortowanym zbiorem i czasem sortowania zbioru
         * */

        String alg_name = sc.getAlgorytm();
        long startTime = System.currentTimeMillis();
        switch(alg_name) {
            case "bubble":
                BubbleSort ob = new BubbleSort();

                ob.bubbleSort(sc.getValues());

                return "BubbleSort " + Arrays.toString(sc.getValues()) + " czas wykonania algorytmu to " + (System.currentTimeMillis() - startTime) + " milisekundy";
            case "insert":
                InsertionSort ob1 = new InsertionSort();

                ob1.sort(sc.getValues());;

                return "InsertionSort " + Arrays.toString(sc.getValues()) + " czas wykonania algorytmu to " + (System.currentTimeMillis() - startTime) + " milisekundy";
            case "merge":
                MergeSort ob2 = new MergeSort();

                ob2.sort(sc.getValues(), 0, sc.getValues().length - 1);

                return "MergeSort " + Arrays.toString(sc.getValues()) + " czas wykonania algorytmu to " + (System.currentTimeMillis() - startTime) + " milisekundy";
            case "quick":
                QuickSort ob3 = new QuickSort();

                ob3.sort(sc.getValues(), 0, sc.getValues().length-1);

                return "QuickSort " + Arrays.toString(sc.getValues()) + " czas wykonania algorytmu to " + (System.currentTimeMillis() - startTime) + " milisekundy";
            case "select":
                SelectionSort ob4 = new SelectionSort();

                ob4.sort(sc.getValues());

                return "SelectionSort " + Arrays.toString(sc.getValues()) + " czas wykonania algorytmu to " + (System.currentTimeMillis() - startTime) + " milisekundy";
            case "heap":
                HeapSort ob5 = new HeapSort();
                int N = sc.getValues().length;

                ob5.sort(sc.getValues());

                return "HeapSort " + Arrays.toString(sc.getValues()) + " czas wykonania algorytmu to " + (System.currentTimeMillis() - startTime) + " milisekundy";

        }
        return "Error";
    }

}

