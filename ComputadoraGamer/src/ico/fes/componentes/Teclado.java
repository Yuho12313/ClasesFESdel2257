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
public class Teclado {
    
    private String Marca;
    private String Modelo;
    private int Multimedia;
    private int Numerodeteclas;

    public Teclado() {
    }

    public Teclado(String Marca, String Modelo, int Multimedia, int Numerodeteclas) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Multimedia = Multimedia;
        this.Numerodeteclas = Numerodeteclas;
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

    public int getMultimedia() {
        return Multimedia;
    }

    public void setMultimedia(int Multimedia) {
        this.Multimedia = Multimedia;
    }

    public int getNumerodeteclas() {
        return Numerodeteclas;
    }

    public void setNumerodeteclas(int Numerodeteclas) {
        this.Numerodeteclas = Numerodeteclas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", Multimedia=" + Multimedia + ", Numerodeteclas=" + Numerodeteclas + '}';
    }
    
    public void conectado(){
        System.out.println("Teclado conectado");
    
    }
    
    public void desconectado(){
        System.out.println("Teclado desconectado");
    
    }
    
}
