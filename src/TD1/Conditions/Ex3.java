package TD1.Conditions;

import java.util.Scanner;

public class Ex3 {
    public static void main (String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter la valeur de a ");
        int a=s.nextInt();
        System.out.println("enter la valeur de b ");
        int b=s.nextInt();
        System.out.println("entrer le choix :");
        int choix =s.nextInt();
        switch(choix)
        {
            case 1:
            {if ( (a+b )%2==0)
            {System.out.println("la somme est pair ");}
            else
            {  System.out.println("la somme est impair ");}
                break ;}
            case 2 :
            {if ( (a*b%2)==0)
            { System.out.println("le produit est pair ");}
            else
            { System.out.println("le produit  est impair ");}
                break ;}
            case 3:
            {if ( (a>0 && b>0)  )
            {  System.out.println(" le signe de la somme est positive ");}
            else
            { System.out.println(" le signe de la somme est negative ");}
                break ;}
            case 4 :
            {if ( (a>0 && b>0) ||(a<0 &&b<0) )
            { System.out.println(" le signe du produit  est positive ");}
            else
            { System.out.println(" le signe du produit est negative ");}
                break ;}
        }

    }
}


