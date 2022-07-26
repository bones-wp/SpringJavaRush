package test.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.entities.Cat;
import test.entities.Dog;
import test.entities.Parrot;

@Configuration
public class MyConfig {
     @Bean
    public Cat getCat() {
         return new Cat();
     }

    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean ("parrot-kesha")
    public Parrot getParrot() {
        return new Parrot();
    }


}
