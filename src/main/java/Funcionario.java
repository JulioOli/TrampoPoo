/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
public class Funcionario {
    
    protected String codigo;
    protected String nome;
    protected double salario;
    protected Departamento Dep;
    protected String nivel;
    protected double aumento;
    protected double salariobase = 3000;

    public Funcionario (){
    }

    public Funcionario (String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public void Promoção(){
        StringBuffer sb = new StringBuffer(nivel);
        
        if("D1".equals(nivel) || "S1".equals(nivel) || "T1".equals(nivel)){
            sb.deleteCharAt(sb.length()-1);
            nivel = nivel + "2";
        }
        if("D2".equals(nivel)){
            sb.deleteCharAt(sb.length()-1);
            nivel = nivel + "3";
        }
    }
    
    public double calcularAumento(){
        if("D1".equals(nivel) || "S1".equals(nivel)) aumento = 5.0; 
        if("T1".equals(nivel) || "D2".equals(nivel) || "S2".equals(nivel)) aumento = 10.0; 
        if("T2".equals(nivel) || "D3".equals(nivel)) aumento = 20.0; 
        return aumento;
    }
    
    public double calculaSalario(){
        salario = salariobase + (salariobase * calcularAumento() / 100); 
        return salario;
    }

    public void exibir(){
        System.out.println("Código: "+codigo);
        System.out.println("Nome: "+nome);
        System.out.println("Salário: "+calculaSalario());
        System.out.println("Departamento: " +Dep.getNome());
    }    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        calculaSalario();
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDep() {
        return Dep;
    }

    public void setDep(Departamento Dep) {
        this.Dep = Dep;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }    

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    
}
