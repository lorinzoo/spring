package com.example.foyer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idFoyer;
    String nomFoyer;
    long capaciteFoyer;
    @OneToOne (mappedBy = "foyers")
    @JsonIgnore
    Universite universite;
    @OneToMany(mappedBy = "foyer",cascade =CascadeType.ALL)
    Set<Bloc> blocs;

}
