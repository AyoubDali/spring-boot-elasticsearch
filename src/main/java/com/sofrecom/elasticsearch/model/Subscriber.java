package com.sofrecom.elasticsearch.model;


import com.fasterxml.jackson.annotation.*;
import com.github.javafaker.PhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;



@AllArgsConstructor
@NoArgsConstructor
public class Subscriber implements Serializable {


    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    public int id;

    private String es_id; // es id
    private String name;
    private String phoneNumber;
    private String phoneNumber2;
    private String phoneNumber3;
    private String email;
    private String websiteUrl;
    private Date created_at;
    private Date updated_at;
    private LegalInformation legalInformation;
    private ProfessionType professionType;
    private Operator operator;
    private ArrayList<Address> addressSet;
    private ArrayList<OpeningTime> openingTimeSet;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getPhoneNumber3() {
        return phoneNumber3;
    }

    public void setPhoneNumber3(String phoneNumber3) {
        this.phoneNumber3 = phoneNumber3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public LegalInformation getLegalInformation() {
        return legalInformation;
    }

    public void setLegalInformation(LegalInformation legalInformation) {
        this.legalInformation = legalInformation;
    }

    public ProfessionType getProfessionType() {
        return professionType;
    }

    public void setProfessionType(ProfessionType professionType) {
        this.professionType = professionType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ArrayList<Address> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(ArrayList<Address> addressSet) {
        this.addressSet = addressSet;
    }

    public ArrayList<OpeningTime> getOpeningTimeSet() {
        return openingTimeSet;
    }

    public void setOpeningTimeSet(ArrayList<OpeningTime> openingTimeSet) {
        this.openingTimeSet = openingTimeSet;
    }

    public String getEs_id() {
        return es_id;
    }

    public void setEs_id(String es_id) {
        this.es_id = es_id;
    }
}
