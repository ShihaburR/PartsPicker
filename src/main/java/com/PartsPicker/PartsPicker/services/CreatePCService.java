package com.PartsPicker.PartsPicker.services;

import com.PartsPicker.PartsPicker.domain.CreatePC;

import java.util.List;


public interface CreatePCService {
    List<CreatePC> getPCs();
    void addCreatedPC(CreatePC createPC);
    int getNumberOfPCs();

}

