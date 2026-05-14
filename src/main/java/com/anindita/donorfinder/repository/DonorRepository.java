package com.anindita.donorfinder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anindita.donorfinder.entity.Donor;


public interface DonorRepository
        extends JpaRepository<Donor, Long> {

    List<Donor> findByBloodGroup(String bloodGroup);
}