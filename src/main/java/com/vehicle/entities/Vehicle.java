package com.vehicle.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Data
@EqualsAndHashCode
@NoArgsConstructor
@Entity(name = "vehicle")
public class Vehicle {
    @Id
    private String registerationNumber;

    @Version
    private long version;

    @ManyToMany
    @EqualsAndHashCode.Exclude
    private Set<Owner> owners = new HashSet<>();

}
