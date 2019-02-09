
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1896513
 */
public class SpecialOrder {

    String number;
    Date date;

    public SpecialOrder(String customerName, Date date) {
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
}
