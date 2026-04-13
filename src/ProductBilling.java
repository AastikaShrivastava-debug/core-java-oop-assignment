/**
 * @author Aastika Srivastva
 * ProductBilling class showing method overloading for 1, 2, and 3 products.
 */
public class ProductBilling {

    // Calculate bill for 1 product
    public double calculateBill(Product p1) {
        return p1.getPrice();
    }

    // Calculate bill for 2 products
    public double calculateBill(Product p1, Product p2) {
        return p1.getPrice() + p2.getPrice();
    }

    // Calculate bill for 3 products
    public double calculateBill(Product p1, Product p2, Product p3) {
        return p1.getPrice() + p2.getPrice() + p3.getPrice();
    }

    // Bonus Task: Add discount calculation in billing
    public double calculateBillWithDiscount(Product p1, Product p2, double discountPercentage) {
        double total = p1.getPrice() + p2.getPrice();
        double discountAmount = total * (discountPercentage / 100.0);
        return total - discountAmount;
    }
}
