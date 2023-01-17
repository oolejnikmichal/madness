package pl.put.poznan.sortingapp.logic;

import java.util.*;

/**
 * Klasa bedaca implementacja algorytmu sortujacego BubbleSort.
 */

public class BubbleSort {


    /**
     * Główna funkcja sortująca
     * @param arr reprezentuje liste do posortowania
     */
    public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    /**
     * funkcja printujaca liste
     * @param arr oznacza liste ktora pirntarray ma wypisać
     */
    
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
