/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Almacen.Carroseria;
import Almacen.Inventario;
import Almacen.Motor;
import Almacen.Vehiculo;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Gonza
 */
public class Controlador {
 
   public static void grabar(String marca,int peso,int numero,float precio,int cantCilindrada,
           int cilindros,String description,String color){
       Inventario inventario = new Inventario(marca);
       Vehiculo v1 = new Vehiculo(peso);
       Motor m1 = new Motor(numero,precio,cantCilindrada,cilindros);
       Carroseria c1 = new Carroseria(numero,precio,description,color);
       v1.Parte[0]=m1;
       v1.Parte[1]=c1;
       inventario.Agregar(v1);
       inventario.Listar();
       
       try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Inventario"));
            salida.writeObject(inventario);
            salida.close();
        }catch(FileNotFoundException e){// en caso de que el archive no se pueda crear
            e.printStackTrace();
        }catch(IOException e){// en caso de que ocurra otro error
            e.printStackTrace();
        }
   }
   
}
