/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.repository.entities;

/**
 *
 * @author Jian
 * 
 */
public class Property {

    //TODO Exercise 1.3 Step 1 Please refer tutorial exercise.
    int ID;
    String address;
    int size;
    double price;
    public Property() {
    }

    public Property(int ID, String address, int size, double price) {
        this.ID = ID;
        this.address = address;
        this.size = size;
        this.price = price;
    }
   

    public int getID() {
        
        return ID;  
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
     @Override
    public String toString() {
        return "Property{" + "ID=" + ID + ", address=" + address + ", size=" + size + ", price=" + price + '}';
    }
}
