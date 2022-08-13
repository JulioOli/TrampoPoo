package UniversidadeCamadas.Modelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author julio
 */
public class Universidade {

    public String nome = "UNESP?";
    public ArrayList<Departamento> ListaDep;
    
    
    public void criarDepartamento(int codigo, String Nome){
        Departamento d = new Departamento(codigo, Nome);
        addDep(d);
    }
    
    public Universidade() {
        ListaDep = new ArrayList();
    }
    
    public void addDep (Departamento D){
        ListaDep.add(D);
    }
    
    public void cadastrarTecnico(String codigo, String nome, String funcao, String nivel, Departamento dep) {
        Tecnico t = new Tecnico(codigo, nome, funcao, nivel);
        t.setDep(dep);
        dep.addFunc(t);
    }
    
    public void cadastrarSubstituto(String codigo, String nome, String titulacao, int cargaHoraria, String nivel, Departamento dep) {
        Substituto s = new Substituto(codigo, nome, titulacao, cargaHoraria, nivel);
        s.setDep(dep);
        dep.addFunc(s);
    }
    
    public void cadastrarEfetivo(String codigo, String nome, String titulacao, String area, String nivel, Departamento dep) {
        Efetivo e = new Efetivo(codigo, nome, titulacao, area, nivel);
        e.setDep(dep);
        dep.addFunc(e);
    }
    
    public void Promoção(String codigo){
        String nivel = buscarCodigo(codigo).getNivel();
        StringBuffer sb = new StringBuffer(nivel);
        
        if("D1".equals(nivel) || "S1".equals(nivel) || "T1".equals(nivel)){
            sb.deleteCharAt(sb.length()-1);
            nivel = nivel + "2";
        }
        if("D2".equals(nivel)){
            sb.deleteCharAt(sb.length()-1);
            nivel = nivel + "3";
        }
        buscarCodigo(codigo).setNivel(nivel);
    }
    
    public String ResumoGeral(){
        String resumo = "";
        resumo = this.getNome();
        System.out.print(this.ListaDep);
        for(Departamento depto : this.ListaDep){
            resumo = resumo + depto.getNome() + "||" + depto.getCodigo();
            for(Funcionario func : depto.ListaFunc){
                resumo = resumo + func.getNome() + "||" + func.calculaSalario(); 
            }
        }
        return resumo;
    }
    
    public Funcionario buscarCodigo(String cod){
        for(Departamento depto : this.ListaDep){
            for(Funcionario func : depto.ListaFunc){
                if(func.getCodigo().equals(cod)){
                    return func;
                }
            }       
        }
    return null;
    }

public Funcionario buscarNome(String Nome){
        for(Departamento depto : this.ListaDep){
            for(Funcionario func : depto.ListaFunc){
                if(func.getCodigo().equals(Nome)){
                    return func;
                }
            }       
        }
    return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




}
