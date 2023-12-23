package TD1.Conditions;

import java.util.Scanner;

public class Ex6 {
    public static void main (String [] args )
    {
        Scanner s =new Scanner(System.in);
        System.out.println("entrer la valeur de a :");
        int a =s.nextInt();
        System.out.println("entrer la valeur de b :");
        int b =s.nextInt();
        if  (( a>0 && b> 0) || ( a<0 && b<0))
        {System.out.println("le produit est positif ");}
        else {
            System.out.println("le produit est negatif ");
        }
    }
}

