/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.*;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
                
        LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        ArrayList<Postre> arrPostres = new ArrayList<>();
        
          
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        CREMA c= new CREMA();
        c.setNombre();
        FRUTILLA f=new FRUTILLA();
        f.setNombre();
        System.out.println(helado_vainilla);
        arrPostres.add(helado_vainilla);
        
                //System.out.println(helado_vainilla.showPrecioFinal());
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        System.out.println(pastel_chocolate);
        arrPostres.add(pastel_chocolate);
        //System.out.println(helado_vainilla.showPrecioFinal());
        
        arrPostres.forEach(postre -> {
            postre.anadirAderezo(c);
            postre.anadirAderezo(f);
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(leche, postre);
            System.out.println(ManejeoDePrecio.showPrecioFinal(postre));
        });
        
                
    }
                
  }

    
    