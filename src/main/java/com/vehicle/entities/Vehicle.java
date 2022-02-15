package com.vehicle.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "vehicle")
public class Vehicle {
    @Id
    private String registerationNumber;

    @Version
    private long version;

    @ManyToMany
    private Set<Owner> owners = new HashSet<>();

}
