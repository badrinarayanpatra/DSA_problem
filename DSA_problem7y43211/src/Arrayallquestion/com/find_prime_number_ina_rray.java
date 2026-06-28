package Arrayallquestion.com;

//Write a java programm to print prime number in a given array

public class find_prime_number_ina_rray {

	public static void main(String[] args) {
	int arr[]= {1,21,45,2,4,3,4,5,6,7,78,9,};
	
	
	for(int i=0;i<=arr.length-1;i++) {
		int n=arr[i];
		int count=0;
		for(int j=1;j<=n;j++) {
			if(n%j==0) {
				count++;
				
			}
		}
		if(count==2) {
			System.out.println(n+" ");
		}
	}

	}

}
