package UniversidadeCamadas.Modelos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
    public class Efetivo extends Docente {
        public String area;
        
        public Efetivo(String codigo, String nome, String titulacao, String area, String nivel){
            this.titulacao = titulacao;
            this.codigo = codigo;
            this.nome = nome;
            this.area = area;
            this.nivel = nivel;
        }
        

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
