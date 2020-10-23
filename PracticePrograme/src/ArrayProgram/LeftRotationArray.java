package ArrayProgram;

import java.util.Scanner;

public class LeftRotationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] myArray =new int[] {1,2,3,4,5,6,7};
		int [] outputArray=new int[myArray.length];
		Scanner sc = new Scanner(System.in);
		int noOfRotation=sc.nextInt();
		int rotatingPoint=noOfRotation;
		int i=0;
		while(rotatingPoint<myArray.length) {
		
		outputArray[i]= myArray[rotatingPoint];
		i++;
		rotatingPoint++;
		
		}
		System.out.println("Print for one loop array .......");
		for(int array:outputArray) {
			System.out.println(array + " ");
			
		}
		
		
		rotatingPoint=0;
		while(rotatingPoint<noOfRotation) {
			
			outputArray[i]= myArray[rotatingPoint];
			i++;
			rotatingPoint++;
			
			}
			
		System.out.println("Output Array is.......");
		for(int array:outputArray) {
			System.out.println(array + " ");
			
		}
		
		
	}

}
