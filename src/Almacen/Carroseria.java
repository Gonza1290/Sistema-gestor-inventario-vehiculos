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
public class Carroseria extends Componente implements Serializable{
    public final String descripcion;
    public final String Color;

    public Carroseria(Integer numero,float precio,String descripcion, String Color) {
        super(numero,precio);
        this.descripcion = descripcion;
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Carroseria= " + "\n" + "  descripcion: " + descripcion + "\n" + "  Color: " + Color;
    }
    
    
}
