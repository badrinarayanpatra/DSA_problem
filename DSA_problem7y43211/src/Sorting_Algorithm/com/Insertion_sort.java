package Sorting_Algorithm.com;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		int arr[]= {7,8,9,1,2,3};
		inserstionsort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void inserstionsort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int j=i;
			while(j>0 && arr[j]<arr[j-1]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
	}

}
