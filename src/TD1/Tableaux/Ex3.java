package TD1.Tableaux;

import java.util.Scanner;

public class Ex3 {
    public static void main (String [] args )
    {
        Scanner s =new Scanner(System.in);
        System.out.println("entrer le seuil :");
        float seuil = s.nextFloat();
        System.out.println("entrer le nombre des etudiants :");
        int number =s.nextInt();
        //counter
        int counter =0;
        for (int i=1 ; i<=number ;i++)
        {
            System.out.println("entrer la moyenne de l'etudiant " +i);
            float moyenne = s.nextFloat();
            if (moyenne>=seuil )
                counter++;
        }
        System.out.println("le nombre des etudiants ayant une moyenne superieur ou est egale au seuil est :"+counter );
    }
}
