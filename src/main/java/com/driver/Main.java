package com.driver;

import com.driver.Product;
class Main {


    public static void main(String[] args) {
        
        Product p = new Product();
       
        int result1 = p.product(3, 4);
        int result2 = p.product(3, 4, 5);
        double result3 = p.product(2.5, 4.0);
       
        System.out.println("Result of product(3, 4): " + result1);
        System.out.println("Result of product(3, 4, 5): " + result2);
        System.out.println("Result of product(2.5, 4.0): " + result3);
    }
}
