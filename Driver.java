import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int option=sc.nextInt();
         TickTocToeGame tickTocToeGame=new TickTocToeGame();
        System.out.println("1: for initialize the board, 2: tahke input , 3 : print the board");
        switch (option)
        {
            case 1:
                char []board=tickTocToeGame.takingInput();
                break;
            case 2:
                tickTocToeGame.userInput();
                break;
            case 3:
                tickTocToeGame.printBoard();
                break;
            default:
                System.out.println("please provide valid option");
                break;
        }
    }
}

