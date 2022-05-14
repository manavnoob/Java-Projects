import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dollar = 0;
        double fin;

        System.out.println("==========================================================");
        System.out.println("Welcome welcome to our currency convertor!!");
        System.out.println("==========================================================");
        System.out.println("Here we can change USD,INR,AED,UK,Yen,");

        System.out.println("Enter your currency: ");
        String fromcurrency = sc.nextLine();

        System.out.println("What currency do you want to convert: ");
        String tocurrency = sc.nextLine();

        System.out.println("Enter your amount: ");
        int amount = sc.nextInt();

        if(fromcurrency.equals("INR")) {
            dollar = amount * 0.013;
        }
        else if(fromcurrency.equals("AED")) {
            dollar = amount * 0.27;
        }
        else if(fromcurrency.equals("UK")) {
            dollar = amount * 1.23;
        }
        else if(fromcurrency.equals("Yen")) {
            dollar = amount * 0.007;
        }
        else {
            dollar = amount;
        }

        if(tocurrency.equals("INR")) {
            fin = dollar * 77.36;
        }
        else if(tocurrency.equals("AED")) {
            fin = dollar * 3.67;
        }
        else if(tocurrency.equals("Yen")) {
            fin = dollar * 129.86;
        }
        else if(tocurrency.equals("UK")) {
            fin = dollar * 30.23;
        }
        else {
            fin = dollar;
        }

        System.out.println("=================================================");
        System.out.println("Your amount is: "+fin);

        System.out.println("Thank you for visiting:)");

    }
}
