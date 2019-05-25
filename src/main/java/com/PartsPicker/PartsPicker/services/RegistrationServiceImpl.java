package com.PartsPicker.PartsPicker.services;

import com.PartsPicker.PartsPicker.dao.UserRepository;
import com.PartsPicker.PartsPicker.domain.PCUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegistrationServiceImpl implements RegistrationService {

    private PCUser currentPCUser;
    private UserRepository userRepository;

    //connects to database with service
    @Autowired
    public RegistrationServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
        userRepository.save(new PCUser("Jon", "Snow", "jonsnow@company.com", "IronThrone"));

    }

    //lists all users currently onto a repository
    @Override
    public List<PCUser> getUsers() {
        return userRepository.findAll();
    }

    //adds a PCUser onto a repository
    @Override
    public void addUser(PCUser PCUser) {
        currentPCUser = PCUser;
        userRepository.save(PCUser);
    }

    //gets the currentPCUser
    @Override
    public PCUser getCurrentPCUser() {
        return currentPCUser;
    }

    //gets the number of Users in the linked-list
    @Override
    public int getNumberOfUsers() {
        return (int) userRepository.count();
    }
}
