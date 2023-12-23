package TD1.Conditions;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("entrer la langue que vous voulez :");
        // declaration d'une variable pour le choix
        char choix =s.next().charAt(0);
        //permettre utilisateur d'entrer l'heure
        System.out.println("entrer l'heure :");
        int heure =s.nextInt();

        //traiter les choix
        // si la langue est le francais
        if (choix =='f')
        {
            //tester l'heure
            if (heure >=0 && heure <18)
            { System.out.println("bonjour");}
            else if (heure >=18 && heure <22)
            { System.out.println("bonsoir");}
            else {
                System.out.println("bonne nuit");}
        }
        // si la langue est l'anglais
        else if (choix =='a')
        {
            //tester l'heure
            if (heure >=0 && heure <18)
            { System.out.println("Good Morning");}
            else if (heure >=18 && heure <22)
            { System.out.println("Good Evening");}
            else {
                System.out.println("Good night");}
        }}

}

