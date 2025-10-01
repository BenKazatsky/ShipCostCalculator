import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        double shippingCost = 0.0;
        double totalPrice = 0.0;
        System.out.print("Enter the price of the item: $");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();
            if (itemPrice >= 100.0) {
                shippingCost = 0.0;
                System.out.println("Shipping is FREE!");
            } else {
                shippingCost = itemPrice * 0.02;
                System.out.println("Shipping is 2% of the item price.");
            }
            totalPrice = shippingCost + itemPrice;
            System.out.println("Item Price: $" + itemPrice);
            System.out.println("Shipping Cost: $" + shippingCost);
            System.out.println("Total Price: $" + totalPrice);
        } else {
            String trash = in.nextLine();
            System.out.println("Invalid input: " + trash + ". Please run the program and enter a valid number.");
        }
        in.close();
    }
}