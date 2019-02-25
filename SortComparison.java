
/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author Luka Hickey
 *  @version HT 2019
 */

 class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    static double [] insertionSort (double a[]){
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

   


    public static void main(String[] args) {
    	double[] array = {3.2,1.2,2.5,1.7,4.2,3.6,0.1};
    	array = mergeSortIterative(array);
    	for(int i = 0; i<array.length; i++) {
    		System.out.print(array[i]);
    		System.out.println();
    	}

        //todo: do experiments as per assignment instructions
    }

 }//end class
