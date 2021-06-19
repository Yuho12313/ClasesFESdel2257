/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.Computadora;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Pantalla;
import ico.fes.componentes.Teclado;


/**
 *
 * @author joser
 */
public class Computadora {
    
    private int marca;
    private int modelo;
    
    private CPU CPU;
    private Pantalla [] Pantalla;
    private Teclado Teclado;
    private Mouse Mouse; 

    public Computadora() {
    }

    public Computadora(int marca, int modelo, CPU CPU, Pantalla[] Pantalla, Teclado Teclado, Mouse Mouse) {
        this.marca = marca;
        this.modelo = modelo;
        this.CPU = CPU;
        this.Pantalla = Pantalla;
        this.Teclado = Teclado;
        this.Mouse = Mouse;
    }

    public Mouse getMouse() {
        return Mouse;
    }

    public void setMouse(Mouse Mouse) {
        this.Mouse = Mouse;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public CPU getCPU() {
        return CPU;
    }

    public void setCPU(CPU CPU) {
        this.CPU = CPU;
    }

    public Pantalla[] getPantalla() {
        return Pantalla;
    }

    public void setPantalla(Pantalla[] Pantalla) {
        this.Pantalla = Pantalla;
    }

    public Teclado getTeclado() {
        return Teclado;
    }

    public void setTeclado(Teclado Teclado) {
        this.Teclado = Teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", CPU=" + CPU + ", Pantalla=" + Pantalla + ", Teclado=" + Teclado + ", Mouse=" + Mouse + '}';
    }
    
    public void Encender(){
        System.out.println("Equipo encendiendose");
    
    }
    
    public void Apagar(){
        System.out.println("Equipo apagandose");
    
    }
    
}
