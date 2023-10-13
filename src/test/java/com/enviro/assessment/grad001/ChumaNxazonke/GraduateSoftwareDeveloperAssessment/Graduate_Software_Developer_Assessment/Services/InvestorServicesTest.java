package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Services;

import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Investor;
import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Repository.InvestorRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class InvestorServicesTest {

    private InvestorRepo repository;

    private InvestorServices service;

    private Investor investor;


    @Test
    @Order(1)
    void save()
    {
        Investor save = this.repository.save(this.investor);
        assertEquals(this.investor, save);
    }

    @Test
    @Order(2)
    void read()
    {
        Investor read = (Investor) this.repository.findAll();
        assertEquals(this.investor, read);
    }


    @Order(2)
    @Test
    void getAll() {
        System.out.println("Get All: ");
        System.out.println(service.findAll());
    }


}