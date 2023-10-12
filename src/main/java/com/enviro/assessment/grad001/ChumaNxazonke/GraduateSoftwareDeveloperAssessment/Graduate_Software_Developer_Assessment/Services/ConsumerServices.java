package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Services;

import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Consumer;
import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Repository.ConsumerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class ConsumerServices implements ConsumerService {

    private  ConsumerRepo consumerRepo;
    @Autowired

    public ConsumerServices(ConsumerRepo consumerRepo1)
    {
        this.consumerRepo = consumerRepo1;
    }



    @GetMapping
    public List<Consumer> findAll() {
//Implement
        return (List<Consumer>) consumerRepo.findAll();

    }


    @PostMapping

    public Consumer save(Consumer consumer)
    {
        return this.consumerRepo.save(consumer);
    }

    @Override
    public Consumer read(String s) {
        return null;
    }

}
