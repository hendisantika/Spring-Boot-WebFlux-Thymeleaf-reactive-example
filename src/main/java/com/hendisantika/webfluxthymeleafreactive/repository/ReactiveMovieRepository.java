package com.hendisantika.webfluxthymeleafreactive.repository;

import com.hendisantika.webfluxthymeleafreactive.entity.Movie;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : webflux-thymeleaf-reactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/10/20
 * Time: 05.55
 */
@Repository
public class ReactiveMovieRepository implements MovieRepository {

    private static final List<Movie> movie = new ArrayList<>();

    static {
        movie.add(new Movie("IP MAN (2019)", 64));
        movie.add(new Movie("Iron Man (2008)", 79));
        movie.add(new Movie("The Shawshank Redemption (1994)", 93));
        movie.add(new Movie("Forrest Gump (1994)", 83));
        movie.add(new Movie("Glass (2019)", 70));
    }

    @Override
    public Flux<Movie> findAll() {
        //simulate stream data with 2 seconds delay.
        return Flux.fromIterable(movie).delayElements(Duration.ofSeconds(2));
    }
}
