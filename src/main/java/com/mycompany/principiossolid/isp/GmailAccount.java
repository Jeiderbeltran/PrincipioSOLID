/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiossolid.isp;

/**
 *
 * @author camilo
 */
public class GmailAccount implements ContactInformation {

    String name, emailAddress;

    public GmailAccount(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String getTelephone() {
        return ""; // No se utiliza el número de teléfono en GmailAccount, por lo que retornamos una cadena vacía
    }
}
