package com.PartsPicker.PartsPicker.dao;

import com.PartsPicker.PartsPicker.domain.CreatePC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatePCRepository extends JpaRepository<CreatePC, String> {
}
