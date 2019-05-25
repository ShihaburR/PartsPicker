package com.PartsPicker.PartsPicker.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class CreatePC {
    @Id
    private String email;
    private String CPU;
    private String GPU;
    private String RAM;
    private String Case;
    private String PSU;
    private String Storage;

    public CreatePC(String CPU, String GPU, String RAM, String Case, String PSU, String Storage){
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.Case = Case;
        this.PSU = PSU;
        this.Storage = Storage;
    }

    public CreatePC(){}


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCase() {
        return Case;
    }

    public void setCase(String aCase) {
        Case = aCase;
    }

    public String getPSU() {
        return PSU;
    }

    public void setPSU(String PSU) {
        this.PSU = PSU;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }
}
