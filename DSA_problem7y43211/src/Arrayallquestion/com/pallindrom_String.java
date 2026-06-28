package Arrayallquestion.com;

public class pallindrom_String {

	public static void main(String[] args) {
		
			String s1="madam";
			String s2="";
			for(int i=s1.length()-1;i>=0;i--){
			char ch=s1.charAt(i);
			s2+=ch;
			}
			if(s2.equals(s1))
					{
			System.out.println("pallindrom");
			}
			else{ System.out.println("nat a pallindrom");
			}
			}

	
	}


