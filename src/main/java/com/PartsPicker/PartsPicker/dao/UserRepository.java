package com.PartsPicker.PartsPicker.dao;

import com.PartsPicker.PartsPicker.domain.PCUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<PCUser, String> {

}
