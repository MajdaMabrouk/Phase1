package TD1.Boucles;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter un nombre :");
        int N = s.nextInt();
        int sum = 0;
        for (int i = 0; i <N; i++) {
            if ((i % 2) != 0)
            { sum+=i;}
        }
        System.out.println("la somme des entiers impaires inferieurs a :" +N+ " est :" + sum );


    }
}