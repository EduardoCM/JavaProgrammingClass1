package com.oracle.test;

import com.oracle.bean.Persona;

public class TestPersona {
    
    public static void main(String... oracle){        
        Persona saul = new Persona("Saul", 20, 'M');
        
        Persona veronica = new Persona("Vero", 22, 'F');
        
        Persona hijo = saul.reproducirse(veronica);
        
        System.out.println(hijo);
        System.out.println(hijo.getNombre());
        System.out.println(hijo.getMadre().getNombre());
        System.out.println(hijo.getPadre().getNombre());
        
        
        
        
    }
    
}
