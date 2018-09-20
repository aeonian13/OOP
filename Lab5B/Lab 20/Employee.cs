using System;

namespace Lab_20
{
    class Employee
    {
        public Employee(string _first, string _last, decimal _sal)
        {
            FirstName = _first;
            LastName = _last;
            YearlySalary = _sal;
        }
        public void GiveRaise()
        {
            YearlySalary *= 1.10M;
        }
        public void PrintData()
        {
            Console.WriteLine($"{FirstName} {LastName}: Yearly Salary: {YearlySalary:C}");
        }

        private string FirstName {get; set;}
        private string LastName {get; set;}
        private decimal YearlySalary {get; set;}
    }
}

