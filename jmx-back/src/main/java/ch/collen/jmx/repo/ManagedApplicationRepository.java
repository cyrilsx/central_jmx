package ch.collen.jmx.repo;

import ch.collen.jmx.domain.ManagedApplication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cyril on 02/07/17.
 */
public interface ManagedApplicationRepository extends MongoRepository<ManagedApplication, String> {
}
