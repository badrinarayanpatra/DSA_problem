package Arrayallquestion.com;
import java.util.Scanner;
public class insert_the_even_value {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int i=0;
		System.out.println("enter the value");
		while(i<arr.length) {
			int n=sc.nextInt();
			if(n%2==0) {
				arr[i]=n;
				i++;
				
			}else {
				System.out.println(" enter only even number");
			}
		}
		
		for(int i1=0;i1<arr.length;i1++) {
			System.out.println(arr[i1]+" ");
		}
	}

}
