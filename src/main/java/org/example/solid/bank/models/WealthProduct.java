package org.example.solid.bank.models;

public class WealthProduct {
    private String productId;
    private String productName;

    public WealthProduct(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}
