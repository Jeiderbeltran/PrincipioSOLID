/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiossolid.lsk;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author sala8
 */
    public class Configuracion {
Vector<RecursoPersistente> conf=new Vector<RecursoPersistente>();
 public void cargarConfiguracion(){
 conf.add(new ConfiguracionSistema());
 conf.add(new ConfiguracionUsuario());
 conf.add(new ConfiguracionHoraria());

 for (Iterator<RecursoPersistente> i = conf.iterator(); i.hasNext(); )
 i.next().load();
 }
 public void salvarConfiguracion(){
 for (Iterator<RecursoPersistente> i = conf.iterator(); i.hasNext(); )
 i.next().save();
 }
}

