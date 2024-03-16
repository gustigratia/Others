import java.util.Scanner;
import java.text.DecimalFormat;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        DecimalFormat decFormat = new DecimalFormat(".#");
        System.out.println("Program to compute tax");
        System.out.println("----------------------");
        System.out.printf("Enter price of food: $");
        double price = userInput.nextDouble();
        System.out.printf("Enter tax rate in percent (e.g. .08 for 8%%):");
        double taxRate = userInput.nextDouble();
        System.out.printf("Enter tip percentage (e.g. .15 for 15%%):");
        double tipPercent = userInput.nextDouble();

        double tax = price * taxRate;
        double tip = price * tipPercent;
        double totalBill = price + tax + tip;
        String taxFormatted = decFormat.format(tax);
        String tipFormatted = decFormat.format(tip);
        String totalFormatted = decFormat.format(totalBill);
        System.out.println("Tax on food is $" + taxFormatted);
        System.out.println("Tip is $" + tipFormatted);
        System.out.println("Total price is $" + totalFormatted);
    }
}
