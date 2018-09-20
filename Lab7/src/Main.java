public class Main {

	public static void main(String[] args) {
		Time a = new Time();
		Time b = new Time(3,20,20);
		Time c = new Time(13,45);
		Time d = new Time(15);
		Time e = new Time(b);

		System.out.println("Universal time is " + a.toUniversalString());
		System.out.println("Standard time is " + a.toString() + "\n");

		System.out.println("Universal time is " + b.toUniversalString());
		System.out.println("Standard time is " + b.toString() + "\n");

		System.out.println("Universal time is " + c.toUniversalString());
		System.out.println("Standard time is " + c.toString() + "\n");

		System.out.println("Universal time is " + d.toUniversalString());
		System.out.println("Standard time is " + d.toString() + "\n");

		System.out.println("Universal time is " + e.toUniversalString());
		System.out.println("Standard time is " + e.toString() + "\n");

		b.setTime(13, 27, 6);
		System.out.println("Universal time is " + b.toUniversalString());
		System.out.println("Standard time is " + b.toString());
	}
}

/*
Universal time is 00:00:00
Standard time is 12:00:00 AM

Universal time is 03:20:20
Standard time is 3:20:20 AM

Universal time is 13:45:00
Standard time is 1:45:00 PM

Universal time is 15:00:00
Standard time is 3:00:00 PM

Universal time is 03:20:20
Standard time is 3:20:20 AM

Universal time is 13:27:06
Standard time is 1:27:06 PM
*/