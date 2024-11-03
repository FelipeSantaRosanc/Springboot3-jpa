package com.educandoweb.Course.Config;

import com.educandoweb.Course.Entities.Order;
import com.educandoweb.Course.Entities.User;
import com.educandoweb.Course.Repositories.OrderRepositories;
import com.educandoweb.Course.Repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepositories userRepositories;

    @Autowired
    private OrderRepositories orderRepositories;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Maria Brown", "maria@gmail.com", "9887455", "123456789");
        User u2 =  new User(null,"Joao Brown", "joao@gmail.com", "7894534", "987456123");

        Order o1 = new Order(null, Instant.parse("2024-11-20t19:53:07Z"),u1);
        Order o2 = new Order(null, Instant.parse("2024-11-20t03:42:10Z"),u2);
        Order o3 = new Order(null, Instant.parse("2024-11-22t15:21:22Z"),u1);

        userRepositories.saveAll(Arrays.asList(u1,u2));
        orderRepositories.saveAll(Arrays.asList(o1,o2,o3));
    }
}
