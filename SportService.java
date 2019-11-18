package com.eddyie.sports.sportsfest;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class SportService {
    /**
     *
     */
    @Autowired
    private SportRepository sportRepository;

    public List<Sport> getAllSports(){
       List<Sport>  sports = new ArrayList<>();
       sportRepository.findAll()
               .forEach(sports :: add);
       return sports;
    }
    public void addSport(Sport sport){
         sportRepository.save(sport);

    }
    public void updateSport(Long id , Sport sport){
      sportRepository.save(sport);

    }
    public void deleteSport(Long id){
         sportRepository.delete(id);

    }


}
