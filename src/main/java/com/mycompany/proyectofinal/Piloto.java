
package com.mycompany.proyectofinal;
import java.util.ArrayList;
import java.util.List;

public class Piloto {
    private String nombre;
    private String licenciaVuelo;
    private  List<Vuelo> vuelosAsignados;
    
    public Piloto (String nombre, String licenciaVuelo){
        this.nombre = nombre;
        this.licenciaVuelo = licenciaVuelo;
        this.vuelosAsignados = new ArrayList <>();
        
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicenciaVuelo() {
        return licenciaVuelo;
    }

    public void setLicenciaVuelo(String licenciaVuelo) {
        this.licenciaVuelo = licenciaVuelo;
    }

    public List<Vuelo> getVuelosAsignados() {
        return vuelosAsignados;
    }

    public void setVuelosAsignados(List<Vuelo> vuelosAsignados) {
        this.vuelosAsignados = vuelosAsignados;
    }
    public List<Vuelo> obtenerVuelosPorCategoria(String categoria){
        List<Vuelo> vuelosPorCategorias = new ArrayList <>();
        for (Vuelo vuelo : vuelosAsignados){
            if (vuelo.getCategoria().equals(categoria)){
            }
            
        }
        return vuelosPorCategorias;
    }
    public List<Vuelo>obtenerVuelosPorEstado(String estado){
        List<Vuelo> vuelosPorEstado = new ArrayList <>();
        for (Vuelo vuelo: vuelosAsignados){
           if(vuelo.getEstado().equals(estado)){
               vuelosPorEstado.add(vuelo);
           }
        
        }
        return vuelosPorEstado;
    }

    
        
}
