package com.PartsPicker.PartsPicker.services;

import com.PartsPicker.PartsPicker.dao.CreatePCRepository;
import com.PartsPicker.PartsPicker.domain.CreatePC;
import com.PartsPicker.PartsPicker.domain.PCUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CreatePCServiceImpl implements CreatePCService {

    private PCUser currentPCUser;
    private CreatePCRepository createPCRepository;

    @Autowired
    public CreatePCServiceImpl(CreatePCRepository createPCRepository){
        this.createPCRepository = createPCRepository;
        /*createPCRepository.save(new CreatePC("I5 7600K", "GeForce GTX 1660TI","16GB",
                "GameMax Silent Case","Be Quiet 550W","SSD + HDD"));
        createPCRepository.save(new CreatePC("I5 7600K", "GeForce GTX 1660TI","16GB",
                "GameMax Silent Case","Be Quiet 550W","SSD + HDD"));
        createPCRepository.save(new CreatePC("I5 7600K", "GeForce GTX 1660TI","16GB",
                "GameMax Silent Case","Be Quiet 550W","SSD + HDD"));
        createPCRepository.save(new CreatePC("I5 7600K", "GeForce GTX 1660TI","16GB",
                "GameMax Silent Case","Be Quiet 550W","SSD + HDD"));*/
    }


    @Override
    public List<CreatePC> getPCs() {
        return createPCRepository.findAll();
    }

    @Override
    public int getNumberOfPCs(){
        return (int) createPCRepository.count();
    }

    @Override
    public void addCreatedPC(CreatePC createPC) {
        createPCRepository.save(createPC);
    }
}

