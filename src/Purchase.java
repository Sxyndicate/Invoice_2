import java.util.Scanner;

public class Purchase {
    private int invoiceNumber;
    private double saleAmount;
    private double salesTax;
    
    public Purchase(int invoiceNumber, double saleAmount, double salesTax) {
        this.invoiceNumber = invoiceNumber;
        this.saleAmount = saleAmount;
        this.salesTax = salesTax;
    }
    
    public int getInvoiceNumber() {
        return invoiceNumber;
    }
    
    public double getSaleAmount() {
        return saleAmount;
    }
    
    public double getSalesTax() {
        return salesTax;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for invoice number
        System.out.print("Enter invoice number: ");
        int invoiceNumber = scanner.nextInt();
        
        // Prompt the user for sale amount
        double saleAmount;
        do {
            System.out.print("Enter sale amount: ");
            saleAmount = scanner.nextDouble();
        } while (saleAmount < 0);
        
        // Calculate sales tax
        double salesTax = saleAmount * 0.10;
        
        // Create the purchase object
        Purchase purchase = new Purchase(invoiceNumber, saleAmount, salesTax);
        
        // Display the purchase details
        System.out.println("Invoice number: " + purchase.getInvoiceNumber());
        System.out.println("Sale amount: R" + purchase.getSaleAmount());
        System.out.println("Sales tax: R" + purchase.getSalesTax());
    }
}
