package com.PartsPicker.PartsPicker.services;


import com.PartsPicker.PartsPicker.dao.CreatePCRepository;
import com.PartsPicker.PartsPicker.dao.UserRepository;
import com.PartsPicker.PartsPicker.domain.CollatedUser;
import com.PartsPicker.PartsPicker.domain.CreatePC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfileServiceImpl implements ProfileService {

    private UserRepository userRepository;
    private CreatePCRepository createPCRepository;

    @Autowired
    public ProfileServiceImpl(UserRepository userRepository ,CreatePCRepository createPCRepository) {
        this.userRepository = userRepository;
        this.createPCRepository = createPCRepository;
    }

    @Override
    public CollatedUser getProfile(String email){
    CollatedUser user = new CollatedUser();
    user.setPCUser(userRepository.findById(email).orElseThrow(()-> new UsernameNotFoundException("No matching user found.")));
        List<CreatePC> createdPCs = createPCRepository.findAll().stream()
                .filter(createPC -> createPC.getEmail().equals(email)).collect(Collectors.toList());
    user.setCreatedPCs(createdPCs);
    return user;
    }
}
