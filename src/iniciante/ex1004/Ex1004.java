package iniciante.ex1004;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(); scan.nextLine();
        int b = scan.nextInt();

        int prod = a*b;

        System.out.print("PROD = "+prod+"\n");
    }
}
