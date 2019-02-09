package javaapplication2;

import java.util.Date;

public class Order {
    String number;
    Date date;
    
    public Order( String number, Date date){
        this.number = number;
        this.date = date;
    }
    public void setNumber(String number){
        this.number = number;
    }
     public void setDate(Date date){
        this.number = number;
    }
     public String getnumber(){
         return number;
    }
     public Date getdate(){
         return date;
    }
     public void confirm() {
    System.out.println("Creation of confirm method");
}
    public void close() {
    System.out.println("Creation of confirm method");
}
    
}
