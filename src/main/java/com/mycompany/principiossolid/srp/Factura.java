/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiossolid.srp;

import java.util.Date;

/**
 *
 * @author sala8
 */
public class Factura {

    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;

    private CalculadoraDeduccion calculadoraDeduccion;
    private CalculadoraIVA calculadoraIVA;

    public Factura(CalculadoraDeduccion calculadoraDeduccion, CalculadoraIVA calculadoraIVA) {
        this.calculadoraDeduccion = calculadoraDeduccion;
        this.calculadoraIVA = calculadoraIVA;
    }

    // Método que calcula el total de la factura
    public void calcularTotal() {
        // Calculamos la deducción
        importeDeduccion = calculadoraDeduccion.calcular(importeFactura, porcentajeDeduccion);

        // Calculamos el IVA
        importeIVA = calculadoraIVA.calcular(importeFactura);

        // Calculamos el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }

}
