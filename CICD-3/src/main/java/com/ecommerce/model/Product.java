package com.ecommerce.model;

public class Product {
    private String name;
    private String desc;
    private int price;
    private String image;

    public Product() {}

    public Product(String name, String desc, int price, String image) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.image = image;
    }

    public String getName() { return name; }
    public String getDesc() { return desc; }
    public int getPrice() { return price; }
    public String getImage() { return image; }

    public void setName(String name) { this.name = name; }
    public void setDesc(String desc) { this.desc = desc; }
    public void setPrice(int price) { this.price = price; }
    public void setImage(String image) { this.image = image; }
}
