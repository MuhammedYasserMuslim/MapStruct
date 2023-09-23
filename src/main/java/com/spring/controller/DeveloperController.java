package com.spring.controller;

import com.spring.model.Developer;
import com.spring.services.DeveloperServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/developer")
@RequiredArgsConstructor
public class DeveloperController {


    private final DeveloperServices developerServices;

    @GetMapping("/count")
    public Long count() {
        return developerServices.count();
    }


    @GetMapping("/developers")
    public List<Developer> findAll() {
        return developerServices.findAll();
    }

    @GetMapping("/developer")
    public Optional<Developer> findById(@RequestParam Long id) {
        return developerServices.findById(id);
    }

    @PostMapping("/developer")
    public Developer insert(Developer developer) {
        developerServices.insert(developer);
        return developer;
    }

    @PutMapping("/developer")
    public Developer update(Developer developer) {
        developerServices.update(developer);
        return developer;
    }

    @DeleteMapping("/developer")
    public Optional<Developer> deleteById(@RequestParam Long id) {
        developerServices.deleteById(id);
        return findById(id);

    }
}
