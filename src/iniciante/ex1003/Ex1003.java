package iniciante.ex1003;

import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); scan.nextLine();
        int b = scan.nextInt();

        int soma = a+b;

        System.out.print("SOMA = "+soma+"\n");
    }
}
