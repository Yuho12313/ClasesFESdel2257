/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion2257;

import ico.fes.objetos.Puerta;
import ico.fes.objetos.Ventana;
import ico.fes.partes.Muro;
import java.awt.Color;

/**
 *
 * @author joser
 */
public class Composicion2257 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Muro muron = new Muro();
        muron.setPuerta(new Puerta("Madera", Color.WHITE, true));
        Ventana[] tmpventana = new Ventana[2];
        tmpventana[0] = new Ventana("Madera", Color.yellow, 0.5f, 1.0f);
        tmpventana[1] = new Ventana("Madera", Color.GREEN, 0.5f, 1.0f);
        
        muron.setVentana(tmpventana);
        
        //System.out.println(muron);
        //System.out.println(muron.getVentana()[0]);
        //System.out.println(muron.getVentana()[1]);
        
        muron.getPuerta().setMaterial("aluminio");
       // System.out.println(muron);
        muron.getVentana()[1].setMaterial("Aluminio");
        //System.out.println(muron.getVentana()[1]);
        
        
        Muro murosur = new Muro(5.0f, 4.5f, 2.5f, Color.blue, new Puerta("Aluminio", Color.WHITE, true), null);
        System.out.println(murosur);
        
        
        
    }
    
}
