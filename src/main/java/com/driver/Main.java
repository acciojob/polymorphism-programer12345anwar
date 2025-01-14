package com.driver;

public class Main {

    public static class Product{
        public int product(int x,int y){

            return x*y;
        }
        public int product(int x,int y,int z){

            return x*y*z;
        }
        public double product(double x,double y){

            return x*y;
        }
    }
    public static void main(String[] args){
        Product p = new Product();
        int result1 = p.product(3, 5);
        int result2 = p.product(3, 2, 4);
        double result3 = p.product(3.2, 3.5);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

}