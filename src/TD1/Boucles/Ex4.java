package TD1.Boucles;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("entrer le 1er nombre ");
        int a =s.nextInt();
        System.out.println("entrer le 2eme nombre ");
        int b =s.nextInt();
        while (b!=0)
        {
            int r=a%b ;
            a=b;
            b=r;
        }
        System.out.println("le pgcd est "+a);
    }
}
