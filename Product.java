// Megan Gagliardi
// 12/09/2022
// OOP 3200
// Java Lab 4: Inheritance

public class Product {
	
	// Data Members
	private int prodSku;
	private String prodName;
	private double prodCost;
	private int prodQuant;
	private int prodOrder;
	private String prodInstruct;
	
	// Constructors
	Product(){
		setSku(0);
		setName("N/A");
		setCost(0);
		setQuant(0);
		setOrder(0);
		setInstruct("N/A");
	}
	
	Product(int sku, String name, double cost, int quant, int order, String instruct){
		setSku(sku);
		setName(name);
		setCost(cost);
		setQuant(quant);
		setOrder(order);
		setInstruct(instruct);
	}
	
	// mutators
	public void setSku(int sku) {
		if (sku > 0 && sku <= 1000) {
			prodSku = sku;
		}
	}
	
	public void setName(String name) {
		if (name != "") {
			prodName = name;
		}
	}
	
	public void setCost(double cost) {
		prodCost = Math.abs(cost);
	}
	
	public void setQuant(int quant) {
		prodQuant = Math.abs(quant);
	}
	
	public void setOrder(int order) {
		prodOrder = Math.abs(order);
	}
	
	public void setInstruct(String instruct) {
		if (instruct != ""){
			prodInstruct = instruct;
		}
	}
	
	// accessors
	public int getSku() {
		return prodSku;
	}
	
	public String getName() {
		return prodName;
	}
	
	public double getCost() {
		return prodCost;
	}
	
	public int getQuant() {
		return prodQuant;
	}
	
	public int getOrder() {
		return prodOrder;
	}
	
	public String getInstruct() {
		return prodInstruct;
	}
	
	// Methods
	public void display() {
		System.out.println("--------------------");
		System.out.println("SKU: " + getSku());
		System.out.println("Product Name: " + getName());
		System.out.println("Unit Cost: " + getCost());
		System.out.println("Quantity Onhand: " + getQuant());
		System.out.println("Quantity Needed: " + getOrder());
		System.out.println("Special Intructions: " + getInstruct());
	}
}
