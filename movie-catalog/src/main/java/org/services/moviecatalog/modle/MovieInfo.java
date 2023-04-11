package org.services.moviecatalog.modle;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MovieInfo {
    private int id;
    private String name;
    private Date dateOfRelease=new Date();
    private String genere="Adventure";
    private List<Actor> actors = Arrays.asList(new Actor(1,"Shahrukh Khan"));

    public MovieInfo() {
    }

    public MovieInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public MovieInfo(int id, String name, Date dateOfRelease, String genere, List<Actor> actors) {
        this.id = id;
        this.name = name;
        this.dateOfRelease = dateOfRelease;
        this.genere = genere;
        this.actors = actors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(Date dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
