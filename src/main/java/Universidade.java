
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author julio
 */
public class Universidade {

    private String nome = "UNESP";
    ArrayList<Departamento> ListaDep;

    public Universidade() {
        ListaDep = new ArrayList();

    }
    
    public void addDep (Departamento D){
        ListaDep.add(D);
    }

}
