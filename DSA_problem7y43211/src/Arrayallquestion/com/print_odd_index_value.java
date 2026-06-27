package Arrayallquestion.com;
//Write a java programm to print odd index value of an array
public class print_odd_index_value {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				System.out.println(arr[i]+" ");
			}
		}

	}

}
