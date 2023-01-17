package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego SelectionSort.
 */


import java.io.*;
public class SelectionSort
{
    
    /**
    * Main sorting function 
    * @param arr zmienna reprezentująca naszą litsę do posortowania
    */
    
    public void sort(int arr[])
    {
        int n = arr.length;

        
        for (int i = 0; i < n-1; i++)
        {
            
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
    /**
    * Funkcja printująca
    * @param arr zmienna reprezentująca naszą listę do posortowania
    */
    
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    
}
