using System;

public class timeTester
{

	public static void Main(string[] args)
	{
		Time a = new Time();
		Time b = new Time(3,20,20);
		Time c = new Time(13,45);
		Time d = new Time(15);
		Time e = new Time(b);

		Console.WriteLine("Universal time is " + a.toUniversalString());
		Console.WriteLine("Standard time is " + a.ToString() + "\n");

		Console.WriteLine("Universal time is " + b.toUniversalString());
		Console.WriteLine("Standard time is " + b.ToString() + "\n");

		Console.WriteLine("Universal time is " + c.toUniversalString());
		Console.WriteLine("Standard time is " + c.ToString() + "\n");

		Console.WriteLine("Universal time is " + d.toUniversalString());
		Console.WriteLine("Standard time is " + d.ToString() + "\n");

		Console.WriteLine("Universal time is " + e.toUniversalString());
		Console.WriteLine("Standard time is " + e.ToString() + "\n");

		b.setTime(13, 27, 06);
		Console.WriteLine("Universal time is " + b.toUniversalString());
		Console.WriteLine("Standard time is " + b.ToString());
	}
}

