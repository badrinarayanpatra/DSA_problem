package Arrayallquestion.com;

public class creatingarray {

	public static void main(String[] args) {
		
		//first way to create array
	int arr1[]= {1,2,3,4,4};
	for(int arr:arr1) {
		System.out.print(arr+" ");
	
	}
	System.out.println();
	
	//2nd way to create array
	int arr2[]=new int[4];
	arr2[0]=10;
	arr2[1]=20;
	arr2[2]=30;
	arr2[3]=40;
	
	for(int arrr:arr2) {
		System.out.print(arrr+" ");
	}
	
	
	

	}

}
