package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Contoller;


import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Product;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Services.ProductService;

import org.springframework.http.ResponseEntity;


@RestController
@Slf4j
@RequestMapping("/Graduate_Software_Developer_Assessment/Product")


public class ProductController {

    private ProductService productService;

    @Autowired
    ProductController(ProductService productService1)
    {
        this.productService = productService1;
    }

    @PostMapping("save/Product")
    public ResponseEntity<Product> save(@Validated @RequestBody Product product)
    {
        log.info("Save Request: {}", product);
        Product save = this.productService.save(product);
        return ResponseEntity.ok(save);
    }

    @GetMapping("getProduct/{id}")
    public ResponseEntity<Product> read(@PathVariable String id)
    {
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


}

