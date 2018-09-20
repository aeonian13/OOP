using System;

public class invoice
{

	internal string partNumber = "";
	internal string desc = "";
	internal int quant = 0;
	internal double unitPrice = 0;

	internal invoice(string pn, string desc, int q, double cost)
	{
		this.partNumber = pn;
		this.desc = desc;
		this.quant = q;
		this.unitPrice = cost;
	}

	public virtual string PartNumber
	{
		set
		{
			this.partNumber = value;
		}
	}

	public virtual string Desc
	{
		set
		{
			this.desc = value;
		}
	}

	public virtual int Quanity
	{
		set
		{
			this.quant = value;
			if (this.quant < 0)
			{
				this.quant = 0;
			}
		}
	}

	public virtual double Cost
	{
		set
		{
			this.unitPrice = value;
			if (this.unitPrice < 0)
			{
				this.unitPrice = 0;
			}
		}
	}

	public virtual void displayInformation()
	{
		Console.WriteLine("Part number: " + this.partNumber);
		Console.WriteLine("Description: " + this.desc);
		Console.WriteLine("Quanity: " + this.quant);
		Console.WriteLine("Price: " + this.unitPrice);
		Console.WriteLine("Invoice ammount: " + (this.unitPrice * this.quant) + "\n");

	}
}

