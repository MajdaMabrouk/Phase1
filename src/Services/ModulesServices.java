package Services;

import Models.Enseignant;
import Models.Filiere;
import java.util.ArrayList;
import Models.Module;

public class ModulesServices {
    public static  ArrayList<Module>modules=new ArrayList<Module>();
    //Ajouter/modifier/supprimer /pour incremnter id
    public static int Module=0;
    public static int getModuleById(){
        Module++;
        return Module;
    }
    public static Module addModule(String intitule ,Enseignant chef ,Filiere filiere ){
        Module module =new Module();
        module.setIntitule(intitule);
        module.setChef(chef);
        module.setFiliere(filiere);
        module.setId(getModuleById());


        modules.add(module);
        return module ;
    }
    public  static Module updateModule ( int id ,String intitule ,Enseignant chef ,Filiere filiere) {
        for(Module module :modules){
            if (module.getId() == id) {
                module.setIntitule(intitule);
                module.setChef(chef);
                module.setFiliere(filiere);
                return module;
            }
        }
        return new Module();

    }
    public static  ArrayList<Module> deleteModule(int id ){
        modules.remove(moduleByid(id));
        return modules ;

    }

    public  static Module moduleByid(int id){
        for(Module module :modules ){
            if (module.getId()==id ){
                return module;
            }
        }
        return new Module();
    }
}
