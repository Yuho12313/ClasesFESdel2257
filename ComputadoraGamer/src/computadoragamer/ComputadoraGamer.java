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
        Computadora pc = new Computadora();
        pc.setCPU(new CPU("Intel", "Core i3", 6));
        pc.setMouse(new Mouse("Logitech", "G203", "Gaming Mouse"));
        pc.setTeclado(new Teclado("Apple", "X2341", 1, 105));
        Pantalla [] tmppantalla = new Pantalla [2];
        tmppantalla [0] = new Pantalla("Samsung", "G3445", 8);
        tmppantalla [1] = new Pantalla("Apple", "X32", 9);
        
        pc.setPantalla(tmppantalla);
        
        System.out.println(pc);
    }
        
        
        
        
        
        
}
