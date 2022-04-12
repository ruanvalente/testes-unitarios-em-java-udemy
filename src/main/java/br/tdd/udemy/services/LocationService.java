package br.tdd.udemy.services;

import br.tdd.udemy.entities.Location;
import br.tdd.udemy.entities.Movie;
import br.tdd.udemy.entities.User;

import java.rmi.server.ExportException;
import java.util.Date;
import java.util.Objects;

import static br.tdd.udemy.utils.DataUtils.adicionarDias;

public class LocationService {
    public Location rentMovie(User user, Movie movie) throws ExportException {

        if (Objects.equals(movie.getStock(), 0)) {
            throw new ExportException("Filme sem estoque no momento");
        }
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
