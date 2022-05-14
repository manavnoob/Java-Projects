/* First I have Created board that is in the class called Call
* to print a game board created method name called GameBoard
* have make separate switch cases for use and computer
* for computer I have created a Random object that generates any numbers
* to keep track off player and computer move created ArrayList called PlayerPos and computerPos
* created separate loops for identifying if player or computer is replacing the previous move or not
* finally created a method called checkwinner to check the winning position */


import java.util.*;

class Call
{
    //created ArrayList
    ArrayList<Integer> playerPos = new ArrayList<>();
    ArrayList<Integer> computerPos = new ArrayList<>();

    // creating 2D array for board
    char[][] board ={{' ','|',' ','|',' ',},
            {'-','+','-','+','-',},
            {' ','|',' ','|',' ',},
            {'-','+','-','+','-',},
            {' ','|',' ','|',' ',}};

    //creating method for printing board
    public void GameBoard()
    {

        for(int row = 0; row < 5; row++)
        {
            for(int c = 0; c < 5; c++)
            {
                System.out.print(board[row][c]);
            }
            System.out.println();
        }

    }

    // replacing 2D array's space to X
    public void Playforplayer(int pmc)
    {
        playerPos.add(pmc);

        switch (pmc) {
            case 1 -> board[0][0] = 'X';
            case 2 -> board[0][2] = 'X';
            case 3 -> board[0][4] = 'X';
            case 4 -> board[2][0] = 'X';
            case 5 -> board[2][2] = 'X';
            case 6 -> board[2][4] = 'X';
            case 7 -> board[4][0] = 'X';
            case 8 -> board[4][2] = 'X';
            case 9 -> board[4][4] = 'X';
        }

    }

    // replacing board's space to O
    public void playforcomputer(int cmc) {
        if (playerPos.size() + computerPos.size() != 9) {
            computerPos.add(cmc);
            switch (cmc) {
                case 1 -> board[0][0] = 'O';
                case 2 -> board[0][2] = 'O';
                case 3 -> board[0][4] = 'O';
                case 4 -> board[2][0] = 'O';
                case 5 -> board[2][2] = 'O';
                case 6 -> board[2][4] = 'O';
                case 7 -> board[4][0] = 'O';
                case 8 -> board[4][2] = 'O';
                case 9 -> board[4][4] = 'O';
            }
        }
    }

    // checking for winning position
    public String checkWinner()
    {
        boolean someoneWon = false;
        List toprow = Arrays.asList(1,2,3);
        List midrow = Arrays.asList(4,5,6);
        List botrow = Arrays.asList(7,8,9);
        List leftcol = Arrays.asList(1,4,7);
        List midcol = Arrays.asList(2,5,8);
        List rightcol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(3,5,7);

        List<List> Winning = new ArrayList<List>();
        Winning.add(toprow);
        Winning.add(midrow);
        Winning.add(botrow);
        Winning.add(leftcol);
        Winning.add(midcol);
        Winning.add(rightcol);
        Winning.add(cross1);
        Winning.add(cross2);

        for (List l : Winning)
        {
            if (playerPos.containsAll(l))
            {
                someoneWon = true;
                return "Congratulations you win!!";
            }
            else if (computerPos.containsAll(l))
            {
                someoneWon = true;
                return "cpu wins!!";
            }

        }
        if (playerPos.size() + computerPos.size() == 9 && !someoneWon)
        {
            return "the game has been tie";
        }
        return "";


    }
    public void checkresult()
    {

    }

}

public class TikTakToe {

    public static void main(String[] args) {

        System.out.println("X will be yours");
        System.out.println("and O will be the computer's");

        // creating an object
        Call obj = new Call();
        obj.GameBoard();

        //putting whole thing in while loop
        while (true) {
            System.out.println("Enter Any Number 1-9: ");
            Scanner sc = new Scanner(System.in);
            int Pm = sc.nextInt();

            int Cm = 0;
            while (obj.playerPos.contains(Pm) || obj.computerPos.contains(Pm))
            {
                System.out.println("The position is wrong!! Please try again: ");
                Pm = sc.nextInt();
            }

            obj.Playforplayer(Pm);
            obj.GameBoard();

            System.out.println("\n");

            Random rm = new Random();
            Cm = rm.nextInt(9) + 1;

            while (obj.playerPos.contains(Cm) || obj.computerPos.contains(Cm))
            {
                if(obj.playerPos.size() + obj.computerPos.size() != 9) {
                    Cm = rm.nextInt(9) + 1;
                }
                else {
                    break;
                }
            }
            obj.playforcomputer(Cm);
            obj.GameBoard();
            String result = obj.checkWinner();
            if(result == ""){
                continue;
            }
            else {
                System.out.println(result);
                break;
            }
        }
    }
}
