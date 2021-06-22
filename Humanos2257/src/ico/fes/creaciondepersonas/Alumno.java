/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.creaciondepersonas;

/**
 *
 * @author joser
 */
public class Alumno extends Personas{
    
    private String NoCuenta;
    private String Carrera;
    private int Semestre;

    public Alumno() {
    }

    public Alumno(String NoCuenta, String Carrera, int Semestre) {
        this.NoCuenta = NoCuenta;
        this.Carrera = Carrera;
        this.Semestre = Semestre;
    }

    public Alumno(String NoCuenta, String Carrera, int Semestre, String Nombre, int Peso, int Edad, float Altura) {
        super(Nombre, Peso, Edad, Altura);
        this.NoCuenta = NoCuenta;
        this.Carrera = Carrera;
        this.Semestre = Semestre;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public String getNoCuenta() {
        return NoCuenta;
    }

    public void setNoCuenta(String NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "NoCuenta=" + NoCuenta + ", Carrera=" + Carrera + ", Semestre=" + Semestre + '}';
    }
    
    public void Cursando(){
        System.out.println("Soy alumno :D");
    
    }
    
}
