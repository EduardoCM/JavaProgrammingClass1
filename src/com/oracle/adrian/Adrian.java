/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.adrian;

/**
 *
 * @author Spartan
 */
public class Adrian {
    
    private String nombre;
    private int edad;

    public Adrian() {
    }
    
    public void nadar(){
        System.out.println("Nadando");        
    }
    
    public void andarEnBicicleta(){
        System.out.println("Paseando en bicicleta");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }        
}