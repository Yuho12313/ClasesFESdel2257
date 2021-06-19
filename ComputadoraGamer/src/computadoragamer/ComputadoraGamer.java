/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadoragamer;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Pantalla;
import ico.fes.componentes.Teclado;
import ico.fes.Computadora.Computadora;


/**
 *
 * @author joser
 */
public class ComputadoraGamer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
        Computadora pc = new Computadora();
        CPU CPU = new CPU();
        Mouse Mouse = new Mouse("Logitech", "G203", "Gaming Mouse");
        Pantalla[] tmppantalla = new Pantalla[3];
        Teclado Teclado = new Teclado("Apple", "X2341", 1, 105);
        
        
        
        
        
}
