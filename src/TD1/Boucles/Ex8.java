package TD1.Boucles;

import java.util.Scanner;

public class Ex8 {
    public static void main(String [] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter le nombre de lignes");
        int L = s.nextInt();
        for(int i=1 ;i<=L ;i++)
        { for(int j=1;j<=i ;j++)
        { System.out.print( "*");}
            System.out.println();
        }

        for(int i=L-1;i>0 ;i--)
        { for(int j=1;j<=i ;j++)
        { System.out.print( "*");}
            System.out.println();
        }
    }
}
