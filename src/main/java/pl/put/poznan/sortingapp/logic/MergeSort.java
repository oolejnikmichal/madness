package pl.put.poznan.sortingapp.logic;
/**
 * Klasa bedaca implementacja algorytmu sortujacego MergeSort.
 */
public class MergeSort {
    
    /**
    * Supporting function w sortowaniu
    * @param arr zmienna reprentująca naszą listę
    * @param l zmienna potrzebna do sortowania
    * @param m zmienna potrzebna do sortowania
    * @param m zmienna potrzebna do sortowania
    * @param r zmienna potrzebna do sortowania
    */
    
    public void merge(int arr[], int l, int m, int r)
    {
        
        int n1 = m - l + 1;
        int n2 = r - m;

        
        int L[] = new int[n1];
        int R[] = new int[n2];

        
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        
        int i = 0, j = 0;

        
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
    * Główna funkcja sortowania.
    * @param arr zmienna reprezentująca naszą funckję
    * @param l zmienna pomocna w sortowaniu
    * @param r zmienna pomocna w sortowaniu
    */
    
    public void sort(int arr[], int l, int r)
    {
        if (l < r) {
            
            int m = l + (r - l) / 2;

            
            sort(arr, l, m);
            sort(arr, m + 1, r);

            
            merge(arr, l, m, r);
        }
    }
    
    /**
    * Klasa printująca naszą funkcje.
    * @param arr zmienna reprezntująca naszą zmienną
    */
    
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

   
}
