package com.company;

public class Cloth extends Product {

    private String size;
    private String material;

    public Cloth(int id, String productName, double price, int weight, String color, int productCount, String size, String material)
    {
        super(int id, String productName, double price, int weight, String color, int productCount);
        this.material=material;
        this.size=size;
    }

    public String getSize()
    {
        return size;
    }

    public String getMaterial() {
        return material;
    }
}
