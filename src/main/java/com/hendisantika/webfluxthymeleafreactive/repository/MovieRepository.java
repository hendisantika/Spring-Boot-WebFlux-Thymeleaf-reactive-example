package com.hendisantika.webfluxthymeleafreactive.repository;

import com.hendisantika.webfluxthymeleafreactive.entity.Movie;
import reactor.core.publisher.Flux;

/**
 * Created by IntelliJ IDEA.
 * Project : webflux-thymeleaf-reactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/10/20
 * Time: 05.54
 */
public interface MovieRepository {
    Flux<Movie> findAll();
}
