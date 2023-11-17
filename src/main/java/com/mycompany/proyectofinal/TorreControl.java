
package com.mycompany.proyectofinal;
import java.util.ArrayList;
import java.util.List;

public class TorreControl {
    private int numeroIdentificacion;
    private String ubicacion;
    private String correoContacto;
    private String telefonoContacto;
    private List<Vuelo> vuelosBajoSupervision;
    
    public TorreControl(int numeroIdentificacion, String ubicacion, String correoContacto, String telefonoContacto){
        this.numeroIdentificacion = numeroIdentificacion;
        this.ubicacion = ubicacion;
        this.correoContacto = correoContacto;
        this.telefonoContacto = telefonoContacto;
        this.vuelosBajoSupervision = new ArrayList<>();
    }
     public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public List<Vuelo> getVuelosBajoSupervision() {
        return vuelosBajoSupervision;
    }

    public void setVuelosBajoSupervision(List<Vuelo> vuelosBajoSupervision) {
        this.vuelosBajoSupervision = vuelosBajoSupervision;
    }
    public void obtenerInformacionVuelos(){
        System.out.println("Vuelos bajo supervisión de la torre" + numeroIdentificacion + ":");
        for (Vuelo vuelo: vuelosBajoSupervision){
            System.out.println("Número de vuelo: " + vuelo.getNumero());
            System.out.println("Estado del vuelo: " + vuelo.getEstado());
            System.out.println("------------");
        }
    }

    
}
