/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiossolid.ocp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sala8
 */
public class Figuras {
    private List<Figura> figuras = new ArrayList<>();

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void dibujarFiguras() {
        for (Figura figura : figuras) {
            figura.dibujar();
        }
    }
}
