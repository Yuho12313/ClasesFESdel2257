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
public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado em1= new Empleado();
        em1.setNombre("José");
        em1.setSueldo(10000.0f);
        em1.setHorasExtra(10);
        float cobro = em1.calcularSueldo();
        System.out.println("Gran total" + cobro);
        System.out.println(em1.toString());
        
        
        
    }
            
}
