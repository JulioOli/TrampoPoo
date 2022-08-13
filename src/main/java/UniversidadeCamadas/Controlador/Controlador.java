/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadeCamadas.Controlador;

import UniversidadeCamadas.Modelos.Departamento;
import UniversidadeCamadas.Modelos.Universidade;

/**
 *
 * @author julio
 */
public class Controlador {
    public Universidade U = new Universidade();
    
    public void inicializarDeps(int codigo, String nome){
        
        U.criarDepartamento(codigo, nome);
    }

    public void criarDepartamento(int codigo, String nome){
        U.criarDepartamento(codigo, nome);
    }
    
    public void cadastrarEfetivo(String codigo, String nome, String titulacao, String area, String nivel, Departamento dep) {
        U.cadastrarEfetivo(codigo, nome, titulacao, area, nivel, dep);
    }
    
    public void cadastrarSubstituto(String codigo, String nome, String titulacao, int cargaHoraria, String nivel, Departamento dep){
        U.cadastrarSubstituto(codigo, nome, titulacao, cargaHoraria, nivel, dep);
    }
    
    public void cadastrarTecnico(String codigo, String nome, String funcao, String nivel, Departamento dep){
        U.cadastrarTecnico(codigo, nome, funcao, nivel, dep);
    }

    public int buscarDepartamento (String dep){
        for(Departamento depto : U.ListaDep){
            System.out.println(depto.getNome());
            System.out.println(dep);
            if(depto.getNome().equals(dep)) {
                int d = depto.getCodigo();
                return d;
                
            }
    }
        return 0;
    }

    public Departamento buscarDep (int codigo){
        System.out.println(codigo);
        for(Departamento Depto : U.ListaDep){
            System.out.println(codigo);
            if(Depto.getCodigo() == (codigo)) {
                System.out.println(codigo);
                Departamento d = Depto;
                return d;
                
            }
    }
        return null;
    }

}
