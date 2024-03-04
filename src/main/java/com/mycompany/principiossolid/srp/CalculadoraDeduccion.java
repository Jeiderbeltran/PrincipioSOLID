/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiossolid.srp;

/**
 *
 * @author sala8
 */
public class CalculadoraDeduccion {

    public float calcular(float importeFactura, int porcentajeDeduccion) {
        float importeDeduccion;
        if (importeFactura > 10000) {
            importeDeduccion = (importeFactura * porcentajeDeduccion + 3) / 100;
        } else {
            importeDeduccion = (importeFactura * porcentajeDeduccion) / 100;
        }
        return importeDeduccion;
    }
}
