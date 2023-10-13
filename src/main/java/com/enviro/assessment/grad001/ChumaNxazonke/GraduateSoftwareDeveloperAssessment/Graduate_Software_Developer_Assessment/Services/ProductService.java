package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Services;

import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Product;
//Interface
import java.util.List;

public interface ProductService extends IService <Product, String> {
    List<Product> findAllByInvestorId(String investorId);
    List<Product> findAll();
}
