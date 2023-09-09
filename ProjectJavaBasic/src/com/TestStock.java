package com;

class Stock{
	private long code;
    private int qty;
    private double price;
    private double total;
    private double discount;
    private double netPrice;

    public Stock(long n, int q, double p) {
        code = n;
        qty = q;
        price = p;
    }
    public void compute() {
        total = qty * price;
        discount = total * 0.25;
        netPrice = total - discount;
    }
    public void printDetails() {
        System.out.println("Product Code: " + code);
        System.out.println("Quantity: " + qty);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Net Price: " + netPrice);
    }
	
}
public class TestStock {
	public static void main(String []args) {
		Stock product = new Stock(123456789, 5, 50.75);
        product.compute();
        product.printDetails();
	}

}
