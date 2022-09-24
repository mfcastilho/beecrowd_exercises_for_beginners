package iniciante.ex1013;

import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        int maiorAB = (a+b+Math.abs(a-b)) / 2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;



        System.out.print(maiorABC+" eh o maior\n");
    }
}
