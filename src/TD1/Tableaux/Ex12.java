package TD1.Tableaux;

public class Ex12 {
    public static void main(String[] args) {
        char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};
        int decalage = 1;

        System.out.println("Tableau initial :");
        afficherTableau(tableau);

        // Effectuer le décalage
        char premier = tableau[0];
        for (int i = 0; i < tableau.length - 1; i++) {
            tableau[i] = tableau[i + 1];
        }
        tableau[tableau.length - 1] = premier;

        System.out.println("\nTableau modifié après décalage :");
        afficherTableau(tableau);
    }

    // Fonction pour afficher un tableau de caractères
    public static void afficherTableau(char[] tableau) {
        for (char element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
