package Controllers;

import Models.Filiere;
import Services.DepartementServices;
import Services.EnseignantServices;
import Services.FilieresServices;
import static Services.FilieresServices.filieres;
import java.util.Scanner;

public class FilieresController {
    public static void showMenu(){
        System.out.println("***********************[ Filieres ]**************************");

        System.out.println("1: Pour ajouter un filiere");
        System.out.println("2: Pour afficher les filieres");
        System.out.println("3: Pour modifier un filiere");
        System.out.println("4: Pour supprimer un filiere");
        System.out.println("0: Pour retourner au menu principal");

        Scanner s =new Scanner(System.in);

        System.out.println ("Veuillez sélectionner une option : ");
        int option =s.nextInt();
        switch(option) {
            case 1:
                createFiliere();
                break;
            case 2:
                showFilieres();
                break;
            case 3:
                editFiliere();
                break;
            case 4:
                destroyFiliere();
                break;
            default:
                showMenu();
        }
    }
    public static void showFilieres(){
        for (Filiere filiere : filieres) {
            System.out.print("Id : " + filiere.getId());
            System.out.print(" | intitule : " + filiere.getIntitule());
            System.out.print(" | Chef : " + filiere.getChef().getNom());
            System.out.print(" | departement : " + filiere.getDept().getIntitule());

            System.out.println("");}
    }
    public static void createFiliere(){
        Scanner s =new Scanner (System.in);
        System.out.println("Entrez intitule  :");
        String intitule=s.nextLine();
        EnseignantsController.showEnseignants();
        System.out.println("Sélecionnez un enseiganant  par id :");
        int id =s.nextInt();
        DepartementsController.showDepartements();
        System.out.println("Sélecionnez un departement  par id :");
        int id1 =s.nextInt();
        FilieresServices.addFiliere(intitule ,EnseignantServices.enseignantByid(id),DepartementServices.DepartementByid(id1));
        showFilieres();
        showMenu();
    }
    public static void editFiliere(){
        showFilieres();
        Scanner s =new Scanner(System.in);
        System.out.println("Sélecionnez une filiere par id");
        int id =s.nextInt();
        s.nextLine();
        System.out.println("Entrez intitule  :");
        String intitule=s.nextLine();
        EnseignantsController.showEnseignants();
        System.out.println("Sélecionnez un enseiganant  par id :");
        int id1 =s.nextInt();
        DepartementsController.showDepartements();
        System.out.println("Sélecionnez un departement  par id :");
        int id2 =s.nextInt();
        FilieresServices.updateFiliere(id ,intitule ,EnseignantServices.enseignantByid(id1),DepartementServices.DepartementByid(id2));
        showFilieres();
        showMenu();

    }
    public static void destroyFiliere(){
        Scanner s=new Scanner (System.in);
        showFilieres();
        System.out.println("Sélecionnez une filiere par id :");
        int id =s.nextInt();
        FilieresServices.deleteFiliere(id);
        showFilieres();
    }

}
