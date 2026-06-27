package Arrayallquestion.com;
//write a java programm to print sum even index value and sum of odd index value
public class print_evenindexvalue_sum_and_oddindexvalue_sum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int even=0;
		int odd=0;
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				even+=arr[i];
			}
			else {
				odd+=arr[i];
			}
			
			
			
		}
		
		System.out.println("the eve index sum is:"+even);
		System.out.println("the odd index value :"+odd);
		
		
		
		
	}

}
