import java.util.Scanner;

public class FedexShipment {
    public static void main(String args[]){
        double fedex_shipment_cost = 4.50;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name");
        String name = scan.nextLine();
        System.out.println("Enter number of pounds");
        int number_of_pound = scan.nextInt();
        double total_shipping_cost =0;
        total_shipping_cost = fedex_shipment_cost * number_of_pound;
        System.out.println("Thank you "+name+" for shopping at Fedex. Your total today is: "+total_shipping_cost);
    }
}

