package com.example.servingwebcontent;

public class User {

    private String Name;
    private String LastName;
    private double Age;
    private String Email;
    private String PhoneNumber;
    private String NumberOfPets;


    public User(String name, String lastName, double age, String email, String phoneNumber, String numberOfPets) {
        Name = name;
        LastName = lastName;
        Age = age;
        Email = email;
        PhoneNumber = phoneNumber;
        NumberOfPets = numberOfPets;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Age=" + Age +
                ", Email='" + Email + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", NumberOfPets='" + NumberOfPets + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public double getAge() {
        return Age;
    }

    public void setAge(double age) {
        Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getNumberOfPets() {
        return NumberOfPets;
    }

    public void setNumberOfPets(String numberOfPets) {
        NumberOfPets = numberOfPets;
    }
}
