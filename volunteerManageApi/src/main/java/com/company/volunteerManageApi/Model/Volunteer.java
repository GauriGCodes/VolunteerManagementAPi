package com.company.volunteerManageApi.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "Volunteers")
public class Volunteer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long volunteerID;
    @Column(name = "fname")
    private String firstName;

    @Column(name="lname")
    private String lastName;
    private String city;
    private String country;
    private int age;
    private String company;
    private int professional_experience;
    private String [] interest;
    private String [] languages;

    protected Volunteer(){


    }

    public Volunteer(Long volunteerID,String firstName,String lastName, String city, String country, int age, String company, int professional_experience, String[] interest, String[] languages) {
        this.volunteerID = volunteerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.country = country;
        this.age = age;
        this.company = company;
        this.professional_experience = professional_experience;
        this.interest = interest;
        this.languages = languages;
    }


    public long getVolunteerID() {
        return volunteerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getProfessional_experience() {
        return professional_experience;
    }

    public void setProfessional_experience(int professional_experience) {
        this.professional_experience = professional_experience;
    }

    public String[] getInterest() {
        return interest;
    }

    public void setInterest(String[] interest) {
        this.interest = interest;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}
