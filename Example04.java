import java.util.Scanner;
import java.util.Random;

public class Example04 {

    public static void main(String[] args) {

        System.out.println("Welcome We are here to play one Game Of rock,Paper and scissors");
        System.out.println("Please enter 0 for rocks");
        System.out.println("1 for Paper ");
        System.out.println("and 2 for scissors ");
        System.out.println("we will play 3 rounds and then we will declare our winner");
        int cm;
        int pwin=0;
        int cwin=0;
        for(int i=0;i<3;i++)
        {
            System.out.println("Please Enter the number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            Random rn = new Random();
            cm = rn.nextInt(3);
            System.out.println("Computer's number is "+cm);
            if(num == 0 && cm == 1)
            {
                System.out.printf("Your %dth lost",i);
                cwin++;
            }
            else if(num == 0 && cm == 2)
            {
                System.out.printf("your %dth win",i);
                pwin++;
            }
            else if(num == 1 && cm == 0)
            {
                System.out.printf("Your %dth win",i);
                pwin++;
            }
            else if(num == 1 && cm == 2)
            {
                System.out.printf("Your %dth lose",i);
                cwin++;
            }
            else if(num == 2 && cm == 0)
            {
                System.out.printf("Your %dth lose",i);
                cwin++;
            }
            else if(num == 2 && cm == 1)
            {
                System.out.printf("Your %dth win",i);
                pwin++;
            }
            else if(num == cm)
            {
                System.out.println("It is a Draw");

            }
        }
        if(pwin > cwin)
        {
            System.out.println("You have win the match!!!");
        }
        else if(cwin > pwin)
        {
            System.out.println("You have lost the game!!!");
        }
        else
        {
            System.out.println("the game has been a draw!!!");
        }
    }

}
