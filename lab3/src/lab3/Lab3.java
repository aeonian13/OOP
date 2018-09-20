package lab3;
import java.util.Scanner;

public class lab3 {


	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int num, num1, num2, num3,  num4, num5;
	
	System.out.print("Enter a number with 5 digits: ");
	num = scan.nextInt();
	
	num1 = num / 10000;
	num2 = (num % 10000) / 1000;
	num3 = ((num % 10000) % 1000) / 100;
	num4 = (((num % 10000) % 1000) % 100) / 10;
	num5 = (((num % 10000) % 1000) % 100) % 10;
	
	System.out.printf("Digits in %d are : %d %d %d %d %d%n", num, num1, num2, num3, num4, num5);
	
	scan.close();
	
		 }
	}

/*
Enter a number with 5 digits: 50739
Digits in 50739 are : 5 0 7 3 9
*/