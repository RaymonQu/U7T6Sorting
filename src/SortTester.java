import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /*
    /* --- SELECTION SORT --- */
    int[] arr1 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6}; 
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};    
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));

    /* --- SELECTION SORT --- */
    int[] arr3 = {7547, 4354, 23424, 898797, 24324, 5435346, 5345431, 234234, 123, 5236, 9807, 2, 3, 5, 7,432, 12, 34, 21,12, 4};
    Sort.selectionSort(arr3);
    System.out.println(Arrays.toString(arr3));

    /* --- INSERTION SORT --- */
    int[] arr4 ={7547, 4354, 23424, 898797, 24324, 5435346, 5345431, 234234, 123, 5236, 9807, 2, 3, 5, 7,432, 12, 34, 21,12, 4};
    Sort.insertionSort(arr4);
    System.out.println(Arrays.toString(arr4));


  }
}
