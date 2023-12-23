package TD1.Conditions;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entrer le 1er nombre ");
        int n1 = s.nextInt();
        System.out.println("entrer le 2eme nombre ");
        int n2 = s.nextInt();
        System.out.println("entrer le 3eme nombre ");
        int n3 = s.nextInt();
        //methode1
        int max = Math.max(Math.max(n1, n2), n3);
        System.out.println("le maximum du 3 nombres est : " + max);
        //methode2
        /* int max
        if (n1>n2 && n1> n3)
       { max=n1}
        else if (n2>n1 && n2>n3)
        {max=n2;}
        else
       { max =n3;}
       System.out.println("le max est :" +max)
         */



    }}
