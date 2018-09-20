package lab4;
import java.util.Scanner;

public class sales {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total[] = new int[11];
		
		for (int i = 0; i < total.length; i++ ) {
			total[i] = 0;
		}
		
		System.out.print("Enter Sales Amount (negative to end): ");
		double dollars = scan.nextDouble();
		
		while (dollars>=0) {
			double salary = dollars * 0.09 + 200;
			
			int range = (int) (salary/100);
			
			if (range > 10) 
				range = 10;
			
			++total[range];
			
			System.out.print("Enter sales amount (negative to end): ");
			dollars = scan.nextDouble();
		}
			
			System.out.println("\nRange\t\tNumber");
			
			for (int range = 2; range < total.length - 1; range++) {
				System.out.printf("$%d-$%d\t%d\n", (100*range), (100+100*range),total[range]);
			}
		
			System.out.printf("$1000 and over\t%d\n", total[total.length-1]);
			
			scan.close();
	}
}

/*Enter Sales Amount (negative to end): 1000
Enter sales amount (negative to end): 2000
Enter sales amount (negative to end): 3000
Enter sales amount (negative to end): 4000
Enter sales amount (negative to end): 5000
Enter sales amount (negative to end): 6000
Enter sales amount (negative to end): 7000
Enter sales amount (negative to end): 8000
Enter sales amount (negative to end): 9000
Enter sales amount (negative to end): 10000
Enter sales amount (negative to end): -1

Range		Number
$200-$300	1
$300-$400	1
$400-$500	1
$500-$600	1
$600-$700	1
$700-$800	1
$800-$900	1
$900-$1000	1
$1000 and over	2*/


