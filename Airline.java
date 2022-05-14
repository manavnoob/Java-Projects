import java.util.Scanner;
import java.util.Random;

class Runmechanism {

    Scanner sc = new Scanner(System.in);
    int adcharge;
    int chcharge;
    void welcome(int bkc) {


        if (bkc == 1) {
            System.out.println("welcome welcome where you want to go");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("===================Kindly choose from India,dubai,America,japan===================");

            Runmechanism obwelcome = new Runmechanism();
            int sum = obwelcome.tofrommcsm();

            System.out.println("=============================================================================");
            System.out.println("So the Total for you ticket is: "+sum);
            System.out.println("Thank you for visiting:)");

        } else {
            System.out.println("Thank you for visiting!!");
        }
    }

    int tofrommcsm() {

        String to;
        String from;
        int aircharge = 0;

        System.out.println("Enter Where to where go: ");
        to = sc.nextLine();
        from = sc.nextLine();

        System.out.println("how many adults are there: ");
        int ad = sc.nextInt();

        System.out.println("how many childrens are there: ");
        int ch = sc.nextInt();

        if(to.equals("india") && from.equals("dubai") || to.equals("dubai") && from.equals("india")) {
            aircharge = 20000;
        }
        else if(to.equals("india") && from.equals("america") || to.equals("america") && from.equals("india")) {
            aircharge = 50000;
        }
        else if(to.equals("india") && from.equals("japan") || to.equals("japan") && from.equals("india")) {
            aircharge = 40000;
        }
        else if(to.equals("dubai") && from.equals("america") || to.equals("america") && from.equals("dubai")) {
            aircharge = 40000;
        }
        else if(to.equals("dubai") && from.equals("japan") || to.equals("japan") && from.equals("dubai")) {
            aircharge = 50000;
        }
        else if(to.equals("america") && from.equals("japan") || to.equals("japan") && from.equals("america")) {
            aircharge = 60000;
        }

        if(ad>1) {
            adcharge=ad*2000;
        }
        if(ch>2) {
            chcharge=ch*200;
        }

        int sumc = aircharge + adcharge + chcharge;
        return sumc;
    }
}

class Airline {

    public static void main(String[] args) {


        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Welcome to bharat Airlines");

        int bk = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for booking: ");

        System.out.println("Enter 0 for exit");
        bk = sc.nextInt();
        Runmechanism obwelcome = new Runmechanism();
        obwelcome.welcome(bk);

    }

}
