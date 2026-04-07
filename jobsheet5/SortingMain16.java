package jobsheet5;

public class SortingMain16 {
    public static void main(String[] args) {
// BUBBLE SORT
        int [] a = {34, 7, 32, 32, 5, 62};
        Sorting16 sorting = new Sorting16(a);

        System.out.println("ORIGINAL ARRAY");
        // step 1: print the original array
        sorting.print();
        // step 2: sort the array using bubble sort
        sorting.bubbleSort();
        System.out.println("SORTED ARRAY (BUBBLE SORT) ");
        // step 3: print the sorted array
        sorting.print();

        System.out.println("\n==================================\n");

// SELECTION SORT
        int [] b = {30, 20, 2, 8, 14};
        Sorting16 sorting2 = new Sorting16(b);

        System.out.println("ORIGINAL ARRAY");
        // step 1: print the original array
        sorting2.print();
        // step 2: sort the array using selection sort
        sorting2.selectionSort();
        System.out.println("SORTED ARRAY (SELECTION SORT) ");
        // step 3: print the sorted array
        sorting2.print();
        
        System.out.println("\n==================================\n");
        
// INSERTION SORT
        int [] c = {40, 10, 4, 9, 3};
        Sorting16 sorting3 = new Sorting16(c);

        System.out.println("ORIGINAL ARRAY");
        // step 1: print the original array
        sorting3.print();
        // step 2: sort the array using insertion sort
        sorting3.insertionSort();
        System.out.println("SORTED ARRAY (INSERTION SORT) ");
        // step 3: print the sorted array
        sorting3.print();
    }
}
