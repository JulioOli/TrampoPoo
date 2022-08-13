package UniversidadeCamadas.Modelos;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
public class Departamento {//Classes da universidade
    private int Codigo;
    private String Nome;
    public ArrayList<Funcionario> ListaFunc;
    
    public Departamento(){
        ListaFunc = new ArrayList();
    }
    
    public Departamento(int Codigo, String Nome){
        this.Codigo = Codigo;
        this.Nome = Nome;
        ListaFunc = new ArrayList();
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Funcionario> getListaFunc() {
        return ListaFunc;
    }

    public void setListaFunc(ArrayList<Funcionario> ListaFunc) {
        this.ListaFunc = ListaFunc;
    }
    
    public void addFunc (Funcionario F){
        F.setDep(this);
        ListaFunc.add(F);
    }
    
    
}
