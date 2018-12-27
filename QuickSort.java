package datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	
	public static void main(String args[]) {
		System.out.println("Enter array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		 int [] myArray = new int[size];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<size; i++ ) {
	         myArray[i] = sc.nextInt();
	      }
	      System.out.println(Arrays.toString(myArray));
	    
	      quicksort(myArray, 0, myArray.length - 1);
	}
	
	private static void quicksort(int[] array, int low, int high) {
		if(low < high) {
		int p = partition(array, low, high);
		
		quicksort(array, low, p-1);
		quicksort(array, p+1, high);

	      System.out.println(Arrays.toString(array));
		}
	}

	private static int partition(int[] array, int low, int high) {
		int p = array[high];
		int counter = low;
		
		for (int i = counter + 1; i <= high; i++) {
			if(array[i] < p) {
				swap(array, low, i);
				low++;
			}
		}
		swap(array, high, low + 1);
		return low + 1;
	}

	private static void swap(int[] array, int low, int i) {
		int temp = array[low];
		array[low] = array[i];
		array[i] = temp;
		
	}
}
