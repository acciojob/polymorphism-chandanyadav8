package com.driver;
class Product{
    public double product(int x, int y) {
        return 0;
    }
    public int product(int x, int y, int z) {
        return 0;
    }
    public double product(double x, double y) {
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {
Product p=new Product();
        System.out.println(p.product(1,1));
        System.out.println(p.product(1,1));
        System.out.println(p.product(1,2,3));
    }


}