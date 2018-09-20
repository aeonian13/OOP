public class InvoiceTest {

	public static void main(String[] args) {
		invoice inv = new invoice("1234", "Hammer", 2, 14.95);
		
		System.out.println("Original Invoice");
		inv.displayInformation();
		
		inv.setPartNumber("001234");
		inv.setDesc("Yellow Hammer");
		inv.setQuanity(3);
		inv.setCost(19.49);
		
		System.out.println("Updated invoice information");
		inv.displayInformation();
		
		inv.setPartNumber("001234");
		inv.setDesc("Yellow Hammer");
		inv.setQuanity(-3);
		inv.setCost(-19.49);

		System.out.println("With negative quantity and negative price");
		System.out.println("Updated invoice information");
		inv.displayInformation();
	}
}


/*
Original Invoice
Part number: 1234
Description: Hammer
Quanity: 2
Price: $14.95
Invoice ammount: $29.90

Updated invoice information
Part number: 001234
Description: Yellow Hammer
Quanity: 3
Price: $19.49
Invoice ammount: $58.47

With negative quantity and negative price
Updated invoice information
Part number: 001234
Description: Yellow Hammer
Quanity: 0
Price: $0.00
Invoice ammount: $0.00


*/