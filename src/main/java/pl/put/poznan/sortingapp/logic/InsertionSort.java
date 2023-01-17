package pl.put.poznan.sortingapp.logic;
/**
 * Klasa bedaca implementacja algorytmu sortujacego InsertionSort.
 */

public class InsertionSort {
    
    /**
    * Główna funkcja sortująca
    * @param arr zmienna reprezentująca listę do posrotwania
    */
    
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /**
    * Funkcja printująca naszą listę
    * @param arr zmienna reprezentująca listę do posrotwania
    */
    
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    
};
