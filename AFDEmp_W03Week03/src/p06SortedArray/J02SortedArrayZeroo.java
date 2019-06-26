package p06SortedArray;

import java.util.Scanner;

public class J02SortedArrayZeroo {

	public static void main(String[] args) {
		int array1[] = new int [10];
		int array2[] = {1,2,3,4,5,6,7,8,9,9};
		
		
		System.out.println("Enter number");
		Scanner x = new Scanner(System.in);
		int input = x.nextInt();
		

		for (int i = 0; i < array2.length; i++) {			
			if (array2[i] == input) {				
				System.out.println("Correct");
				System.out.println(array2[i]);
				break;
			}else {
				System.out.println("Not found");
			}
		}
		
	x.close();

	}

}


/*
Scanner userInput = new Scanner(System.in);


double radius=userInput.nextDouble();

userInput.close();
*/