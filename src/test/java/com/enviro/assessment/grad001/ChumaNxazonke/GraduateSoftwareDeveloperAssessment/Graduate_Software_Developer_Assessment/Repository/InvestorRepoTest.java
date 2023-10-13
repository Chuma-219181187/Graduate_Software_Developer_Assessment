package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Repository;

import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Investor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvestorRepoTest {


    private InvestorRepo repository;
    private Investor investor;


    @Test
    @Order(1)
    void findAll() {
        List<Investor> investorList = (List<Investor>) this.repository.findAll();
        assertSame(1, investorList.size());
    }



}