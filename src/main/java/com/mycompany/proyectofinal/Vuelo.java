
package com.mycompany.proyectofinal;


public class Vuelo {
    private String numero;
    private String aerolinea;
    private String categoria;
    private Piloto pilotoAsignado;
    private String terminal;
    private String puertaEmbarque;
    private String fechaHoraDespegue;
    private String fechaHoraAterrizaje;
    private String ruta;
    private TorreControl torreAsignada;
    private int numeroPasajeros;
    private String estado;

    public Vuelo(String numero, String aerolinea) {
        this.numero = numero;
        this.aerolinea = aerolinea;
        this.estado = "PROGRAMADO";
    }

    // Getters y Setters para todos los atributos

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Piloto getPilotoAsignado() {
        return pilotoAsignado;
    }

    public void setPilotoAsignado(Piloto pilotoAsignado) {
        this.pilotoAsignado = pilotoAsignado;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getPuertaEmbarque() {
        return puertaEmbarque;
    }

    public void setPuertaEmbarque(String puertaEmbarque) {
        this.puertaEmbarque = puertaEmbarque;
    }

    public String getFechaHoraDespegue() {
        return fechaHoraDespegue;
    }

    public void setFechaHoraDespegue(String fechaHoraDespegue) {
        this.fechaHoraDespegue = fechaHoraDespegue;
    }

    public String getFechaHoraAterrizaje() {
        return fechaHoraAterrizaje;
    }

    public void setFechaHoraAterrizaje(String fechaHoraAterrizaje) {
        this.fechaHoraAterrizaje = fechaHoraAterrizaje;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public TorreControl getTorreAsignada() {
        return torreAsignada;
    }

    public void setTorreAsignada(TorreControl torreAsignada) {
        this.torreAsignada = torreAsignada;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String obtenerInformacion() {
        return "Número de vuelo: " + numero +
               "\nAerolínea: " + aerolinea +
               "\nCategoría: " + categoria +
               "\nPiloto Asignado: " + pilotoAsignado.getNombre() +
               "\nTerminal: " + terminal +
               "\nPuerta de Embarque: " + puertaEmbarque +
               "\nFecha y Hora de Despegue: " + fechaHoraDespegue +
               "\nFecha y Hora de Aterrizaje: " + fechaHoraAterrizaje +
               "\nRuta: " + ruta +
               "\nTorrre de Control Asignada: " + torreAsignada.getNumeroIdentificacion()+
               "\nNúmero de Pasajeros: " + numeroPasajeros +
               "\nEstado: " + estado;
    }
    public void asignarPiloto(Piloto piloto){
        this.pilotoAsignado = piloto;
    
    }

   
      
    

    
}
