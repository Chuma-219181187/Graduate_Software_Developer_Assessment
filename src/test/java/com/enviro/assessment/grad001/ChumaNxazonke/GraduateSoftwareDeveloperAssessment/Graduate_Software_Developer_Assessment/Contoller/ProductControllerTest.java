package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Contoller;

import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Product;
import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Repository.ProductRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductControllerTest {

    private ProductRepo repository;
    private Product product;




    @Test
    @Order(1)
    void save(){
        Product save = this.repository.save(this.product);
        assertEquals(this.product,save);
    }

    @Test
    @Order(2)
    void read() {
        Optional<Product> read = this.repository.findById(this.product.getProductID());
    }



}