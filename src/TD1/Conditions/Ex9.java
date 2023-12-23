package TD1.Conditions;

import java.util.Scanner;

public class Ex9 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entrer le 1er nombre ");
        int N1 = s.nextInt();
        System.out.println("entrer le 2eme nombre ");
        int N2 = s.nextInt();
        // variable pour l'echange
        int Temp ;
        if (N1>N2)
        {  Temp =N1;
            N1=N2;
            N2 =Temp;}
        else
        {  Temp =N2;
            N2=N1;
            N1 =Temp;}
        System.out.println(" N1 = " +N1+ " N2 :" +N2);

    }
}
