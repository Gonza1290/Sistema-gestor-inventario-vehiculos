/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen;

import java.io.Serializable;

/**
 *
 * @author Gonza
 */
public class Motor extends Componente implements Serializable{
    public final int cantCilindros;
    public final int cilindrada;

    public Motor(Integer numero,float precio,int cantCilindros, int cilindrada) {
        super(numero,precio);
        this.cantCilindros = cantCilindros;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motor =" +"\n" + "  cant Cilindros: " + cantCilindros +"\n" +"  cilindrada: " + cilindrada;
    }

    
    
    
}
