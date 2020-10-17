package StringPrograme;

import java.util.Scanner;

public class ConvertStringInToArray {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		//String inputString = sc.nextLine();
		//System.out.println("Enter the input value: ");
		String inputString="StringValue";
		char[] ch =inputString.toCharArray();
		for(char c:ch) {
		System.out.println(c);
		}
		
		System.out.println("Another method...................");
		
		//creatin array of string length
		char[] ch2=new char[inputString.length()];
		//copy character by character into array
		for(int i=0;i<inputString.length();i++) {
			ch2[i]=inputString.charAt(i);
		}
		for(char c1:ch2 ) {
			System.out.println(c1);
			
		}

	}

}
