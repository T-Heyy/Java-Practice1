package Practice1;

//ctrl+shift+o
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Practice1 {
	public void getValue1(){
		int a = 5, b = 5;
		int x = 2 * ++a;
		int y = 2 * b++;
		System.out.println("a="+a+",b="+b);
		System.out.println("x="+x+",y="+y);
		System.out.println("x=2*6,y=2*5");
	}
	
	public void getValue2(){
		int c = 8, d = 10;
		int result = ((d++)+(++c)) + ((d++)+(c++));
		System.out.println("((d++)+(++c)) + ((d++)+(c++)) = "+result);
	}
	
	public void inferOddOrEven(int intNum){
		if(intNum % 2 == 0){
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
	
	public void getMin(double intNum1, double intNum2, double intNum3) {
		if (intNum1 <= intNum2) {
			if (intNum1 <= intNum3) {
				System.out.println("Min:"+intNum1);
			} else {
				System.out.println("Min:"+intNum3);
			}
		} else {
			if (intNum2 <= intNum3) {
				System.out.println("Min:"+intNum2);
			} else {
				System.out.println("Min:"+intNum3);
			}
		}
	}
	
	public void inferLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) ||(year % 400 == 0)) {
			System.out.println(year+" is a leap-year.");
		} else if (year <= 0) {
			System.out.println("Error input!");
		} else {
			System.out.println(year+" isn`t a leap year.");
		}
	}
	
	public void inferDaysOfMonth(int year, int month) {
		int days = 0;
		switch (month) {
			case 2:
				days = 0;
				if ((year % 4 == 0) && (year % 100 != 0) ||(year % 400 == 0)) {
					days = 29;
					System.out.println("The days of 2 is " + days +" days.");
				} else if (year <= 0) {
					System.out.println("Error input!");
				} else {
					days = 28;
					System.out.println("The days of 2 is " + days +" days.");
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
			    System.out.println("The days of " + month + " are " + days + " days.");
			    break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				System.out.println("The days of " + month + " are " + days + " days.");
				break;
			default:
				System.out.println("Error month");
				break;
		}
	}
	
	public void printSquare(int intNum) {
		for (int i = 0; i < intNum; i++) {
			for (int j = 0; j < intNum; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void printTriangle(int intNum) {
		for (int i = 0; i < intNum; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			for (int j = intNum; j > i; j--) {
				System.out.print("");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void printHolloTria(int intNum) {
		for (int i = 1; i <= intNum; i++) {
			for (int j = 1; j <= intNum; j++) {
				if (i == intNum ) {
					System.out.print("#");
				} else {
					if ( i == j || j == 1) {
						System.out.print("#");	
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void printMultiTable() {
		int i = 1, j = 1;
		while(i < 10) {
			j = 1;
			while (j <= i) {
				System.out.print(i + "x" + j + "=" + i*j + "; ");
				j++;
			}
			System.out.println("");
			i++;
		}
//		do {
//			j = 1;
//			while (j <= i) {
//				System.out.print(i + "x" + j + "=" + i*j + "; ");
//				j++;
//			}
//			System.out.println("");
//			i++;
//		} while (i < 10);
	}
	
	public void guessNum() {
		Random random1 = new Random();
		int realNum = random1.nextInt(100);
		int intNum = 0;
		System.out.print("Please input a num from 0 to 100:");
		Scanner scanner4 = new Scanner(System.in);
		intNum = scanner4.nextInt();
		scanner4.close();
		while (true) {
			if (intNum < 0 || intNum > 100) {
				System.out.print("Error input.Please input again:");
				intNum  = scanner4.nextInt();
			} else {
				if (intNum > realNum) {
					System.out.print("Too large.Please input again:");
					intNum  = scanner4.nextInt();
				} else if (intNum < realNum) {
					System.out.print("Too small.Please input again:");
					intNum  = scanner4.nextInt();
				} else {
					System.out.println("Bingo!");
					break;
				}
			}
			
		}	
	}
	
	public void setArray(int[] intArray) {
		Arrays.sort(intArray);
		System.out.println("Sorted Array: " + Arrays.toString(intArray));
	}
	
}
