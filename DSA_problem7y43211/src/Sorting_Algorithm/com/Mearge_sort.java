package Sorting_Algorithm.com;

import java.util.Arrays;

public class Mearge_sort {

	public static void main(String[] args) {
	
		int arr[]= {4,7,9,1,2,3,6,7};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 6, 7, 7, 9]
		
	}

	public  static void sort(int[] arr) {
		if(arr.length==1)return;
		int left[]= new int [arr.length/2];
		int right[]=new int [arr.length-left.length];
		
		int i =0;
		while(i<left.length) {
			left[i]=arr[i];
			i++;
		}
		int j=0;
		while(j<right.length) {
			right[j]=arr[i];
			i++;
			j++;
		}
		sort(right);
		sort(left);
		mearge(left,right,arr);
		
			
		}
		

	private static void mearge(int[] left, int[] right, int[] arr) {
		int i=0,j=0,k=0;
		while(i<left.length&&j<right.length) {
			if(left[i]<right[j]) {
				arr[k]=left[i];
				i++;
				k++;
				
			}
			else {
				arr[k]=right[j];
				j++;
				k++;
				
			}
			
		}
		while(i<left.length) {
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length) {
			arr[k]=right[j];
			j++;
			k++;
		}
		
		
	}

}
