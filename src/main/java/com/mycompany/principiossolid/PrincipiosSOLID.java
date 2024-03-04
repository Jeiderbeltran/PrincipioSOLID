/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principiossolid;

/**
 *
 * @author sala8
 */
import com.mycompany.principiossolid.lsk.Configuracion;
public class PrincipiosSOLID {

    public static void main(String[] args) {
  
        Configuracion configuracion = new Configuracion();
        configuracion.cargarConfiguracion();
        configuracion.salvarConfiguracion();
    }
}
