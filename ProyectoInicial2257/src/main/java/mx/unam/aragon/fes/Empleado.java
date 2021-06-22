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
public class Empleado extends Persona{
    
   private int numerodeEmpleado;
   private String departamente;
   private float sueldo;
   private int horasExtra;
   private String domicilio;

    public Empleado() {
    }

    public Empleado(int numerodeEmpleado, String departamente, float sueldo, int horasExtra, String domicilio) {
        this.numerodeEmpleado = numerodeEmpleado;
        this.departamente = departamente;
        this.sueldo = sueldo;
        this.horasExtra = horasExtra;
        this.domicilio = domicilio;
    }

    public Empleado(int numerodeEmpleado, String departamente, float sueldo, int horasExtra, String domicilio, String nombre, String apPaterno, String apMaterno, int edad, String curp) {
        super(nombre, apPaterno, apMaterno, edad, curp);
        this.numerodeEmpleado = numerodeEmpleado;
        this.departamente = departamente;
        this.sueldo = sueldo;
        this.horasExtra = horasExtra;
        this.domicilio = domicilio;
    }

    public int getNumerodeEmpleado() {
        return numerodeEmpleado;
    }

    public void setNumerodeEmpleado(int numerodeEmpleado) {
        this.numerodeEmpleado = numerodeEmpleado;
    }

    public String getDepartamente() {
        return departamente;
    }

    public void setDepartamente(String departamente) {
        this.departamente = departamente;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numerodeEmpleado=" + numerodeEmpleado + ", departamente=" + departamente + ", sueldo=" + sueldo + ", horasExtra=" + horasExtra + ", domicilio=" + domicilio + '}';
    }
   
    public float calcularSueldo(){
       
        float sueldototal = 0.0f;
        sueldototal = this.sueldo + (this.horasExtra * 150.0f);
        
        return sueldototal;
        
     }

}