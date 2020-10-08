import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

         TickTocToeGame tickTocToeGame=new TickTocToeGame();
        char []board=tickTocToeGame.takingInput();

       tickTocToeGame.userInput();
    }
}

