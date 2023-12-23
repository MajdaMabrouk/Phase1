package TD1.Conditions;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entrer la valeur de a ");
        double a = s.nextDouble();
        System.out.println("entrer la valeur de b ");
        double b = s.nextDouble();
        System.out.println("entrer la valeur de c ");
        double c = s.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double x;
        if (delta > 0) {
            x = -b - Math.sqrt(delta) / (2 * a);
            double x2 = b - Math.sqrt(delta) / (2 * a);
            System.out.println("l'equation admet 2 solutions distincts qui sont : x1" + x + "et x2 :" + x2);
        } else if (delta ==0) {
            x = -b / (2 * a);
            System.out.println("l'equation admet une seul  solutio qui est : x" + x);
        } else {
            System.out.println("l'equation  n'aadmet aucune solution dans R ");
        }

    }
}
