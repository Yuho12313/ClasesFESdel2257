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
public class Mouse {
    
    private String Marca;
    private String Modelo;
    private String Tipo;

    public Mouse() {
    }

    public Mouse(String M, String Mod, String T) {
        this.Marca = M;
        this.Modelo = Mod;
        this.Tipo = T;
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

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Mouse{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", Tipo=" + Tipo + '}';
    }
    
    public void conectado(){
        System.out.println("Mouse conectado");
    
    }
    
    public void desconectado(){
        System.out.println("Se a desconectado el mouse");
    
    }
    
}
