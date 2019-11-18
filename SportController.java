package com.eddyie.sports.sportsfest;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sports")
public class SportController {
    private SportRepository sportRepository;

    public SportController(SportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }


    @PostMapping("/adding")
    public void addModule(@RequestBody Sport sport) {
        sportRepository.save(sport);
    }
    @GetMapping("/retrieve")
    public List<Sport> retrieveSport() {
        return sportRepository.findAll();

    }
    @GetMapping("/retrieve/{id}")
    public Optional<Sport> returnSport(@PathVariable long id){
        return sportRepository.findById(id);
    }
}