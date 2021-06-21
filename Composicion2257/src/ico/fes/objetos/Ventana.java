/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.objetos;

import java.awt.Color;

/**
 *
 * @author joser
 */
public class Ventana {
    
    private String Material;
    private Color Color;
    private float Alto;
    private float Ancho;

    public Ventana() {
    }

    public Ventana(String Material, Color Color, float Alto, float Ancho) {
        this.Material = Material;
        this.Color = Color;
        this.Alto = Alto;
        this.Ancho = Ancho;
    }

    public float getAncho() {
        return Ancho;
    }

    public void setAncho(float Ancho) {
        this.Ancho = Ancho;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public float getAlto() {
        return Alto;
    }

    public void setAlto(float Alto) {
        this.Alto = Alto;
    }

    @Override
    public String toString() {
        return "Ventana{" + "Material=" + Material + ", Color=" + Color + ", Alto=" + Alto + ", Ancho=" + Ancho + '}';
    }
    
    public void abri(){
        System.out.println("Abriendo ventana");
    
    }
    
    public void cerrar(){
        System.out.println("Cerrando ventana");
    
    }
    
}
