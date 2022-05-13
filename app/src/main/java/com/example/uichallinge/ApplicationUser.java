package com.example.uichallinge;

public class ApplicationUser {
    int Id;
    String Name;
    String Country;
    String Email;
    String Website;
    String Description;
    String Gender;

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getDescription() {
        return Description;
    }

    public ApplicationUser(int id, String name, String country, String email, String website, String description) {
        Id = id;
        Name = name;
        Country = country;
        Email = email;
        Website = website;
        Description = description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ApplicationUser(int id, String name, String country, String email, String website) {
        Id = id;
        Name = name;
        Country = country;
        Email = email;
        Website = website;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public ApplicationUser(int id, String name, String email, String[] country, String email1) {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public ApplicationUser(int id, String name, String country, String email) {
        Id = id;
        Name = name;
        Country = country;
        Email = email;
    }
}
