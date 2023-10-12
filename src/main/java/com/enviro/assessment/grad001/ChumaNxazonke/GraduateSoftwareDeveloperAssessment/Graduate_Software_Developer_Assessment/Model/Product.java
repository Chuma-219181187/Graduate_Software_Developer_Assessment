package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model;

import javax.persistence.*;

@Entity
@Table (name = "Product")
public class Product {

    //Declaring all the variable

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String productID;
    private String productType;
    private String productName;
    private double currentBalance;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productType='" + productType + '\'' +
                ", productName='" + productName + '\'' +
                ", currentBalance=" + currentBalance +
                '}';
    }


}
