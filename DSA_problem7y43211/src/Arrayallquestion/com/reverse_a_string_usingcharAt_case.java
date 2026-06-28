package Arrayallquestion.com;

public class reverse_a_string_usingcharAt_case {

	public static void main(String[] args) {
		String s1= "BADRINARAYAN";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			char ch=(char) s1.charAt(i);
			s2+=ch;
		}
		System.out.println(s2);
	}

}
