package Services;

import Models.Departement;
import Models.Enseignant;
import Models.Filiere;
import java.util.ArrayList;


public class FilieresServices {
    public static  ArrayList<Filiere>filieres=new ArrayList<Filiere>();
    //Ajouter/modifier/supprimer /pour incremnter id
    public static int Filiere=0;
    public static int getFiliereById(){
        Filiere++;
        return Filiere;
    }
    public static Filiere addFiliere(String intitule ,Enseignant chef ,Departement departement ){
        Filiere filiere =new Filiere();
        filiere.setIntitule(intitule);
        filiere.setChef(chef);
        filiere.setDept(departement);
        filiere.setId(getFiliereById());


        filieres.add(filiere);
        return filiere ;
    }
    public  static Filiere updateFiliere ( int id ,String intitule ,Enseignant chef ,Departement departement) {
        for(Filiere filiere :filieres){
            if (filiere.getId() == id) {
                filiere.setIntitule(intitule);
                filiere.setChef(chef);
                filiere.setDept(departement);
                return filiere;
            }
        }
        return new Filiere();

    }
    public static  ArrayList<Filiere> deleteFiliere(int id ){
        filieres.remove(filiereByid(id));
        return filieres ;

    }

    public  static Filiere filiereByid(int id){
        for(Filiere filiere :filieres ){
            if (filiere.getId()==id ){
                return filiere;
            }
        }
        return new Filiere();
    }
}
