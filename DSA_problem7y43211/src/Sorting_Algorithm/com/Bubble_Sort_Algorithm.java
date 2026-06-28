package Sorting_Algorithm.com;

public class Bubble_Sort_Algorithm {

	public static void main(String[] args) {
		int arr[]= {7,6,5,8,9,1,3};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		printarray(arr);
	}

	public  static void printarray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
