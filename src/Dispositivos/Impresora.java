/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dispositivos;

import Almacen.Inventario;
import Almacen.Vehiculo;

/**
 *
 * @author Gonza
 */
public class Impresora {
    
    public void imprimir(Inventario I){
        System.out.println("INVENTARIO");
        System.out.println("Marca: "+ I.getMarca());
        for(Vehiculo V: I.getVehiculos()){
            System.out.println("Auto Nro: "+ V.autonum +"\n" + "Peso: " + V.peso);
            System.out.println("COMPONENTES");
            System.out.println(V.Parte[0]);    
            System.out.println("  Precio: "+ V.Parte[0].precio);
            System.out.println("  Numero: "+ V.Parte[0].numero);
            System.out.println(V.Parte[1]);    
            System.out.println("  Precio: "+ V.Parte[1].precio);
            System.out.println("  Numero: "+ V.Parte[1].numero);
        }
            
    }
}
