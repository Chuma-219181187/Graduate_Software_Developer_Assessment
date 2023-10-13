package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Contoller;


import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Product;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Services.ProductService;
import java.util.List;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;


@RestController
@Slf4j
@RequestMapping("/Graduate_Software_Developer_Assessment/Product")


public class ProductController {

    private double withdrawalAmount, theRequestedAmount = 0;
    private double theAmountRequest = 0;
    private String yourErrorMessage, validationError;

    private ProductService productService;

    @Autowired
    ProductController(ProductService productService1)
    {
        this.productService = productService1;
    }

    @PostMapping("save/Product")
    public ResponseEntity<Product> save(@Valid @RequestBody Product product)
    {
        log.info("Save Request: {}", product);
        Product save = this.productService.save(product);
        return ResponseEntity.ok(save);
    }

    @GetMapping("getProduct/{id}")
    public ResponseEntity<Product> read(@PathVariable String id)
    {

        // Move to a separate method called withdraw()
        log.info("Read Request: {}", id);
        try
        {
            Product read = this.productService.read(id);
            return ResponseEntity.ok(read);
        }
        catch (IllegalArgumentException e)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("withdrawal/Product")

    public double withdrawal(@Valid @RequestBody String investorID)
    {
        //Move the code below to a seperate method
        List<Product> investorProducts = this.productService.findAllByInvestorId(investorID);
        for (var product: investorProducts)
        {
            if(product.getProductType().equalsIgnoreCase("RETIREMENT"))
            {
                if(withdrawalAmount > product.getCurrentBalance())
                {
                     System.out.println("You have successfully with the money" + withdrawalAmount);
                }
                theAmountRequest = product.getCurrentBalance() - theRequestedAmount;

                return this.theAmountRequest;
            }
            else{
                System.out.println("Insufficient balance, try again later");
            }

        }
        return 0;
    }


}

