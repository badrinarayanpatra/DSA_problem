package Arrayallquestion.com;
//write the java programm to count no of zeros present in array
public class Count_no_of_Zero {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,0,8,0,8,0,9,7,6,0};
	int count=0;
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]==0) {
			count++;
			
		}
	}
	System.out.println("the number of zeros is:"+count);
	
	

	}

}
