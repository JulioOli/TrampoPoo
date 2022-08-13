package UniversidadeCamadas.Modelos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
public class Tecnico extends Funcionario {

    public String funcao;

    public Tecnico(String codigo, String nome, String funcao, String nivel) {

        this.codigo = codigo;
        this.nome = nome;
        this.funcao = funcao;
        this.nivel = nivel;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
