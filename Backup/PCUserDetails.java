package com.PartsPicker.PartsPicker.services;

import com.PartsPicker.PartsPicker.dao.UserRepository;
import com.PartsPicker.PartsPicker.domain.PCUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PCUserDetails implements UserDetailsService {

    private UserRepository userRepository;

    //construct dependency.
    @Autowired
    public PCUserDetails( UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //if no user is found an exception occurs
        PCUser pcUser = userRepository.findById(s).orElseThrow( ()-> new UsernameNotFoundException("No user found"));
        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(pcUser.getAuthority()));
        return new User
            (pcUser.getEmail(),pcUser.getPassword(),pcUser.getEnabled(),
            true,true,true,authorities);
    }
}
