package br.tdd.udemy.services;

import br.tdd.udemy.entities.Location;
import br.tdd.udemy.entities.Movie;
import br.tdd.udemy.entities.User;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import java.util.Date;

import static br.tdd.udemy.utils.DataUtils.isMesmaData;
import static br.tdd.udemy.utils.DataUtils.obterDataComDiferencaDias;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class LocationServiceTest {
    @Rule
    public ErrorCollector error = new ErrorCollector();

    @Test
    public void test() {
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
        error.checkThat(location.getValue(), is(equalTo(150.90)));
        error.checkThat(isMesmaData(location.getDateLocation(), new Date()), is(true));
        error.checkThat(isMesmaData(location.getDateLocationReturn(), obterDataComDiferencaDias(1)), is(true));
    }
}
