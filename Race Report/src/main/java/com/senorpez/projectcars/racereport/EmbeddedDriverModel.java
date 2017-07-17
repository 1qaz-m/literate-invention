package com.senorpez.projectcars.racereport;

import org.springframework.hateoas.Identifiable;
import org.springframework.hateoas.core.Relation;

@Relation(value = "driver", collectionRelation = "driver")
public class EmbeddedDriverModel implements Identifiable<Integer> {
    private final int id;
    private final String name;

    EmbeddedDriverModel(final DriverModel driver) {
        this.id = driver.getId();
        this.name = driver.getName();
    }

    @Override
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
