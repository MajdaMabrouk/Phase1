package TD1.Tableaux;

import java.util.Scanner;

public class Ex2 {
    public static void main(String []args ) {
        Scanner s = new Scanner(System.in);
        System.out.println("entrer un entier N :");
        int N = s.nextInt();
        int Bin[]=new int[32];
        int i=0;
        while (N != 0)
        {
            Bin[i]=N%2;
            N/=2;
            i++;
        }
        System.out.println("le nombre en binaire est : ");
        for (int j=i-1;j>0;j--)
            System.out.print(Bin[j] + " ");
    }
}
