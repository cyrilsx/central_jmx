package ch.collen.jmx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by cyril on 29/06/17.
 */
@SpringBootApplication(scanBasePackages= "ch.collen.jmx")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
