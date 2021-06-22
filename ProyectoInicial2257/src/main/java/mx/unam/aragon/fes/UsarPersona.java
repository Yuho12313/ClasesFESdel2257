/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes;

/**
 *
 * @author joser
 */

public class UsarPersona {
    
    public static void main(String[] args) {
        System.out.println("Programa usar persona");
        
        
        Persona per1 = new Persona(); //Llamada al constructor
        Persona per2 = new Persona();
        
        System.out.println(per1.getNombre());
        
        per2.setNombre("José");
        System.out.println(per2.getNombre());
        
        System.out.println(per2.toString());
        
    }
    
}
