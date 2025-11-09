public class InventoryApp{
    public static void main(String[] args) {

        //Create the object of the class
        System.out.println("\tWelcome to Inventory App ");
        Product oil = new Product("Hair Oil", 29.99, 12);
        Product wash = new Product("Shampoo", 17.50, 6);
        Product rinse = new Product("Conditioner", 17.35, 8);

        // call the method
        System.out.println("Your product Info: ");
        oil.addStock(8);
        wash.addStock(12);
        rinse.addStock(15);
        System.out.println("---------");

        oil.sellProduct(5);
        wash.sellProduct(7);
        rinse.sellProduct(10);
        System.out.println("---------");

        // Call display info
        System.out.println("Your product Info: ");
        oil.printInfo();
        wash.printInfo();
        rinse.printInfo();

        System.out.println("\nThank you! for supporting my small business, 20% of on your next order.");

    }
}