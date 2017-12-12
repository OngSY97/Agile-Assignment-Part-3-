/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilep3;

/**
 *
 * @author Mei Huey
 */
public class DeliveryMan {
    public String name,status, contact;

    public DeliveryMan(String name, String status, String contact) {
        this.name = name;
        this.status = status;
        this.contact = contact;
    }

    public DeliveryMan(String status) {
        this.status = status;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String toString() {
    return String.format("Name : %-10s \nPhone : %-20s \nStatus : %-20s \n", name, contact, status);
  }
}
