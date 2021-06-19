/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author joser
 */
public class Pantalla {
    
    private String Marca;
    private String Modelo;
    private int pulgadas;

    public Pantalla() {
    }

    public Pantalla(String Marca, String Modelo, int pulgadas) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", pulgadas=" + pulgadas + '}';
    }
    
    public void prendido(){
        System.out.println("Encendiendo la pantalla");
    
    }
    
    public void apagado(){
        System.out.println("Apagando la pantalla");
    
    }
    
}
