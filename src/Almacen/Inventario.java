
package Almacen;

import Dispositivos.Impresora;
import java.io.Serializable;
import java.util.ArrayList;

public class Inventario implements Serializable {
    private String Marca;
    private ArrayList<Vehiculo> Vehiculos = new ArrayList();

    public Inventario(String Marca) {
        this.Marca = Marca;
    }
    
    public void Agregar(Vehiculo V){
        Vehiculos.add(V);
    }
    
    public void Listar(){
        Impresora impresora = new Impresora();
        impresora.imprimir(this);
    }

    public String getMarca() {
        return Marca;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return Vehiculos;
    }
        
    }
