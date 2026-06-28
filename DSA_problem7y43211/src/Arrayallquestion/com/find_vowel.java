package Arrayallquestion.com;
//write th ejava programm to print vowel present in an array
public class find_vowel {

	public static void main(String[] args) {
		
		char[]ch= {'B','A','D','R','I'};
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='u') {
				System.out.println(ch[i]);
			}
		}
	}

}
