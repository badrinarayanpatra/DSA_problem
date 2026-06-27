package Arrayallquestion.com;
//WRITE THE JAVA PROGRAMM TO STORE THE CHARECTER IN AN ARRAY AND PRINT THE CHARECTER IN REVERSE ORDER




public class Store_the_charecter_in_array {
	public static void main(String[] args) {
		char[]ch= {'B','A','D','R','I'};
		int i=0;
		int j=ch.length-1;
		while(1<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
			
		}
		System.out.println(ch+" ");
		
	}
	

}
