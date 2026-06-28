package Arrayallquestion.com;
//print an array last index value of a given element
//input-{1,9,3,9,5,9,7,8,9,0};
//output-9-8
public class find_last_occurance_index_value {

	public static void main(String[] args) {
		int arr[]={1,9,3,9,5,9,7,8,9,0};
	     int key=9;
	     int lastindex=0;
	     for(int i=0;i<=arr.length-1;i++) {
	    	 if(key==arr[i]) {
	    		 lastindex=i;
	    	 }
	     }
	System.out.println(lastindex);
		
	}

}
