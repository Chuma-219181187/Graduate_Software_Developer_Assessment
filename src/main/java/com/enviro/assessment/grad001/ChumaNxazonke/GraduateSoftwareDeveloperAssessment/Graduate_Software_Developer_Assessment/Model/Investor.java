package com.enviro.assessment.grad001.ChumaNxazonke.GraduateSoftwareDeveloperAssessment.Graduate_Software_Developer_Assessment.Model;

import lombok.RequiredArgsConstructor;

import javax.persistence.*;

/*
@author: Chuma Nxazonke

 */
@Entity
@RequiredArgsConstructor
@Table(name = "Consumer")
public class Investor {

    //Declaring all the variable for this class
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String name;
    private int age;
private String gender;

    private String surname;
    private int contactNo;
    private String address;


    public Investor(String name, int age, String surname, int contactNo, String address) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.contactNo = contactNo;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender (String gender1){
        this.gender = gender1;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Investor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", surname='" + surname + '\'' +
                ", contactNo=" + contactNo +
                ", address='" + address + '\'' +
                '}';
    }
}
