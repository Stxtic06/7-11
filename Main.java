import java.util.ArrayList;%%writefile Product.java
public class Product {

    private String productName;
    private double price;
    private String category;
    private int quantityInstock;

    public Product(String productName, double price, String category, int quantityInstock){
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.quantityInstock = quantityInstock;
    }

    // getters
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantityInstock() {
        return quantityInstock;
    }

    //Setters
    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setQuantityInstock(int quantityInstock){
        this.quantityInstock = quantityInstock;
    }

    //Display product details
    public void displayProductDetails(){
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
        System.out.println("Quantity In Stock: " + quantityInstock);
    }

    //Check if prducts are in stock
    public boolean checkStock(){
        return quantityInstock >0;
    }

    //Update stock after purchase are made
    public void updateStock(int quantity){
        if(quantity > 0 && quantity <= quantityInstock){
            quantityInstock -= quantity;
        } else {
            System.out.println("Not enough stock available.");
        }
    }

}

public class LoginInfoemation{
    private String userName;
    private String passsword;
    private String debitCardNumber;
    private String debitCardZipCode;

    public LoginInformation(String userName, String password, String debitCardNumber, String debitCardZipCode){
        this.userName = userName;
        this.passsword = password;
        this.debitCardNumber = debitCardNumber;
        this.debitCardZipCode;
    }

    public boolean validateLogin(String enteredUserName, String enteredPassword){
        return userName.equals(enteredUserName) && password.equals(enteredPassword);
    }

    public void retrieveUserInformation(){
        System.out.println("User Name: " + userName);
        System.out.println("Debit Card Number: " + debitCardNumber);
        System.out.println("Debit Card Zip Code: " + debitCardZipCode);
    }
}

import java.util.ArrayList;

public class Cart {
    private Arraylist<Product> products;

    public Cart(){
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        if(product.checkStock()){
            product.add(product);
            System.out.println(product.getProductName() + " added to cart");
        } else {
            System.out.println(product.getProductName() + " is out of stock");
        }
    }

    public void removeProduct(Product product){
        if(product.remove(product)){
            System.out.println(product.getProductName() + " removed from cart.");
        } else{
            System.out.println("Product not found in cart.");
        }
    }

    public void clearCart(){
        product.clear();
        System.out.println("Cart has been cleared");
    }

    public int getTotalProductCount(){
        return products.size();
    }
}