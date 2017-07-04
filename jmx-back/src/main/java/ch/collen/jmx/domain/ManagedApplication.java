package ch.collen.jmx.domain;

import org.springframework.data.annotation.Id;

import java.util.Set;

/**
 * Created by cyril on 30/06/17.
 */

public class ManagedApplication {

    @Id
    private String name;

    private String group;

    private Set<Remote> remotes;

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public Set<Remote> getRemotes() {
        return remotes;
    }
}
