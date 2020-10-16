package com.hendisantika.webfluxthymeleafreactive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : webflux-thymeleaf-reactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/10/20
 * Time: 05.53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private String name;
    private Integer score;
}
