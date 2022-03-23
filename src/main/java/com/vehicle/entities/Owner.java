package com.vehicle.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode
@Entity(name = "owner")
public class Owner {

    @Id
    private long phoneNumber;

    private String name;

    @Version
    private long version;


    @ManyToMany(mappedBy = "owners")
    @EqualsAndHashCode.Exclude
    private Set<Vehicle> vehicles = new HashSet<>();
}
