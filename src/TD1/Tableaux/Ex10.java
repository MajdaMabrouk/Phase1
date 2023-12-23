package TD1.Tableaux;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // Saisie de la taille de la matrice carrée
        System.out.print("Entrez la taille de la matrice : ");
        int size = s.nextInt();

        // Saisie de la première matrice
        double[][] matriceM = new double[size][size];
        System.out.println("Saisie de la première matrice :");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matriceM[i][j] = s.nextDouble();
            }
        }

        // Saisie de la deuxième matrice
        double[][] matriceN = new double[size][size];
        System.out.println("Saisie de la deuxième matrice :");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matriceN[i][j] = s.nextDouble();
            }
        }

        // Calcul de la somme des matrices
        double[][] sum= new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum[i][j] = matriceM[i][j] + matriceN[i][j];
            }
        }

        // Affichage du résultat
        System.out.println("La somme de deux matrices  est :");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
