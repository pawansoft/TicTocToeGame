import java.util.Scanner;

public class TickTocToeGame {
    public char[] takingInput()
    {
        char board [] = new char[10];
        for(int i=1;i< board.length;i++)
        {
            board[i]=' ';
        }
        return board;
    }
    public char userInput()
    {
        Scanner sc=new Scanner(System.in);
        char userValue=sc.next().charAt(0);
        if(userValue == '0' || userValue =='X')
        {
            return userValue;
        }
        else
        {
            System.out.println("Please provide valid input");
        }
        return 0;


    }
}


