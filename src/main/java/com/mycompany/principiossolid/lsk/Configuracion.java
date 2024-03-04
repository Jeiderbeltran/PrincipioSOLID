/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiossolid.lsk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author sala8
 */
public class Configuracion {
    
    private List<RecursoPersistente> conf = new ArrayList<>();

    public void cargarConfiguracion() {
        conf.add(new ConfiguracionSistema());
        conf.add(new ConfiguracionUsuario());
        conf.add(new ConfiguracionHoraria());

        for (RecursoPersistente recurso : conf) {
            recurso.load();
        }
    }

    public void salvarConfiguracion() {
        for (RecursoPersistente recurso : conf) {
            recurso.save();
        }
    }
}