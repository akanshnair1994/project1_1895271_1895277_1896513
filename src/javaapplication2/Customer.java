package javaapplication2;

public class Customer {
    String name;
    String location;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getLocation() {
        return location;
    }
    
    private void sendOrder() {
        System.out.println("This method calls the contents of sendOrder() method");
    }
    
    private void receiveOrder() {
        System.out.println("This method calls the contents of receiveOrder() method");
    }
}
