package UniversidadeCamadas.Modelos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
public class Substituto extends Docente {

    public int cargaHoraria;
    
    public Substituto(String codigo, String nome, String titulacao, int cargaHoraria, String nivel){
            this.titulacao = titulacao;
            this.codigo = codigo;
            this.nome = nome;
            this.cargaHoraria = cargaHoraria;
            this.nivel = nivel;
        }
    
    

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}
