package entities;

public class Product {
    private String name;
    private double price;
    private int quantitity;

    public Product() {
    }

    public Product(String name, double price, int quantitity) {
        this.name = name;
        this.price = price;
        this.quantitity = quantitity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantitity() {
        return quantitity;
    }


    public double totalValueInStock(){

        return price * quantitity;
    }

    public void addProducts(int quantitity){
        this.quantitity += quantitity;
    }

    public void removeProducts(int quantitity){
        this.quantitity -= quantitity;
    }

    public String toString(){
        return "Product data: "+ name +
                ", $ "+String.format("%.2f", price)+" ,  "+quantitity+" units, Total $ "+String.format("%.2f", totalValueInStock());
    }

}
