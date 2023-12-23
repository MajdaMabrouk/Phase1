package TD1.Boucles;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entrer un nombre entier :");
        int N = s.nextInt();
        int fact =1 ;
        for (int i = 1; i <= N; i++)
        { fact*=i ;}
        System.out.println(N+"! = " + fact);

    }
}
