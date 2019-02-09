package javaapplication2;

public class Customer {
    String name;
    String location;
    
    private void sendOrder() {
        System.out.println("This method calls the contents of sendOrder() method");
    }
    
    private void receiveOrder() {
        System.out.println("This method calls the contents of receiveOrder() method");
    }
}
