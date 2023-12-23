package TD1.Conditions;

import java.util.Scanner;

public class Ex8 {
    public static  void main (String [] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("entrer le mois :");
        int mois = s.nextInt();
        //declaration d'une variable pour stocker le nombre de jours de chaque mois
        int nbrj=0;
        if (mois <0 || mois >12)
        {System.out.println("le mois est  invalid :");}
        else if (mois ==1 || mois ==3 || mois==5 || mois ==7 || mois ==9 || mois ==11 )
        {
            nbrj=31;
        }
        else if ( mois ==4 || mois==6 || mois ==8 || mois ==10 || mois ==12 )
        {
            nbrj=30;
        }
        else {
            System.out.println("enter l'annee");
            double annee =s.nextDouble();
            if ((annee%400==0 ) || (annee%4==0 && annee%100!=0))
            {
                nbrj=28;
            }else { nbrj=29;}
        }
        System.out.println("le nombre de jours du mois " +mois+ " est :" +nbrj);




    }
}
