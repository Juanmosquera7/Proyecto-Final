
package com.mycompany.proyectofinal;


public class ProyectoFinal {

    public static void main(String[] args) {
        Aerolinea aerolinea = new Aerolinea ("Aerolinea MOSQUERA");
        
        Vuelo vuelo1 = new Vuelo ("Vuelo: 1314","Aerolínea: MOSQUERA");
        vuelo1.setEstado("PROGRAMADO");
        
        Vuelo vuelo2 = new Vuelo ("Vuelo: 666", "Aerolínea: MOSQUERA");
        vuelo2.setEstado("EN AIRE");
        
        Vuelo vuelo3 = new Vuelo ("Vuelo: 1229", "Aerolínea: MOSQUERA");
        vuelo3.setEstado("CANCELADO");
        
        aerolinea.agregarVuelo(vuelo1);
        aerolinea.agregarVuelo(vuelo2);
        aerolinea.agregarVuelo(vuelo3);
        
        Piloto piloto1 = new Piloto ("Piloto Juanes", "Licencia 666");
        piloto1.getVuelosAsignados().add(vuelo1);
        piloto1.getVuelosAsignados().add(vuelo2);
        
        
        TorreControl torreControl = new TorreControl(1, "Ubicación A", "correo@torre.com", "123-456-789");
        torreControl.getVuelosBajoSupervision().add(vuelo1);
        torreControl.getVuelosBajoSupervision().add(vuelo2);
        
        System.out.println("Nombre de la Aerolinea: " + aerolinea.getNombre());
        
        int programados = aerolinea.contarVuelosProgramados();
        System.out.println("Cantidad de vuelos programados: " + programados);
       
        int cancelados = aerolinea.contarVuelosCancelados();
        System.out.println("Cantidad de vuelos cancelados: " + cancelados);
        
        System.out.println("Lista de Vuelos operdados por la aerloniea: ");
        for (Vuelo vuelo : aerolinea.getVuelosOperados()){
            System.out.println("Número de vuelo: " + vuelo.getNumero());
            System.out.println("Estado del vuelo: " + vuelo.getEstado());
            System.out.println("___________________________________________");
        }
        System.out.println("\nVuelos asignados al piloto " + piloto1.getNombre() + ": ");
        for (Vuelo vuelo : piloto1.getVuelosAsignados()) {
            System.out.println("Número de vuelo: " + vuelo.getNumero());
            System.out.println("Estado del vuelo: " + vuelo.getEstado());
            System.out.println("___________________________________________");
        }

        System.out.println("\nInformación de vuelos bajo supervisión de la torre " + torreControl.getNumeroIdentificacion() + ": ");
        torreControl.obtenerInformacionVuelos();
        
        
     
    }
}
