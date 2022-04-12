package br.tdd.udemy.services;

import br.tdd.udemy.entities.Location;
import br.tdd.udemy.entities.Movie;
import br.tdd.udemy.entities.User;

import java.util.Date;

import static br.tdd.udemy.utils.DataUtils.adicionarDias;

public class LocationService {
    public Location rentMovie(User user, Movie movie) {
        Location location = new Location();
        location.setMovie(movie);
        location.setUser(user);
        location.setDateLocation(new Date());
        location.setValue(movie.getLocationPrice());

        Date deliveryDate = new Date();
        deliveryDate = adicionarDias(deliveryDate, 1);
        location.setDateLocationReturn(deliveryDate);
        return location;
    }
}
