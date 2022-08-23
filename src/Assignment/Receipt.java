package Assignment;

public class Receipt {
    private String customerName;

    private String userItemBought;
    private int itemQuantity;
    private double pricePerUnit;
    private double total;
    private int payment;


    public Receipt(String userItemBought, int piecesQuantity, double pricePerUnit, double total) {
        this.userItemBought = userItemBought;
        this.itemQuantity = piecesQuantity;
        this.pricePerUnit = pricePerUnit;
        this.total = total;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void printFormat() {
        System.out.printf("%15s %15d %15.2f %15.2f", userItemBought, itemQuantity, pricePerUnit, total);
        System.out.println();
    }
}


