package TD1.Boucles;

import java.util.Scanner;

public class Ex5 {
    public static void main (String []args ) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter un nombre entier :");
        int N = s.nextInt();
        int premierTerme = 0;
        int secondTerme = 1;
        int nextTerme;
        System.out.println("La suite de Fibonacci est:");
        for (int i = 1; i <= N; i++)
        {
            System.out.println(premierTerme+ "");
            nextTerme=premierTerme+secondTerme;
            premierTerme=secondTerme;
            secondTerme=nextTerme;

        }
    }
}
