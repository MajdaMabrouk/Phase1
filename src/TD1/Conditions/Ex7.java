package TD1.Conditions;

import java.util.Scanner;

public class Ex7 {
    public static void main ( String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter un entier N");
        int N = s.nextInt();
        //tester si le nombre est compose de 3 nombre
        if (N>=100 && N<=999)
        { System.out.println(" les nombres formes par "+N+"est :");
            int X1= N/100;
            int X2 = (N%100)/10;
            int X3= N%10;
            System.out.println(X1*100+X2*10+X3);
            System.out.println(X1*100+X3*10+X2);
            System.out.println(X2*100+X1*10+X3);
            System.out.println(X2*100+X3*10+X1);
            System.out.println(X3*100+X1*10+X2);
            System.out.println(X3*100+X2*10+X1);

        }
        else {
            System.out.println("entrer un nombre de 3 chiffres :");

        }
    }
}
