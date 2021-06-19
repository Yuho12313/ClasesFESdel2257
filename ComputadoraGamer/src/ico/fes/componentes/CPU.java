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
public class CPU {
 
    private String Marca;
    private String Modelo;
    private int Velocidaddeproceso;

    public CPU() {
    }

    public CPU(String M, String Mod, int Vp) {
        this.Marca = M;
        this.Modelo = Mod;
        this.Velocidaddeproceso = Vp;
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

    public int getVelocidaddeproceso() {
        return Velocidaddeproceso;
    }

    public void setVelocidaddeproceso(int Velocidaddeproceso) {
        this.Velocidaddeproceso = Velocidaddeproceso;
    }

    @Override
    public String toString() {
        return "CPU{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", Velocidaddeproceso=" + Velocidaddeproceso + '}';
    }
    
    
    
}
