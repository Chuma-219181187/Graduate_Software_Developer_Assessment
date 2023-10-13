package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Services;

import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Investor;
import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Repository.InvestorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class InvestorServices implements InvestorService {

    private InvestorRepo investorRepo;
    @Autowired

    public InvestorServices(InvestorRepo investorRepo1)
    {
        this.investorRepo = investorRepo1;
    }



    @GetMapping
    public List<Investor> findAll() {
//Implement
        return (List<Investor>) investorRepo.findAll();

    }


    @PostMapping

    public Investor save(Investor investor)
    {
        return this.investorRepo.save(investor);
    }

    @Override
    public Investor read(String s) {
        return null;
    }

}
