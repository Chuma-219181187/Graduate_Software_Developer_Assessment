package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model;

import javax.persistence.*;

/*
@author: Chuma Nxazonke
Date: 11 October 2023
 */
@Entity

@Table(name = "Consumer")
public class Consumer {

    //Declaring all the variable for this class
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String personal;
    private String address;
    private String contact;


    public String getPersonal() {
        return personal;
    }

    public String getAddress(){
        return address;
    }

    public String getContact(){
        return contact;
    }

    public void setPersonal (String personal1){
        this.personal = personal1;
    }

    public void setAddress (String address1){
        this.address = address1;
    }

    public void setContact (String contact1){
        this.contact = contact1;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                ", personal='" + personal + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

}
