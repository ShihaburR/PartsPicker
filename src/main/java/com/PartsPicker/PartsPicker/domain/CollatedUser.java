package com.PartsPicker.PartsPicker.domain;

import java.util.List;

public class CollatedUser {

    private PCUser PCUser;
    private List<CreatePC> createdPCs;

    public PCUser getPCUser() {
        return PCUser;
    }

    public void setPCUser(PCUser PCUser) {
        this.PCUser = PCUser;
    }

    public List<CreatePC> getCreatedPCs() {
        return createdPCs;
    }

    public void setCreatedPCs(List<CreatePC> createdPCs) {
        this.createdPCs = createdPCs;
    }
}
