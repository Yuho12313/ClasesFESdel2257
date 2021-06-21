/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.partes;

import ico.fes.objetos.Puerta;
import ico.fes.objetos.Ventana;
import java.awt.Color;

/**
 *
 * @author joser
 */
public class Muro {
    
    private float Largo;
    private float Ancho;
    private float Alto;
    private Color color;
    
    private Puerta Puerta; //Si tiene NULL---> no tiene puerta
    
    private Ventana [] ventana;  //Esto es de 0 a n 

    public Muro() {
    }

    public Muro(float Largo, float Ancho, float Alto, Color color, Puerta Puerta, Ventana[] ventana) {
        this.Largo = Largo;
        this.Ancho = Ancho;
        this.Alto = Alto;
        this.color = color;
        this.Puerta = Puerta;
        this.ventana = ventana;
    }

    public Ventana[] getVentana() {
        return ventana;
    }

    public void setVentana(Ventana[] ventana) {
        this.ventana = ventana;
    }

    public float getLargo() {
        return Largo;
    }

    public void setLargo(float Largo) {
        this.Largo = Largo;
    }

    public float getAncho() {
        return Ancho;
    }

    public void setAncho(float Ancho) {
        this.Ancho = Ancho;
    }

    public float getAlto() {
        return Alto;
    }

    public void setAlto(float Alto) {
        this.Alto = Alto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Puerta getPuerta() {
        return Puerta;
    }

    public void setPuerta(Puerta Puerta) {
        this.Puerta = Puerta;
    }

    @Override
    public String toString() {
        return "Muro{" + "Largo=" + Largo + ", Ancho=" + Ancho + ", Alto=" + Alto + ", color=" + color + ", Puerta=" + Puerta + ", ventana=" + ventana + '}';
    }
    
    public void tirar(){
        System.out.println("Tirando la pared");
    
    }
    
}
