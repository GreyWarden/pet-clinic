package com.greydevelopments.petclinic.person.owner.domain.models;

import com.greydevelopments.petclinic.pet.pet.domain.models.Pet;
import com.greydevelopments.petclinic.person.shared.domain.models.Person;

import java.util.Set;

public final class Owner extends Person {
    private String address;
    private String city;
    private String phone;
    private Set<Pet> pets;

    public Owner() {
    }

    public Owner(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Owner(String firstName, String lastName, String address, String city, String phone) {
        super(firstName, lastName);
        this.address = address;
        this.city = city;
        this.phone = phone;
    }

    public Owner(String firstName, String lastName, String address, String city, String phone, Set<Pet> pets) {
        super(firstName, lastName);
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.pets = pets;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
