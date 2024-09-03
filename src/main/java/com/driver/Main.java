package com.driver;

 class Main {
     public int product(int x, int y){
         return x*y;

     }
     public int product(int x, int y, int z) {
         return x*y*z;

     }
     public double product(double x, double y) {
         return x*y;

     }

     public static void main(String[] args) {
         int x = 1;
         int y = 2;
         int z = 3;

         Main p = new Main();
         System.out.println(p.product(x,y));
         System.out.println(p.product(x,y,z));
         System.out.println(p.product(x,y));
     }



 }
