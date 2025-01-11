package com.driver;

public class Main {

    class Product{

        public void product(int x,int y){
            System.out.println(x*y);
        }

        public void product(int x,int y,int z){
            System.out.println(x*y*z);
        }

        public void product(double x,double y){
            System.out.println(x*y);
        }



    }
    public static void main(String[] args){
        Product p = new Main().new Product();
        p.product(2,3);
        p.product(2,3,4);
        p.product(2.0,3.0);
    }

}