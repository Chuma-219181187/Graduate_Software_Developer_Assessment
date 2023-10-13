package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Contoller;

import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Investor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvestorControllerTest {

    private InvestorController repository;
    private Investor investor;


    @Test
    @Order(1)
    void save(){
        Investor  save = this.repository.save(this.investor);
        assertEquals(this.investor,save);
    }



    @Test
    @Order(2)
    void findAll() {
        List<Investor> investorList = this.repository.findAllConsumers();
        assertSame(1, investorList.size());
    }


}