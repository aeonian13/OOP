using System;

public class InvoiceTest
{

	public static void Main(string[] args)
	{
		invoice inv = new invoice("1234", "Hammer", 2, 14.95);

		Console.WriteLine("Original Invoice");
		inv.displayInformation();

		inv.PartNumber = "001234";
		inv.Desc = "Yellow Hammer";
		inv.Quanity = 3;
		inv.Cost = 19.49;

		Console.WriteLine("Updated invoice information");
		inv.displayInformation();

		inv.PartNumber = "001234";
		inv.Desc = "Yellow Hammer";
		inv.Quanity = -3;
		inv.Cost = -19.49;

		Console.WriteLine("With negative quantity and negative price");
		Console.WriteLine("Updated invoice information");
		inv.displayInformation();
	}
}

/*
 * Original Invoice
Part number: 1234
Description: Hammer
Quanity: 2
Price: 14.95
Invoice ammount: 29.9

Updated invoice information
Part number: 001234
Description: Yellow Hammer
Quanity: 3
Price: 19.49
Invoice ammount: 58.47

With negative quantity and negative price
Updated invoice information
Part number: 001234
Description: Yellow Hammer
Quanity: 0
Price: 0
Invoice ammount: 0

Press any key to continue . . .
*/