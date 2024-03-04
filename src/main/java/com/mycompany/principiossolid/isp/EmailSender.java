/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiossolid.isp;

/**
 *
 * @author camilo
 */
public class EmailSender {

    public static void sendEmail(ContactInformation c, String message) {  
      String emailAddress = c.getEmailAddress();
      System.out.println("Enviando correo electrónico a: " + emailAddress);
    //Envía un mensaje la direccion de correo del Contacto c.  

    }
}
