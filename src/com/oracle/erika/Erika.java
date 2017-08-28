
package com.oracle.erika;


public class Erika {
    private String nombre;
    private String edad;
    
    public void jugar(){
        System.out.println(":::: Juagando :::::");        
    }
   
    public void dormir(){        
        System.out.println("Sonando a programar");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
}
