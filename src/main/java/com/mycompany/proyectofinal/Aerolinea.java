
package com.mycompany.proyectofinal;
import java.util.ArrayList;
import java.util.List;

public class Aerolinea {
    private String nombre;
    private final List<Vuelo> vuelosOperados;
    
    public Aerolinea(String nombre){
        this.nombre = nombre;
        this.vuelosOperados = new ArrayList<>();
        
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void agregarVuelo (Vuelo vuelo){
        vuelosOperados.add(vuelo);
        
    }
    public List<Vuelo> getVuelosOperados(){
        return vuelosOperados;
    }
    
    public int contarVuelosProgramados(){
        int contador = 0;
        for ( Vuelo vuelo: vuelosOperados){
            if(vuelo.getEstado().equals("PROGRAMADO")){
                contador++;
            }
        }
        return contador;
    }
    public int contarVuelosCancelados(){
        int contador = 0;
        for (Vuelo vuelo : vuelosOperados){
            if(vuelo.getEstado().equals("CANCELADO"))
                contador++;
        }
        return contador;
    }   
    

}
