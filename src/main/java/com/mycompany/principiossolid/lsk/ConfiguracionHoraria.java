/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiossolid.lsk;

/**
 *
 * @author sala8
 */
    public class ConfiguracionHoraria implements RecursoPersistente {
    public void load() {
        System.out.println("Configuracion horaria cargada");
    }

    public void save() {
        System.out.println("ERROR: No se puede almacenar la configuracion horaria, es solo de lectura");
    }
}