package Controllers;

import static Services.ModulesServices.modules;
import java.util.Scanner;
import Models.Module;
import Services.DepartementServices;
import Services.EnseignantServices;
import Services.FilieresServices;
import Services.ModulesServices;

/**
 *
 * @author hp
 */
public class ModulesController {
    public static void showMenu(){
        System.out.println("***********************[ Modules ]**************************");

        System.out.println("1: Pour ajouter un module");
        System.out.println("2: Pour afficher les modules");
        System.out.println("3: Pour modifier un module");
        System.out.println("4: Pour supprimer un module");
        System.out.println("0: Pour retourner au menu principal");

        Scanner s =new Scanner(System.in);

        System.out.println ("Veuillez sélectionner une option : ");
        int option =s.nextInt();
        switch(option) {
            case 1:
                createModule();
                break;
            case 2:
                showModules();
                break;
            case 3:
                editModule();
                break;
            case 4:
                destroyModule();
                break;
            default:
                showMenu();
        }
    }
    public static void showModules(){
        for (Module module : modules) {
            System.out.print("Id : " + module.getId());
            System.out.print(" | intitule : " + module.getIntitule());
            System.out.print(" | Chef : " + module.getChef().getNom());
            System.out.print(" | filiere : " + module.getFiliere().getIntitule());

            System.out.println("");}
    }
    public static void createModule(){
        Scanner s =new Scanner (System.in);
        System.out.println("Entrez intitule  :");
        String intitule=s.nextLine();
        EnseignantsController.showEnseignants();
        System.out.println("Sélecionnez un enseiganant  par id :");
        int id =s.nextInt();
        FilieresController.showFilieres();
        System.out.println("Sélecionnez une filiere  par id :");
        int id1 =s.nextInt();
        ModulesServices.addModule(intitule ,EnseignantServices.enseignantByid(id),FilieresServices.filiereByid(id1));
        showModules();
        showMenu();
    }
    public static void editModule(){
        showModules();
        Scanner s =new Scanner(System.in);
        System.out.println("Sélecionnez un module par id");
        int id =s.nextInt();
        s.nextLine();
        System.out.println("Entrez intitule  :");
        String intitule=s.nextLine();
        EnseignantsController.showEnseignants();
        System.out.println("Sélecionnez un enseiganant  par id :");
        int id1 =s.nextInt();
        FilieresController.showFilieres();
        System.out.println("Sélecionnez une filiere  par id :");
        int id2 =s.nextInt();
        ModulesServices.updateModule(id ,intitule ,EnseignantServices.enseignantByid(id1),FilieresServices.filiereByid(id2));
        showModules();
        showMenu();

    }
    public static void destroyModule(){
        Scanner s=new Scanner (System.in);
        showModules();
        System.out.println("Sélecionnez un module par id :");
        int id =s.nextInt();
        ModulesServices.deleteModule(id);
        showModules();
    }

}
