package com.company;

public class Boots extends Product{
   private int size;
   private boolean isNaturalSkin;

    public Boots (int id, String productName, double price, int weight, String color, int productCount, int size, boolean isNaturalSkin)
    {
        super(int id, String productName, double price, int weight, String color, int productCount);
        this.size=size;
        this.isNaturalSkin=isNaturalSkin;
    }

    public int getSize()
    {
        return size;
    }
    public boolean getisNaturalSkin()
    {
        return isNaturalSkin;
    }
    public String toString() {
        return super.toString() + "Boots{" +
                "size='" + size + '\'' +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }
}
