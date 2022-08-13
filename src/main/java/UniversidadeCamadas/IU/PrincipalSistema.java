package UniversidadeCamadas.IU;

import UniversidadeCamadas.Controlador.Controlador;
import UniversidadeCamadas.Modelos.Universidade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author julio
 */
public class PrincipalSistema {

    public static void main(String[] args) {
        Controlador control = new Controlador();//O sistema n esta sendo utilizado, deixei ai para ter uma base, pq ele é o sistema antigo q eu tinha feito
        control.U.criarDepartamento(0, "Computação");//Para testar o resumo sem ter q cadastrar a cada teste
        control.U.criarDepartamento(1, "Geografia");
        control.U.criarDepartamento(2, "Cartografia");
        
        control.cadastrarEfetivo("1", "fabinho", "Mestrado", "Exatas", "D1", control.buscarDep(0));
        iU principal = new iU();
        principal.setVisible(true);
        principal.setTitle("Sistema Acadêmico");
        principal.toFront();
    }
    
}
