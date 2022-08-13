
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author julio
 */
public class Sistema {

    private int MAX = 1000;
    private Funcionario funcionarios[];
    private int cont;

    private int menu() {
        String menu = "MENU\n"
                + "1 – Cadastrar Funcionario\n"
                + "2 – Relatório Geral\n"
                + "3 – Relatórios\n"
                + "4 – Buscas\n"
                + "9 – Sair\n";
        System.out.println(menu);
        System.out.print("Digite opção: \n");
        Scanner sc = new Scanner(System.in);
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }
    
    private int relatorioMenu() {
        String relatorioMenu = "MENU\n"
                + "1 – Resumo dos Departamentos\n"
                + "2 – Resumo Com Gasto de Faixa Específica\n"
                + "3 – Funcionários Com Salários Com Faixa Específica\n"
                + "4 – Exibir Todos os Funcionários\n"
                + "9 – Sair\n";
        System.out.println(relatorioMenu);
        System.out.print("Digite opção: \n");
        Scanner sc = new Scanner(System.in);
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }
    
    private int buscaMenu() {
        String buscaMenu = "MENU\n"
                + "1 – Exibir Todos os Técnicos\n"
                + "2 – Exibir Todos os Docentes\n"
                + "3 – Exibir Todos os Docentes Efetivos\n"
                + "4 – Exibir Todos os Docentes Substitutos\n"
                + "5 - Exibir Informações de um Departamento\n"
                + "6 - Buscar Funcionário pelo Código\n"
                + "7 - Buscar Funcionário pelo Nome"
                + "9 – Sair\n";
        System.out.println(buscaMenu);
        System.out.print("Digite opção: \n");
        Scanner sc = new Scanner(System.in);
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

    private int NivelFunc() {
        Scanner sc = new Scanner(System.in);
        String NivelFunc = "Nível do Funcionário\n"
                + "1 – Docente Efetivo D1\n"
                + "2 - Docente Efetivo D2\n"
                + "3 - Docente Efetivo D3\n"
                + "4 – Docente Substituto S1\n"
                + "5 - Docente Substituto S2\n"
                + "6 – Técnico T1\n"
                + "7 - Técnico T2\n"
                + "9 – Sair\n"
                + "Digite opção: ";
        System.out.println(NivelFunc);
        int op = Integer.parseInt(sc.next());
        return op;
    }

    private int FuncaoMenu() {
        Scanner sc = new Scanner(System.in);
        String FuncaoMenu = "Função :\n"
                + "1 – Assessor\n"
                + "2 - Laboratório\n"
                + "3 - Secretário\n"
                + "9 – Sair\n"
                + "Digite opção: ";
        System.out.println(FuncaoMenu);
        int op = Integer.parseInt(sc.next());
        return op;
    }

    private int TitulacaoMenu() {
        Scanner sc = new Scanner(System.in);
        String TitulacaoMenu = "Titulação :\n"
                + "1 – Graduação\n"
                + "2 - Mestrado\n"
                + "3 - Doutorado\n"
                + "4 - Livre-Docente\n"
                + "5 - Titular\n"
                + "9 – Sair\n"
                + "Digite opção: ";
        System.out.println(TitulacaoMenu);
        int op = Integer.parseInt(sc.next());
        return op;
    }

    private int CargaMenu() {
        Scanner sc = new Scanner(System.in);
        String CargaMenu = "Carga horária :\n"
                + "1 – 12 Horas\n"
                + "2 - 24 Horas\n"
                + "9 – Sair\n"
                + "Digite opção: ";
        System.out.println(CargaMenu);
        int op = Integer.parseInt(sc.next());
        return op;
    }

    private int AreaMenu() {
        Scanner sc = new Scanner(System.in);
        String AreaMenu = "Área do Docente :\n"
                + "1 – Biológicas\n"
                + "2 - Exatas\n"
                + "3 - Humanas\n"
                + "4 - Saúde\n"
                + "9 – Sair\n"
                + "Digite opção: ";
        System.out.println(AreaMenu);
        int op = Integer.parseInt(sc.next());
        return op;
    }
    
    private int DepMenu() {
        Scanner sc = new Scanner(System.in);
        String DepMenu = "Departamento :\n"
                + "1 – Computação\n"
                + "2 - Geografia\n"
                + "3 - Cartografia\n"
                + "Digite opção: ";
        System.out.println(DepMenu);
        int op = Integer.parseInt(sc.next());
        return op;
    }

    public Funcionario buscar(String nome) {
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i].getNome().equals(nome)) {
                return funcionarios[i];
            }
        }
        return null;
    }

    public void executar() {
        Universidade U = new Universidade();
        Departamento a1 = new Departamento(00, "Computa");
        Departamento a2 = new Departamento(01, "Geografia");
        Departamento a3 = new Departamento(02, "Cartografia");
        U.addDep(a1);U.addDep(a2);U.addDep(a3);

        System.out.println("SISTEMA ACADEMIA");
        int op;
        funcionarios = new Funcionario[MAX];
        int cont = 0;
        String nome;
        String codigo;
        int dep = 1;
        String nivel = null;
        Double aumento;
        int cargaHoraria = 12;
        String titulacao = null;
        String funcao = null;
        String area = null;

        Scanner sc = new Scanner(System.in);

        do {
            op = menu();
            switch (op) {
                case 1:
                    if (cont < MAX) {
                        System.out.println("Código do Funcionario: ");
                        codigo = JOptionPane.showInputDialog("Codigo:");
                        System.out.println("Nome do Funcionario: ");
                        nome = sc.nextLine();
                        
                        op = NivelFunc();
                        switch (op) {
                            case 1:
                                    nivel = "D1";
                                    aumento = 5.0;
                                    System.out.print("Titulação do Docente: ");

                                        op = TitulacaoMenu();
                                        switch (op) {
                                            case 1: titulacao = "Assessor"; break;
                                            case 2: titulacao = "Laboratorio"; break;
                                            case 3: titulacao = "Secretario"; break;
                                        }

                                    System.out.print("Área do Docente: ");

                                        op = AreaMenu();
                                        switch (op) {
                                            case 1: area = "Biologicas"; break;
                                            case 2: area = "Exatas"; break;
                                            case 3: area = "Humanas"; break;
                                            case 4: area = "Saude"; break;
                                        }
                                    break;
                                    
                                case 2:
                                    nivel = "D2";
                                    aumento = 10.0;
                                    System.out.print("Titulação do Docente: ");

                                   
                                        op = TitulacaoMenu();
                                        switch (op) {
                                            case 1: titulacao = "Assessor"; break;
                                            case 2: titulacao = "Laboratorio"; break;
                                            case 3: titulacao = "Secretario"; break;
                                        }

                                    System.out.print("Área do Docente: ");

                                        op = AreaMenu();
                                        switch (op) {
                                            case 1: area = "Biologicas"; break;
                                            case 2: area = "Exatas"; break;
                                            case 3: area = "Humanas"; break;
                                            case 4: area = "Saude"; break;
                                        }

                                    break;

                                case 3:
                                    nivel = "D3";
                                    aumento = 20.0;
                                    System.out.print("Titulação do Docente: ");

                                    
                                        op = TitulacaoMenu();
                                        switch (op) {
                                            case 1: titulacao = "Assessor"; break;
                                            case 2: titulacao = "Laboratorio"; break;
                                            case 3: titulacao = "Secretario"; break;
                                        }

                                    System.out.print("Área do Docente: ");

                                    
                                        op = AreaMenu();
                                        switch (op) {
                                            case 1: area = "Biologicas"; break;
                                            case 2: area = "Exatas"; break;
                                            case 3: area = "Humanas"; break;
                                            case 4: area = "Saude"; break;
                                        }
                                    break;

                                case 4:
                                    nivel = "S1";
                                    aumento = 5.0;
                                    System.out.print("Titulação do Docente: ");

                                    
                                        op = TitulacaoMenu();
                                        switch (op) {
                                            case 1: titulacao = "Assessor"; break;
                                            case 2: titulacao = "Laboratorio"; break;
                                            case 3: titulacao = "Secretario"; break;
                                        }

                                    System.out.print("Carga Horaria do Docente Substituto: ");

                                    
                                        op = CargaMenu();
                                        switch (op) {
                                            case 1 : cargaHoraria = 12; break;
                                            case 2 : cargaHoraria = 24; break;
                                        }

                                    break;

                                case 5:
                                    nivel = "S2";
                                    aumento = 10.0;
                                    System.out.print("Titulação do Docente: ");

                                    
                                        op = TitulacaoMenu();
                                        switch (op) {
                                            case 1: titulacao = "Assessor"; break;
                                            case 2: titulacao = "Laboratorio"; break;
                                            case 3: titulacao = "Secretario"; break;
                                        }

                                    System.out.print("Carga Horaria do Docente Substituto: ");

                                    
                                        op = CargaMenu();
                                        switch (op) {
                                            case 1 : cargaHoraria = 12; break;
                                            case 2 : cargaHoraria = 24; break;
                                        }
                                    
                                    
                                    break;

                                case 6:
                                    nivel = "T1";
                                    aumento = 10.0;
                                    System.out.print("Função do Técnico: ");

                                    
                                        op = FuncaoMenu();
                                        switch (op) {
                                            case 1: funcao = "Assessor"; break;
                                            case 2: funcao = "Laboratorio"; break ;
                                            case 3: funcao = "Secretario"; break;
                                        }

                                    break;

                                case 7:
                                    nivel = "T2";
                                    aumento = 20.0;
                                    System.out.print("Função do Técnico: ");

                                    
                                        op = FuncaoMenu();
                                        switch (op) {
                                            case 1: funcao = "Assessor"; break;
                                            case 2: funcao = "Laboratorio"; break ;
                                            case 3: funcao = "Secretario"; break;
                                        }

                                    break;

                                default:
                                    System.out.println("OPÇÃO INVÁLIDA");
                                    break;
                            }
                        
                            op = DepMenu();
                            switch (op){
                                case 1: dep = 0; break;
                                case 2: dep = 1; break;
                                case 3: dep = 2; break;
                            }
                        
                    //Construtores
                    switch (nivel){
                        case "D1":
                            Efetivo D1 = new Efetivo(codigo, nome, titulacao, area, nivel);
                            U.ListaDep.get(dep).addFunc(D1);
                        break;
                        case "D2":
                            Efetivo D2 = new Efetivo(codigo, nome, titulacao, area, nivel);
                            U.ListaDep.get(dep).addFunc(D2);
                        break;
                        case "D3":
                            Efetivo D3 = new Efetivo(codigo, nome, titulacao, area, nivel);
                            U.ListaDep.get(dep).addFunc(D3);
                        break;
                        case "S1":
                            Substituto S1 = new Substituto(codigo, nome, titulacao, cargaHoraria, nivel);
                            U.ListaDep.get(dep).addFunc(S1);
                        break;
                        case "S2":
                            Substituto S2 = new Substituto(codigo, nome, titulacao, cargaHoraria, nivel);
                            U.ListaDep.get(dep).addFunc(S2);
                        break;
                        case "T1":
                            Tecnico T1 = new Tecnico(codigo, nome, funcao, nivel);
                            U.ListaDep.get(dep).addFunc(T1);
                        break;
                        case "T2":
                            Tecnico T2 = new Tecnico(codigo, nome, funcao, nivel);
                            U.ListaDep.get(dep).addFunc(T2);
                        break;
                    }
                    
                    }//Fim do cadastro
                    break;

                case 2: //Exibir
                    System.out.println("---UNESP---");
                    //COMPUTA
                    System.out.println(U.ListaDep.get(0).getCodigo()+U.ListaDep.get(0).getNome());
                    for(int i=0;i<U.ListaDep.get(0).ListaFunc.size();i++ ){
                        System.out.println("Nome: "+U.ListaDep.get(0).ListaFunc.get(i).getNome()+" | Salario: "+U.ListaDep.get(0).ListaFunc.get(i).calculaSalario());
                    }
                    
                    //GEOGRAFIA
                    System.out.println(U.ListaDep.get(1).getCodigo()+U.ListaDep.get(1).getNome());
                    for(int i=0;i<U.ListaDep.get(1).ListaFunc.size();i++ ){
                        System.out.println("Nome: "+U.ListaDep.get(1).ListaFunc.get(i).getNome()+" | Salario: "+U.ListaDep.get(1).ListaFunc.get(i).calculaSalario());
                    }
                    
                    //CARTO
                    System.out.println(U.ListaDep.get(2).getCodigo()+U.ListaDep.get(2).getNome());
                    for(int i=0;i<U.ListaDep.get(2).ListaFunc.size();i++ ){
                        System.out.println("Nome: "+U.ListaDep.get(1).ListaFunc.get(i).getNome()+" | Salario: "+U.ListaDep.get(1).ListaFunc.get(i).calculaSalario());
                    }
                    //METODO 1 - Pronto, GERAL
                    break;

                case 3://Relatorios
                    Relatorios();
                    
                    break;

                case 4://Buscas
                    Buscas();
                    
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }

        } while (op != 9);
    }
    
    public void Relatorios(){
    int op = relatorioMenu();
    switch(op){
        case 1: break;//Resumo Dep
        case 2: break;//Resumo Dep Gasto
        case 3: break;//Func Salario
        case 4: break;//Exibir tudo func
    }}
    
    public void Buscas(){
        int op = relatorioMenu();
    switch(op){
        case 1: break;//todos Tec
        case 2: break;//TOdos docentes
        case 3: break;//Todos efeti
        case 4: break;//Todos Substi
        case 5: break;//Busca Departamento
        case 6: break;//Busca codigo
        case 7: break;//Busca Nome
    } } }