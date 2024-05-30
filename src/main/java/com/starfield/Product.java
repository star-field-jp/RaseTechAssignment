package com.starfield;

import java.math.BigDecimal;

public class Product {

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    private String productId;
    private String productName;
    private String productType;
    private BigDecimal price;
    private long qty;

    public Product( String productId, String productName, String productType, BigDecimal price,long qty) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.price = price;
        this.qty = qty;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getQty() {
        return qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }


}
