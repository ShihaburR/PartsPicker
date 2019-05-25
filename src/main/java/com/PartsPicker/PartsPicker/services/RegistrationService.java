package com.PartsPicker.PartsPicker.services;

import com.PartsPicker.PartsPicker.domain.PCUser;

import java.util.List;

public interface RegistrationService {
    List<PCUser> getUsers();
    void addUser(PCUser PCUser);
    PCUser getCurrentPCUser();
    int getNumberOfUsers();
}
