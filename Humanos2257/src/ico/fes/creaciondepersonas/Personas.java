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
public class Personas {
    
    private String Nombre;
    private int Peso;
    private int Edad;
    private float Altura;

    public Personas() {
    }

    public Personas(String Nombre, int Peso, int Edad, float Altura) {
        this.Nombre = Nombre;
        this.Peso = Peso;
        this.Edad = Edad;
        this.Altura = Altura;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Personas{" + "Nombre=" + Nombre + ", Peso=" + Peso + ", Edad=" + Edad + ", Altura=" + Altura + '}';
    }
    
    public void Vivo(){
        System.out.println("Estoy vivo");
    
    }
    
    public void Muerto(){
        System.out.println("Me morir");
    
    }
    
}
