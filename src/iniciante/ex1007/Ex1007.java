package iniciante.ex1007;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); scan.nextLine();
        int b = scan.nextInt(); scan.nextLine();
        int c = scan.nextInt(); scan.nextLine();
        int d = scan.nextInt();

        int diferenca = (a*b) - (c*d);

        System.out.print("DIFERENCA = "+diferenca+"\n");

    }
}
