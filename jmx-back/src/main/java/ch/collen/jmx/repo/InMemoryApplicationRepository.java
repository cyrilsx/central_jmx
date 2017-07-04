package ch.collen.jmx.repo;

import ch.collen.jmx.domain.ManagedApplication;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created by cyril on 04/07/17.
 */
@Repository
public class InMemoryApplicationRepository {

    private final Map<String, ManagedApplication> applications = new ConcurrentHashMap<>();



    public List<ManagedApplication> findAll() {
        return new ArrayList<>(applications.values());
    }

    public ManagedApplication findOne(String key) {
        return applications.get(key);
    }

    public void save(ManagedApplication managedApplication) {
        applications.put(managedApplication.getName(), managedApplication);
    }

    public void delete(String key) {
        applications.remove(key);
    }
}
