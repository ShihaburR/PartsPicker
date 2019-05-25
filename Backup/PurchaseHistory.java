package com.PartsPicker.PartsPicker.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

public class PurchaseHistory {

    private String email;
    private LocalDateTime time;
    private List<CreatePC> createPCs;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public List<CreatePC> getCreatePCs() {
        return createPCs;
    }

    public void setCreatePCs(List<CreatePC> createPCs) {
        this.createPCs = createPCs;
    }
}
