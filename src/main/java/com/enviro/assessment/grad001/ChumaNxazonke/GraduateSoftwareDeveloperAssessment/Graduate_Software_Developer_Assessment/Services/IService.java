package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Services;
//Interface
public interface IService <T, ID> {
    public T save(T t);
    public T read(ID id);
}
