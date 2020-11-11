/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Postres.Postre;

/**
 *
 * @author Betancourt
 */
public class ManejeoDePrecio {
    public static double calcularPrecioFinal(Postre p){        
        double precioFinal= (p.getPrecioParcial()+(p.getPrecioParcial()*0.12))+(p.getNumAderezos()*0.50);
        return precioFinal;
    }
    
    public static String showPrecioFinal(Postre p){
        return "Precio Final: $ " + calcularPrecioFinal(p);
    }
}
