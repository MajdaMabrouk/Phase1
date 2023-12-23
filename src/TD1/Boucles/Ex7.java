package TD1.Boucles;

import java.util.Scanner;

public class Ex7 {
    public static void main (String [] args )
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter le nombre de lignes");
        int n = s.nextInt();
        for(int i=1 ;i<=n ;i++)
        { for(int j=1;j<=i ;j++)
        { System.out.print(i+j-1);}
            System.out.println();
        }

    }
}