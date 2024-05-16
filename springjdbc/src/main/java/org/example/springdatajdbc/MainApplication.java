package org.example.springdatajdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);

    }
    @Bean
    CommandLineRunner demo(UserRepository  userRepository) {
        return args -> {
            //userRepository.save(new User("ffff", "asdf@123"));
//            List<User> list = (List<User>) userRepository.findAll();
//            list.forEach(System.out::println);
//
//            User user = userRepository.findById(25L).get();
//            System.out.println(user.getName());
//
//            User user1 = userRepository.findByName("john");
//            System.out.println(user1.getName());
            PageRequest pageRequest = PageRequest.of(1, 5);
            Page<User> allUsersWithPagination = userRepository.findAllUsersWithPagination(pageRequest);
            allUsersWithPagination.forEach(user -> System.out.println("name: "+user.getName()+" "+"email: "+user.getEmail()));
        };
    }
}
