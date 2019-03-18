package Practice1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Practice1 ins1 = new Practice1();
		ins1.getValue1();
		ins1.getValue2();
		
		System.out.print("Please input a num:");
		Scanner scanner0 = new Scanner(System.in);
		int intNum1 = scanner0.nextInt(); 
		ins1.inferOddOrEven(intNum1);
		
		int intNum2 = 4, intNum3 = 5, intNum4 = 6;
		ins1.getMin(intNum2, intNum3, intNum4);
		
		System.out.print("Please input the year:");
		Scanner scanner1 = new Scanner(System.in);
		int year = scanner1.nextInt();
		ins1.inferLeapYear(year);
		System.out.print("Please input the month:");
		Scanner scanner2 = new Scanner(System.in);
		int month = scanner2.nextInt();
		ins1.inferDaysOfMonth(year, month);
		
		//For a pause
		System.out.println("Please input anything to continue:");
		Scanner scannerPause = new Scanner(System.in);
		scannerPause.next();
		scannerPause.close();

		ins1.printSquare(5);
		ins1.printTriangle(5);
		ins1.printHolloTria(5);
		
		ins1.printMultiTable();
		ins1.guessNum();
		
		int[] intArray = new int [10];
		Random random = new Random();
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = random.nextInt(99); 
		}
		System.out.println("Unsorted Array: " + Arrays.toString(intArray));
		ins1.setArray(intArray);
		
		scanner0.close();
		scanner1.close();
		scanner2.close();
		//scanner4.close();
	}
}
