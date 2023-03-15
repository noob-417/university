package com.university.reporsitroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.entity.Address;

@Repository
public interface AdressRepository extends JpaRepository<Address, Long> {

}
