package Services;

import Models.Departement;
import Models.Enseignant;
import java.util.ArrayList;


public class DepartementServices {
    public static ArrayList<Departement>departements=new ArrayList<Departement>();
    //Ajouter/modifier/supprimer /pour incremnter id
    static int DeptId=0;
    public static int getDepartementId(){
        DeptId++;
        return DeptId;
    }
    public static  Departement addDepartement(String intitule,Enseignant Chef){
        Departement departement =new Departement ();
        departement.setIntitule(intitule);
        departement.setChef(Chef);
        departement.setId(getDepartementId());
        departements.add(departement);
        return departement;
    }
    public  static Departement updateDepartement (int id , String intitule ,Enseignant Chef) {
        for(Departement departement :departements){
            if (departement.getId() == id) {
                departement.setIntitule(intitule);
                departement.setChef(Chef);
                return departement ;
            }
        }

        return new Departement();
    }
    public static  ArrayList<Departement> deleteDepartement(int id ){
        departements.remove(DepartementByid(id));
        return departements ;

    }
    public  static Departement DepartementByid(int id){
        for(Departement departement :departements ){
            if (departement.getId()==id ){
                return departement ;
            }
        }
        return new Departement();
    }
}
