import java.text.NumberFormat;
import java.util.Locale;

public class invoice {
	
	String partNumber = "";
	String desc = "";
	int quant = 0;
	double unitPrice = 0;
	
	invoice(String pn, String desc, int q, double cost){
		this.partNumber = pn;
		this.desc = desc;
		this.quant = q;
		this.unitPrice = cost;
	}
	
	public void setPartNumber(String x){
		this.partNumber = x;
	}
	
	public void setDesc(String x){
		this.desc = x;
	}
	
	public void setQuanity(int x){
		this.quant = x;
		if(this.quant < 0)this.quant = 0;
	}
	
	public void setCost(double x){
		this.unitPrice = x;
		if(this.unitPrice < 0)this.unitPrice = 0;
	}
	
	public void displayInformation(){
		System.out.println("Part number: " + this.partNumber);
		System.out.println("Description: " + this.desc);
		System.out.println("Quanity: " + this.quant);
		System.out.println("Price: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(this.unitPrice));
		System.out.println("Invoice ammount: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(this.unitPrice * this.quant) + "\n");

	}
}