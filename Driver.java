import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TickTocToeGame tickTocToeGame = new TickTocToeGame();
        char computerOption;
        char []board = tickTocToeGame.takingInput();
          char userOption = tickTocToeGame.userInput();
          if(userOption == 'X')
          {
              computerOption = '0';
          }
          else
          {
              computerOption = 'X';
          }
        //Checking that index is free or not
        boolean terminate = false;
        while(terminate != true)
        {
            System.out.println("provide the index number");
            int index = sc.nextInt();
            boolean check = tickTocToeGame.checkIndex(index);
            if(check == true) {
                tickTocToeGame.makeAMove(index, userOption);
                terminate = true;
            }
            else
            {
                System.out.println("index is not available");
            }
            tickTocToeGame.printBoard();
        }
        int winner = tickTocToeGame.toss();
        if(winner == 1)
        {
            System.out.println("Computers will provide first input");
        }
        else
        {
            System.out.println("User will provide first input");
        }

    }
}


