package br.tdd.udemy.services;

import br.tdd.udemy.entities.Location;
import br.tdd.udemy.entities.Movie;
import br.tdd.udemy.entities.User;

import static br.tdd.udemy.utils.DataUtils.adicionarDias;

import java.util.Date;

public class LocationService {
    public Location rentMovie (User user, Movie movie) {
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

    public static void main(String[] args) {
        // scenery
        // TODO iniciar os objetos para o cenário correspondente ao teste
        LocationService locationService = new LocationService();
        User user = new User("Ruan Valente");
        Movie movie = new Movie("Matrix", 2, 150.90);

        // action
        // TODO iniciar a ação que deve ser tomada dentro do cenário especificado do teste
        Location location = locationService.rentMovie(user, movie);

        // verification
        // TODO realizar a verificação referente ao resultado esperado dado o cenário + ação descritas para o teste
        System.out.println(location.getValue());
        System.out.println(location.getDateLocation());
        System.out.println(location.getDateLocationReturn());
    }
}
