package Sorting_Algorithm.com;

public class Selection_Sort {

	public static void main(String[] args) {
	
		int arr[]= {7,8,9,5,4,1,24};
		for(int i=0;i<arr.length;i++) {
			int Smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[Smallest]>arr[j]) {
					Smallest=j;
				}
			}
			int temp=arr[Smallest];
			arr[Smallest]=arr[i];
			arr[i]=temp;
		}
		printarry(arr);
		
	}

	private static void printarry(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}


