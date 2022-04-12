package br.tdd.udemy.entities;

import java.util.Date;

public class Location {
    private User user;
    private Movie movie;
    private Date dateLocation;
    private Date dateLocationReturn;
    private Double value;

    public Location(User user, Movie movie, Date dateLocation, Date dateLocationReturn, Double value) {
        this.user = user;
        this.movie = movie;
        this.dateLocation = dateLocation;
        this.dateLocationReturn = dateLocationReturn;
        this.value = value;
    }

    public Location() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getDateLocation() {
        return dateLocation;
    }

    public void setDateLocation(Date dateLocation) {
        this.dateLocation = dateLocation;
    }

    public Date getDateLocationReturn() {
        return dateLocationReturn;
    }

    public void setDateLocationReturn(Date dateLocationReturn) {
        this.dateLocationReturn = dateLocationReturn;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
