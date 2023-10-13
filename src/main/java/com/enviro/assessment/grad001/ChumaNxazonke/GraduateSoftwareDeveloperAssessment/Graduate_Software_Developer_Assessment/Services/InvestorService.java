package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Services;

import com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model.Investor;

import java.util.List;

public interface InvestorService extends IService <Investor, String> {

    List<Investor> findAll();
}
