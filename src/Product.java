public class Product{

    // Attribute
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    public Product(String ProductName, double price, int quantity) {
        this.productName = ProductName;
        this.price = price;
        this.quantity = quantity;

    }

    // Create method
    public void addStock(int quantity){
        this.quantity += quantity;
        System.out.println("Product added to the stock is: " + quantity);
    }

    public void sellProduct(int quantity){
        this.quantity -= quantity;
        System.out.println(quantity + " item(s) sold from stock.");
    }

    // Getter
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    // Setter
    public void setProductName(String ProductName) {
        this.productName = ProductName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Print Display message
    public void printInfo(){
        System.out.println("Product Name: " + productName + ", Price: " + price + ", Quantity: " + quantity);
    }

}