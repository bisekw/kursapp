package com.company;

public class Product {
    private int id;
    private String productName;
    private double price;
    private int weight;
    private String color;
    private int productCount;


    public Product (int id, String productName, double price, int weight, String color, int productCount)
    {
        this.id=id;
        this.productName=productName;
        this.price=price;
        this.weight=weight;
        this.color=color;
        this.productCount=productCount
    }

    public int getid()
    {
      return id;
    }
    public String getProductName()
    {
        return productName;
    }
    public double getPrice;
    {
        return price;
    }
    public int getWeight()
    {
        return weight;
    }
    public String getColor()
    {
        return color;
    }
    public int getProductCount()
    {
        return productCount
    }

    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setProductCount(int productCount)
    {
      this.productCount=productCount;
    }

    public String toString()
    {
        return "Product{"+ "id="+id+", productName="+productName+'\''
                +", price="+price+", weight="+weight+", color="+color+'\''+", productCount"+productCount+'}';
    }

}
