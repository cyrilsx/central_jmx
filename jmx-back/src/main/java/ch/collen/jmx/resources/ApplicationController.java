package ch.collen.jmx.resources;

import ch.collen.jmx.domain.ManagedApplication;
import ch.collen.jmx.repo.InMemoryApplicationRepository;
import ch.collen.jmx.repo.ManagedApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.OperationNotSupportedException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Created by cyril on 29/06/17.
 */
@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    private InMemoryApplicationRepository managedApplicationRepository;


    @RequestMapping(method = RequestMethod.GET)
    public List<ManagedApplication> list() {
        return managedApplicationRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void createUpdateApplication(ManagedApplication managedApplication) {
        managedApplicationRepository.save(managedApplication);
    }

    @RequestMapping(value = "/:name", method = RequestMethod.DELETE)
    public ManagedApplication delete(@PathVariable("name") String appName) {
        ManagedApplication managedApplication = managedApplicationRepository.findOne(appName);
        if (Objects.nonNull(managedApplication)) {
            managedApplicationRepository.delete(managedApplication.getName());
        }
        return managedApplication;
    }



}
