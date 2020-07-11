package MediatorPattern;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        new Test();
    }

    public Test() {
        Board b = new Board();
        b.printBoard();
        String current = "b";

        while (true) {
            System.out.println(current + " turn ");

            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter Y");

            int x = Integer.parseInt(myObj.nextLine());

            System.out.println("Enter X");

            int y = Integer.parseInt(myObj.nextLine());

            b.makeMove(x, y, current);
            if (current == "b")
                current = "w";
            else
                current = "b";
            b.printBoard();

        }

    }

}
