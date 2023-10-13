package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Repository;


import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Investor;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Interface
@Repository
public interface InvestorRepo extends CrudRepository<Investor, String> {

}