package jobsheet6;

public class SortMain {
    public static void main(String[] args) {
        // 1. Declare the unsorted data as shown in the jobsheet result
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90}; 
        
        // 2. Instantiate the MergeSort object
        MergeSort mSort = new MergeSort(); 
        
        System.out.println("Sorting with merge sort");
        
        // 3. Display initial data
        System.out.println("Initial Data");
        mSort.printArray(data); 
        
        // 4. Perform the sorting process
        mSort.MergeSort(data); 
        
        // 5. Display the sorted result
        System.out.println("Sorted Data");
        mSort.printArray(data); 
    }
    
}
