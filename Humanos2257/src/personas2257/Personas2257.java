/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas2257;

import ico.fes.creaciondepersonas.Alumno;
import ico.fes.creaciondepersonas.Personas;
/**
 *
 * @author JCRS
 */
public class Personas2257 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Personas per1 = new Personas("Jaime Torres Garcia", 78, 34, 175);
        Personas per2 = new Alumno("319564258", "Derecho", 4, "Pedrito Perez Perez", 89, 25, 170);
        
        System.out.println(per1);
        System.out.println(per2);
        
        //Soy yo
        Personas per3 = new Alumno("318286433", "Ing. en Computacion", 2, "José Cruz Ramirez Salanueva", 85, 18, 180);
        
        System.out.println(per3);
        
    }
    
}
