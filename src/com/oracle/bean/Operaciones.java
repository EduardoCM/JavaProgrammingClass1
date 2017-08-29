package com.oracle.bean;

import java.util.HashMap;
import java.util.Map;

public class Operaciones {
    
    public static void main(String... netec){
        System.out.println(Operaciones.sumar(5,2,8,5,8));
        Operaciones.cobrarComisiones("Armando", 5,8,4,7,8,5);
    }

    /*
    varargs
    */
  public static int sumar(int... a){
      int resultado = 0;
      for (int i : a) {
          resultado += i;
      }
      return resultado;
  }
  
  public static Map<String,Double> cobrarComisiones(String vendedor, double... ventas){
      double totalVentas=0;
      for (double venta : ventas) {
          totalVentas += venta;       
      }
      Map<String, Double> venta = new HashMap<>();
      venta.put(vendedor, totalVentas);
      
      return venta;
  }
  
  
  
  
}
