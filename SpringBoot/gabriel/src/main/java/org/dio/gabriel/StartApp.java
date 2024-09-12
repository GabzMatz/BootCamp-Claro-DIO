package org.dio.gabriel;

import org.dio.gabriel.model.User;
import org.dio.gabriel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setNome("Gabriel Matos Antiqueira");
        user.setUsername("GabzMatz");
        user.setPassword("AmandaLinda123@");


        userRepository.save(user);


         for(User u: userRepository.findAll()){
             System.out.println(u);
         }
    }
}
