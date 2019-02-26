import java.io.File;
import java.util.Scanner;

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author Luka Hickey
 *  @version HT 2019
 *  
 *  Questions to be Answered:
 *  
 *  a: Selection sort and Insertion sort are heavily affected 
 *  by the order of input
 *  b:
 *  c:SelectionSort scales the worst, quicksort and recursive mergesort scale the best
 *  d: Recursive MergeSort was faster than Iterative mergesort in my case
 *  e: quicksort or mergeSort recursive were tied as the fastest for all 7 files.
 */ 


 class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    public static double [] insertionSort (double a[]){
        for (int i = 1; i<a.length; i++) {
        	int j = i - 1;
        	double key = a[i];
        	
        	while (j>=0 && a[j]>key) {
        		a[j+1] = a[j];
        		j--;
        	}
        	a[j+1] = key;
        }
        return a;
    }//end insertionsort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @param low:starting index
     * @param high:finishing index
     * @param static int partition: Partitioning method
     * @return array sorted in ascending order
     *
     */
    
    //partition method
    static int partition(double arr[], int low, int high) 
    { 
        double pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                double temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        double temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
    
    static double [] quickSort (double a[], int low, int high){
    	if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(a, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            quickSort(a, low, pi-1); 
            quickSort(a, pi+1, high); 
        } 
    	return a;
	
		 //todo: implement the sort

    }//end quicksort

    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

   
    
    static double[] mergeSortIterative (double a[]) {

    	if(a == null)
        {
            return a;
        }
 
        if(a.length > 1)
        {
            int mid = a.length / 2;
 
            // Split left part
            double[] left = new double[mid];
            for(int i = 0; i < mid; i++)
            {
                left[i] = a[i];
            }
             
            // Split right part
            double[] right = new double[a.length - mid];
            for(int i = mid; i < a.length; i++)
            {
                right[i - mid] = a[i];
            }
            mergeSortIterative(left);
            mergeSortIterative(right);
 
            int i = 0;
            int j = 0;
            int k = 0;
 
            // Merge left and right arrays
            while(i < left.length && j < right.length)
            {
                if(left[i] < right[j])
                {
                    a[k] = left[i];
                    i++;
                }
                else
                {
                    a[k] = right[j];
                    j++;
                }
                k++;
            }
            // Collect remaining elements
            while(i < left.length)
            {
                a[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length)
            {
                a[k] = right[j];
                j++;
                k++;
            }
        }
	return a;
    }//end mergesortIterative
    
    
    
    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    
    static void merge(double arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        double L[] = new double [n1]; 
        double R[] = new double [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
    static double[] mergeSortRecursive (double a[], int l, int r) {
    	if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            mergeSortRecursive(a, l, m); 
            mergeSortRecursive(a, m+1, r); 
  
            // Merge the sorted halves 
            merge(a, l, m, r); 
        } 

    	return a;
	
   }//end mergeSortRecursive
    	
    
    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[]){

    	int n = a.length; 
    	  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (a[j] < a[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            double temp = a[min_idx]; 
            a[min_idx] = a[i]; 
            a[i] = temp; 
        } 
        return a;

    }//end selectionsort

   


    public static void main(String[] args)
    {
    	double[] array1 = new double[1000];
    	double[] array2 = new double[100];
    	double[] array3 = new double[1000];
    	double[] array4 = new double[1000];
    	double[] array5 = new double[1000];
    	double[] array6 = new double[1000];
    	double[] array7 = new double[1000];//Use arrays for text file input
    	double[] temp;
    	try {
    	File file1 = new File("numbersSorted1000.txt");  //change file to desired input file
    	Scanner scanner1 = new Scanner(file1);
    	
    	for(int i =0; i<10; i++) {
    		array1[i]=scanner1.nextDouble();  //read in doubles to array from txt file
    	}
    	
    	//Then record time for each algorithm
    	temp = array1;
    	long start = System.currentTimeMillis();
    	array1= SortComparison.insertionSort(array1);
    	long end = System.currentTimeMillis();
    	System.out.println("DEBUG: Insertion Sort took " + (end - start) + " MilliSeconds");
    	
    	array1 = temp;
    	long start1 = System.currentTimeMillis();
    	array1= SortComparison.selectionSort(array1);
    	long end1 = System.currentTimeMillis();
    	System.out.println("DEBUG: Selection Sort took " + (end1 - start1) + " MilliSeconds");
    	
    	array1 = temp;
    	long start2 = System.currentTimeMillis();
    	array1= SortComparison.mergeSortRecursive(array1,0,9);
    	long end2 = System.currentTimeMillis();
    	System.out.println("DEBUG: Recursive Merge took " + (end2 - start2) + " MilliSeconds");
    	
    	array1 = temp;
    	long start3 = System.currentTimeMillis();
    	array1= SortComparison.quickSort(array1,0,9);
    	long end3 = System.currentTimeMillis();
    	System.out.println("DEBUG: QuickSort took " + (end3 - start3) + " MilliSeconds");
    	
    	array1 = temp;
    	long start4 = System.currentTimeMillis();
    	array1= SortComparison.mergeSortIterative(array1);
    	long end4 = System.currentTimeMillis();
    	System.out.println("DEBUG: Iterative Merge  took " + (end4 - start4) + " MilliSeconds");
    	
    	
    	} catch (Exception ex) {
            ex.printStackTrace();
        }
    }

 }//end class
