package lab3b;

import java.util.Scanner;

public class lab3b {

	static final int DOLLARS = 100;
	static final int QUARTERS = 25;
	static final int DIMES = 10;
	static final int NICKELS = 5;
	
	
	public static void main(String[] args) {
		
		int cents, dol, quart, dim, nick, remaining;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter pennies: ");
		cents = scan.nextInt();
		
	      	dol = cents/DOLLARS;
	      	remaining = cents % DOLLARS;
	      	quart = remaining/QUARTERS;
	      	remaining = remaining % QUARTERS;
	      	dim = remaining/DIMES;
	      	remaining = remaining % DIMES;
	      	nick = remaining/NICKELS;
	      	remaining = remaining % NICKELS;
		
		System.out.printf(" Original Amount: %s",cents);
		System.out.printf("\n Number of Dollars: %s",dol);
		System.out.printf("\n Number of Quarters: %s",quart);
		System.out.printf("\n Number of Dimes: %s",dim);
		System.out.printf("\n Number of Nickels: %s",nick);
		System.out.printf("\n Number of Pennies: %s",remaining);
		scan.close();
	}
}

/*
Please enter pennies: 141
Original Amount: 141
Number of Dollars: 1
Number of Quarters: 1
Number of Dimes: 1
Number of Nickels: 1
Number of Pennies: 1
*/

/*
Please enter pennies: 667
Original Amount: 667
Number of Dollars: 6
Number of Quarters: 2
Number of Dimes: 1
Number of Nickels: 1
Number of Pennies: 2
*/