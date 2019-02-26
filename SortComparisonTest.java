import static org.junit.Assert.*;

import java.io.File;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author
 *  @version HT 2019
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty()
    {
    	
    }
	@Test
    public void testInsertion() {
    	double[] array1 = {3.2,1.2,2.5,1.7,4.2,3.6,0.1};
    	double[] array6 = {0.1,1.2,1.7,2.5,3.2,3.6,4.2};
    	double[] array2 = {0.1,3.2,2.5,4.2,10.1,200.12,1};
    	double[] array7 = {0.1,1.0,2.5,3.2,4.2,10.1,200.12};
    	double[] array3 = {2,1};
    	double[] array8 = {1,2};
    	double[] array4 = {5};
    	double[] array9 = {5};
    	double[] array5 = {-1.2,-100,26,-3,-60};
    	double[] array10 = {-100,-60,-3,-1.2,26};
    	array1 = SortComparison.insertionSort(array1);
    	array2 = SortComparison.insertionSort(array2);
    	array3 = SortComparison.insertionSort(array3);
    	array4 = SortComparison.insertionSort(array4);
    	array5 = SortComparison.insertionSort(array5);
    	for(int i=0; i<array1.length;i++) {
    		assertTrue("check indices", array1[i]==array6[i]);
    	}
    	for(int i=0; i<array2.length;i++) {
    		assertTrue("check indices", array2[i]==array7[i]);
    	}
    	for(int i=0; i<array3.length;i++) {
    		assertTrue("check indices", array3[i]==array8[i]);
    	}
    	for(int i=0; i<array4.length;i++) {
    		assertTrue("check indices", array4[i]==array9[i]);
    	}
    	for(int i=0; i<array5.length;i++) {
    		assertTrue("check indices", array5[i]==array10[i]);
    	}

    }
	@Test
    public void testSelection() {
    	double[] array1 = {3.2,1.2,2.5,1.7,4.2,3.6,0.1};
    	double[] array6 = {0.1,1.2,1.7,2.5,3.2,3.6,4.2};
    	double[] array2 = {0.1,3.2,2.5,4.2,10.1,200.12,1};
    	double[] array7 = {0.1,1.0,2.5,3.2,4.2,10.1,200.12};
    	double[] array3 = {2,1};
    	double[] array8 = {1,2};
    	double[] array4 = {5};
    	double[] array9 = {5};
    	double[] array5 = {-1.2,-100,26,-3,-60};
    	double[] array10 = {-100,-60,-3,-1.2,26};
    	array1 = SortComparison.selectionSort(array1);
    	array2 = SortComparison.selectionSort(array2);
    	array3 = SortComparison.selectionSort(array3);
    	array4 = SortComparison.selectionSort(array4);
    	array5 = SortComparison.selectionSort(array5);
    	for(int i=0; i<array1.length;i++) {
    		assertTrue("check indices", array1[i]==array6[i]);
    	}
    	for(int i=0; i<array2.length;i++) {
    		assertTrue("check indices", array2[i]==array7[i]);
    	}
    	for(int i=0; i<array3.length;i++) {
    		assertTrue("check indices", array3[i]==array8[i]);
    	}
    	for(int i=0; i<array4.length;i++) {
    		assertTrue("check indices", array4[i]==array9[i]);
    	}
    	for(int i=0; i<array5.length;i++) {
    		assertTrue("check indices", array5[i]==array10[i]);
    	}

    }
	@Test
	public void testQuick() {
    	double[] array1 = {3.2,1.2,2.5,1.7,4.2,3.6,0.1};
    	double[] array6 = {0.1,1.2,1.7,2.5,3.2,3.6,4.2};
    	double[] array2 = {0.1,3.2,2.5,4.2,10.1,200.12,1};
    	double[] array7 = {0.1,1.0,2.5,3.2,4.2,10.1,200.12};
    	double[] array3 = {2,1};
    	double[] array8 = {1,2};
    	double[] array4 = {5};
    	double[] array9 = {5};
    	double[] array5 = {-1.2,-100,26,-3,-60};
    	double[] array10 = {-100,-60,-3,-1.2,26};
    	array1 = SortComparison.quickSort(array1, 0, 6);
    	array2 = SortComparison.quickSort(array2,0,6);
    	array3 = SortComparison.quickSort(array3,0,1);
    	array4 = SortComparison.quickSort(array4,0,0);
    	array5 = SortComparison.quickSort(array5,0,4);
    	for(int i=0; i<array1.length;i++) {
    		assertTrue("check indices", array1[i]==array6[i]);
    	}
    	for(int i=0; i<array2.length;i++) {
    		assertTrue("check indices", array2[i]==array7[i]);
    	}
    	for(int i=0; i<array3.length;i++) {
    		assertTrue("check indices", array3[i]==array8[i]);
    	}
    	for(int i=0; i<array4.length;i++) {
    		assertTrue("check indices", array4[i]==array9[i]);
    	}
    	for(int i=0; i<array5.length;i++) {
    		assertTrue("check indices", array5[i]==array10[i]);
    	}

    }
	@Test
    public void testMergeIterative() {
    	double[] array1 = {3.2,1.2,2.5,1.7,4.2,3.6,0.1};
    	double[] array6 = {0.1,1.2,1.7,2.5,3.2,3.6,4.2};
    	double[] array2 = {0.1,3.2,2.5,4.2,10.1,200.12,1};
    	double[] array7 = {0.1,1.0,2.5,3.2,4.2,10.1,200.12};
    	double[] array3 = {2,1};
    	double[] array8 = {1,2};
    	double[] array4 = {5};
    	double[] array9 = {5};
    	double[] array5 = {-1.2,-100,26,-3,-60};
    	double[] array10 = {-100,-60,-3,-1.2,26};
    	array1 = SortComparison.mergeSortIterative(array1);
    	array2 = SortComparison.mergeSortIterative(array2);
    	array3 = SortComparison.mergeSortIterative(array3);
    	array4 = SortComparison.mergeSortIterative(array4);
    	array5 = SortComparison.mergeSortIterative(array5);
    	for(int i=0; i<array1.length;i++) {
    		assertTrue("check indices", array1[i]==array6[i]);
    	}
    	for(int i=0; i<array2.length;i++) {
    		assertTrue("check indices", array2[i]==array7[i]);
    	}
    	for(int i=0; i<array3.length;i++) {
    		assertTrue("check indices", array3[i]==array8[i]);
    	}
    	for(int i=0; i<array4.length;i++) {
    		assertTrue("check indices", array4[i]==array9[i]);
    	}
    	for(int i=0; i<array5.length;i++) {
    		assertTrue("check indices", array5[i]==array10[i]);
    	}

    }
	@Test
    public void testMergeRecursive() {
		double[] array1 = {3.2,1.2,2.5,1.7,4.2,3.6,0.1};
    	double[] array6 = {0.1,1.2,1.7,2.5,3.2,3.6,4.2};
    	double[] array2 = {0.1,3.2,2.5,4.2,10.1,200.12,1};
    	double[] array7 = {0.1,1.0,2.5,3.2,4.2,10.1,200.12};
    	double[] array3 = {2,1};
    	double[] array8 = {1,2};
    	double[] array4 = {5};
    	double[] array9 = {5};
    	double[] array5 = {-1.2,-100,26,-3,-60};
    	double[] array10 = {-100,-60,-3,-1.2,26};
    	array1 = SortComparison.mergeSortRecursive(array1, 0, 6);
    	array2 = SortComparison.mergeSortRecursive(array2,0,6);
    	array3 = SortComparison.mergeSortRecursive(array3,0,1);
    	array4 = SortComparison.mergeSortRecursive(array4,0,0);
    	array5 = SortComparison.mergeSortRecursive(array5,0,4);
    	for(int i=0; i<array1.length;i++) {
    		assertTrue("check indices", array1[i]==array6[i]);
    	}
    	for(int i=0; i<array2.length;i++) {
    		assertTrue("check indices", array2[i]==array7[i]);
    	}
    	for(int i=0; i<array3.length;i++) {
    		assertTrue("check indices", array3[i]==array8[i]);
    	}
    	for(int i=0; i<array4.length;i++) {
    		assertTrue("check indices", array4[i]==array9[i]);
    	}
    	for(int i=0; i<array5.length;i++) {
    		assertTrue("check indices", array5[i]==array10[i]);
    	}

    }




	// TODO: add more tests here. Each line of code and ech decision in Collinear.java should
    // be executed at least once from at least one test.

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
	
	//Exact same as SortComparison Main
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

}
