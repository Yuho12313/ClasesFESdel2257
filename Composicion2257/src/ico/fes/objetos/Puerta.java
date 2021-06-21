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
public class Puerta {
    
    private String material;
    private Color color;
    private boolean convidrio;

    public Puerta() {
    }

    public Puerta(String material, Color color, boolean convidrio) {
        this.material = material;
        this.color = color;
        this.convidrio = convidrio;
    }

    public boolean isConvidrio() {
        return convidrio;
    }

    public void setConvidrio(boolean convidrio) {
        this.convidrio = convidrio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Puerta{" + "material=" + material + ", color=" + color + ", convidrio=" + convidrio + '}';
    }
    
    public void abrir(){
        System.out.println("Abriendo puerta");

}
    public void cerrar(){
        System.out.println("Cerrando puerta");
    
    }
    
}
