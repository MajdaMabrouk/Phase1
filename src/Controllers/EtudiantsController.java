package Controllers;

import Models.Etudiant;
import Services.DepartementServices;
import Services.EtudiantServices;
import static Services.EtudiantServices.etudiants;
import Services.FilieresServices;
import java.util.Scanner;

public class EtudiantsController {
    public static void showMenu(){
        System.out.println("***********************[ Etudiants ]**************************");

        System.out.println("1: Pour ajouter un etudiant");
        System.out.println("2: Pour afficher les etudiants");
        System.out.println("3: Pour modifier un etudiant");
        System.out.println("4: Pour supprimer un etudiant");
        System.out.println("0: Pour retourner au menu principal");

        Scanner s =new Scanner(System.in);

        System.out.println ("Veuillez sélectionner une option : ");
        int option =s.nextInt();
        switch(option) {
            case 1:
                createEtudiant();
                break;
            case 2:
                showEtudiants();
                break;
            case 3:
                editEtudiant();
                break;
            case 4:
                destroyEtudiant();
                break;
            default:
                showMenu();
        }
    }
    public static void showEtudiants(){
        for (Etudiant etudiant : etudiants) {
            System.out.print("Id : " + etudiant.getId());
            System.out.print(" | nom : " + etudiant.getNom());
            System.out.print(" | prenom : " + etudiant.getPrenom());
            System.out.print(" | email : " + etudiant.getEmail());
            System.out.print(" | grade : " + etudiant.getApogee());

            System.out.print(" | filiere : " + etudiant.getFiliere() );

            System.out.println("");}
    }
    public static void createEtudiant(){
        Scanner s =new Scanner (System.in);
        System.out.println("Entrez Nom  :");
        String nom=s.nextLine();
        System.out.println("Entrez Prenom :");
        String prenom =s.nextLine();
        System.out.println("email :");
        String email =s.nextLine();
        System.out.println("Entrez apogee :");
        int apogee =s.nextInt();
        FilieresController.showFilieres();
        System.out.println("Sélecionnez une filiere  par id :");
        int id =s.nextInt();
        EtudiantServices.addEtudiant(nom ,prenom , email , apogee ,FilieresServices.filiereByid(id));
        showEtudiants();
        showMenu();
    }
    public static void editEtudiant(){
        showEtudiants();
        Scanner s =new Scanner(System.in);
        System.out.println("Sélecionnez un etudiant par id");
        int id =s.nextInt();
        System.out.println("Entrez Nom  :");
        String nom=s.nextLine();
        System.out.println("Entrez Prenom :");
        String prenom =s.nextLine();
        System.out.println("email :");
        String email =s.nextLine();
        System.out.println("Entrez apogee :");
        int apogee =s.nextInt();
        FilieresController.showFilieres();
        System.out.println("Sélecionnez une filiere par id");
        int id1=s.nextInt();
        EtudiantServices.updateEtudiant(id,nom ,prenom,email,apogee, FilieresServices.filiereByid(id1) );
        showEtudiants();
        showMenu();

    }
    public static void destroyEtudiant(){
        Scanner s=new Scanner (System.in);
        showEtudiants();
        System.out.println("Sélecionnez un etudiant par id :");
        int id =s.nextInt();
        EtudiantServices.deleteEtudiant(id);
        showEtudiants();
    }


}
