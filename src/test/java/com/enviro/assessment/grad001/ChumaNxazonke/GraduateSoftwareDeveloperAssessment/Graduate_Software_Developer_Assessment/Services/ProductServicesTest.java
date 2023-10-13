package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Services;

import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Investor;
import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Product;
import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Repository.InvestorRepo;
import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Repository.ProductRepo;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServicesTest {


    private ProductRepo repository;

    private ProductService service;

    private Product product;


    @Test
    @Order(1)
    void save()
    {
        Product save = this.repository.save(this.product);
        assertEquals(this.product, save);
    }

    @Test
    @Order(2)
    void read()
    {
        Product read = (Product) this.repository.findAllByInvestorId(product.getProductID());
        assertEquals(this.product, read);
    }


    @Order(2)
    @Test
    void getAll() {
        System.out.println("Get All: ");
        System.out.println(service.findAll());
    }





}