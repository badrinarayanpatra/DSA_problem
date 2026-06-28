package Arrayallquestion.com;


//Write the java programm to print thr 2nd last element in a array

public class print_second_last_element_inarray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<=arr.length-1;i++) {
			if(i==arr.length-2) {
				System.out.println(arr[i]+" ");
			}
		}
	}

}
