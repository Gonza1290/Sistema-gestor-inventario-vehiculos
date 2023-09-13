/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen;

import java.io.Serializable;

public class Vehiculo implements Serializable{
    public int peso;
    public static int i = 0;
    public int autonum;
    public Componente[] Parte = new Componente[2];

    public Vehiculo(int peso) {
        i +=1;
        autonum = i;
        this.peso = peso;
    }
    public Componente getMotor(){
       return Parte[0];
    }
    public Componente getCarroseria(){
       return Parte[1];
    }
    
    
}
