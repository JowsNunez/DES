/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String arreglo = "Pancho";
        List<Resultado> resultado = new ArrayList<>();

                for (int i = 0; i < arreglo.length(); i++) {
            String result =  convertirDecimalABinarioManual(i);
            resultado.add(new Resultado(result));
        }
        
        for (Resultado resultado1 : resultado) {
            System.out.print(resultado1);
        }
        System.out.println("");
        // TODO code application logic here
    }
    
    
    public static String convertirDecimalABinarioManual(long decimal) {
        if (decimal <= 0) {
            return "0";
        }
        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            short residuo = (short) (decimal % 2);
            decimal = decimal / 2;
            // Insertar el dígito al inicio de la cadena
            binario.insert(0, String.valueOf(residuo));
        }
        return binario.toString();
    }
}


class Resultado{
    
    String posicion;
    
    public Resultado( String posicion){
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    

    @Override
    public String toString() {
        
        return  String.format("%S ", posicion);
    }
    
    
    
}
