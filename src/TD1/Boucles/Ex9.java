package TD1.Boucles;

import java.util.Scanner;

public class Ex9 {
    public static  void main (String [] args )
    {
        Scanner s = new Scanner(System.in);
        System.out.println("entrer un nombre :");
        int N=s.nextInt();
        int sum = 0;
        int x = N;

        while (N != 0) {
            int nbrpoids = N % 10;
            sum += nbrpoids;
            N /= 10;
        }

        System.out.println("La somme des chiffres de " + x + " est : " + sum);
    }
}
