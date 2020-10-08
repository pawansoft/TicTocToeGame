import java.util.Scanner;

public class TickTocToeGame {
    char board [] = new char[10];
    public char[] takingInput()
    {

        for(int i=1;i< board.length;i++)
        {
            board[i]= 0;
        }
        return board;
    }
    public char userInput()
    {
        Scanner sc=new Scanner(System.in);
        char userValue=sc.next().toUpperCase().charAt(0);
        if(userValue == '0' || userValue == 'X')
        {
            return userValue;
        }
        else
        {
            System.out.println("Please provide valid input");
        }
        return 0;
    }
    public void printBoard() {
        System.out.println("-----------------------");
        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
        System.out.println("|--|--|--|");
        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
        System.out.println("|--|--|--|");
        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
        System.out.println("-----------------------");
    }
    public boolean checkIndex(int index)
    {
        boolean check;
        if (board[index] == 0)
        {
            check =true;
        }
        else
        {
            check=false;
        }
        return check;
    }
}


