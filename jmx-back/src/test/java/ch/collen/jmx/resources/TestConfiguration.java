package ch.collen.jmx.resources;

import com.mongodb.Mongo;
import de.flapdoodle.embed.mongo.MongodStarter;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by cyril on 03/07/17.
 */
@SpringBootConfiguration
public class TestConfiguration {


    @Bean
    public MongodStarter mongodStarter() {
        return MongodStarter.getDefaultInstance();
    }

    @Bean
    public MongoTemplate mongoTemplate(Mongo mongo) {
        return new MongoTemplate(mongo, "jmx");
    }

}
