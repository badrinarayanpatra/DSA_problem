package Arrayallquestion.com;
//Write the java programm to count the occurance of each element in a given array
public class count_occurance_of_each_element {

	public static void main(String[] args) {
		int arr[]= {1,2,0,3,1,3,4,5,5,4,3,2,1,3,4};
		for(int i=0;i<arr.length;i++) {
			
			
			boolean printed=false;
			
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {
					printed= true;
					break;
				}
			}
			if(!printed) {
				int count=0;
				for(int j=i;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						
					}
				}
				System.out.println("occurance of:"+arr[i]+" is"+count);
			}
		}

	}

}
