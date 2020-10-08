import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TickTocToeGame tickTocToeGame=new TickTocToeGame();
//        char []board=tickTocToeGame.takingInput();
//        tickTocToeGame.userInput();
//        tickTocToeGame.printBoard();

        //Checking that index is free or not
        System.out.println("provide the index number");
        int index=sc.nextInt();
        boolean check =tickTocToeGame.checkIndex(index);
        if(check == true) {
            System.out.println("Index is available");
        }
        else
            {
                System.out.println("index is not available");
            }

    }
}


