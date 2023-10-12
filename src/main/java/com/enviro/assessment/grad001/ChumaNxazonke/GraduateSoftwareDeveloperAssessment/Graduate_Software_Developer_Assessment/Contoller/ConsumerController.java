package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Contoller;


import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Consumer;
import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Repository.ConsumerRepo;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Graduate_Software_Developer_Assessment/Consumer")
public class ConsumerController {


    private  ConsumerRepo consumerRepo;

    @Autowired

    public ConsumerController(ConsumerRepo consumerRepo1)
    {
        this.consumerRepo = consumerRepo1;
    }



    @GetMapping
    public List<Consumer> findAllConsumers() {
//Implement
        return (List<Consumer>) consumerRepo.findAll();

    }


    @PostMapping

    public Consumer save(Consumer consumer)
    {
        return this.consumerRepo.save(consumer);
    }


}

