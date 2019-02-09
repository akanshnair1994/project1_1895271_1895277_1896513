/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Date;

/**
 *
 * @author 1896513
 */
public class NormalOrder extends Order {
    String number;
    Date date;

    public NormalOrder(String customerName, Date date, String specialNumber, Date specialDate) {
        super(specialNumber, specialDate);
        this.number = customerName;
        this.date = date;
    }

    public void setdate(Date date) {
        this.date = date;
    }

    public void setNumber(Date date) {
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public Date getdate() {
        return date;
    }

    public void confirm() {
        System.out.println("Creation of confirm method");
    }

    public void close() {
        System.out.println("Creation of close method");
    }

    public void dispatch() {
        System.out.println("Creation of dispatch method");
    }

    public void recieve() {
        System.out.println("Creation of recieve method");
    }
}
