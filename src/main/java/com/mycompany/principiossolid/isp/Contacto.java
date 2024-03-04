/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiossolid.isp;

/**
 *
 * @author camilo
 */
public class Contacto implements ContactInformation{

    String name, address, emailAddress, telephone;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setEmailAddress(String ea) {
        emailAddress = ea;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setTelephone(String t) {
        telephone = t;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }

}
