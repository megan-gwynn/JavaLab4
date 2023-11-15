// Megan Gagliardi & Rob Savoie
// 12/09/2022
// OOP 3200
// Java Lab 4: Inheritance

import java.util.Calendar;

public class Perishable extends Product{
	
	// Data Members
	private Calendar prodExpiry;
	
	// Constructors
	public Perishable() {
		super();
		setExpiry(1,1,2023);
	}
	
	public Perishable(int sku, String name, double cost, int quant, int order, String instruct, int day, int month, int year){
		super(sku, name, cost, quant, order, instruct);
		setExpiry(day, month, year);
	}
	
	// Mutators
	public void setExpiry(int day, int month, int year) {
		if((day >= 1 || day <= 31) && (month >= 0 || month <= 11) && (year >= 2000 || year <= 2050))
		{
			Calendar setDate = Calendar.getInstance();
			setDate.set(year, month, day);
			prodExpiry = setDate;
		}
	}
	
	// Accessors
	public Calendar getExpiry() {
		return prodExpiry;
	}
	
	// Methods
	public void display() {
		super.display();
		System.out.println("Expiry Date: " + getExpiry().get(Calendar.DATE) + "/" + getExpiry().get(Calendar.MONTH) + "/" + getExpiry().get(Calendar.YEAR));
	}
}