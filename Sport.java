package com.eddyie.sports.sportsfest;


import javax.persistence.*;

@Entity

public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long   id;
    private String sportName;
    private String sportCoach;
    private String  venue;

    public Sport(long id, String sportName, String sportCoach, String venue) {
        this.id = id;
        this.sportName = sportName;
        this.sportCoach = sportCoach;
        this.venue = venue;
    }

    public Sport (){

    }

    public long getId() {
        return id;
    }

    public String getSportName() {
        return sportName;
    }

    public String getSportCoach() {
        return sportCoach;
    }

    public String getVenue() {
        return venue;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public void setSportCoach(String sportCoach) {
        this.sportCoach = sportCoach;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}
