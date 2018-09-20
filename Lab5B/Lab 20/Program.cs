using System;

namespace Lab_20
{
    class Program
    {
            static Employee Bob = new Employee("Bob", "Jones", 34500.00M);
            static Employee Susan = new Employee("Susan", "Baker", 37809.00M);
            static void Main(string[] args)
            {
                Bob.PrintData();
                Susan.PrintData();

                Bob.GiveRaise();
                Susan.GiveRaise();

                Console.WriteLine("\nIncreasing employee salaries by 10%");

                Bob.PrintData();
                Susan.PrintData();
            }
    }
}
/*
 Bob Jones: Yearly Salary: $34,500.00
Susan Baker: Yearly Salary: $37,809.00

Increasing employee salaries by 10%
Bob Jones: Yearly Salary: $37,950.00
Susan Baker: Yearly Salary: $41,589.90
Press any key to continue . . .

     */
