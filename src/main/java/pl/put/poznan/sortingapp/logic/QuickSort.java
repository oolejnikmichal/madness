package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego QuickSort.
 */

public class QuickSort
{
    
    /**
    * Supporting function w sortowaniu.
    * @param arr zmienna reprezntująca naszą listę do posorotwania
    * @param low zmienna pomocna w sortowaniu
    * @param high zmienna pomocna w sortowaniu
    */
    
    public int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {
           
            if (arr[j] <= pivot)
            {
                i++;

                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

        /**
    * Main sorting function
    * @param arr zmienna reprezntująca naszą listę do posorotwania
    * @param low zmienna pomocna w sortowaniu
    * @param high zmienna pomocna w sortowaniu
    */
    
    public void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            
            int pi = partition(arr, low, high);

            
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    /**
    * Funkcja printująca naszą zmienną
    * @param arr zmienna reprezentująca naszą listę
    */    
    
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    
}
