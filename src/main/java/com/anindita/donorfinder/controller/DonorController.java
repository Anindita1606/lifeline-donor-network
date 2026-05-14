package com.anindita.donorfinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.anindita.donorfinder.entity.Donor;
import com.anindita.donorfinder.repository.DonorRepository;


@RestController
@RequestMapping("/donors")
public class DonorController {

    @Autowired
    private DonorRepository donorRepo;

    @PostMapping
    public Donor addDonor(@RequestBody Donor donor) {

        return donorRepo.save(donor);
    }

    @GetMapping
    public List<Donor> getAllDonors() {

        return donorRepo.findAll();
    }

    @GetMapping("/{bloodGroup}")
    public List<Donor> searchByBloodGroup(
            @PathVariable String bloodGroup) {

        return donorRepo.findByBloodGroup(
                bloodGroup
        );
    }
}
