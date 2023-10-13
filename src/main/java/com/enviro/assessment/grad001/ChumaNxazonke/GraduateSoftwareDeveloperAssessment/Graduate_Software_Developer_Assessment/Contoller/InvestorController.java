package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Contoller;


import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Investor;
import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Repository.InvestorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Graduate_Software_Developer_Assessment/Consumer")
public class InvestorController {


    private InvestorRepo investorRepo;

    @Autowired

    public InvestorController(InvestorRepo consumerRepo1)
    {
        this.investorRepo = consumerRepo1;
    }



    @GetMapping
    public List<Investor> findAllConsumers() {
//Implement
        return (List<Investor>) investorRepo.findAll();

    }


    @PostMapping

    public Investor save(Investor investor)
    {
        return this.investorRepo.save(investor);
    }


}

