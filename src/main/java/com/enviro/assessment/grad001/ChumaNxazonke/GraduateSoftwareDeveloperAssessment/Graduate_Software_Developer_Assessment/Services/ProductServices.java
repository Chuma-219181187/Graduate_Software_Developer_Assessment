package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Services;

import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Product;
import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//
import java.util.List;

@Service
public class ProductServices implements ProductService {


    private ProductRepo productRepo;
    @Autowired

    public ProductServices(ProductRepo productRepo1)
    {
        this.productRepo = productRepo1;
    }



    @Override
    public Product read(String productId) {
        return this.productRepo.findById(productId).orElse(null);
    }


    public Product save(Product product)
    {
        return this.productRepo.save(product);
    }

    @Override
    public List<Product> findAllByInvestorId(String investorId) {
        return this.productRepo.findAllByInvestorId(investorId);
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepo.findAll();
    }
}
