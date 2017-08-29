package com.oracle.bean;

public class Persona {
    private Persona madre;
    private Persona padre;  
    private String nombre;
    private int edad;
    private char sexo;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
  
    public Persona reproducirse(Persona persona){
      Persona hijo=null;
      
      if(persona != null && this.sexo != persona.sexo){
          
          hijo = new Persona("Jorge", 0, 'M');
         
          if(persona.sexo == 'f'){
              hijo.madre=persona;
              hijo.padre=this;
          }else{
              hijo.madre = this;
              hijo.padre = persona;
          }
      }else{
          System.out.println("No se pueden tener hijos");
      }  
      return hijo;
    }
    
    public void comer(String... comida){
        for (String platillo : comida) {
            System.out.println(nombre + " Comiendo: " + platillo);
        }
    }   

    public Persona getMadre() {
        return madre;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "madre=" + madre + ", padre=" + padre + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
    
    
    
}
