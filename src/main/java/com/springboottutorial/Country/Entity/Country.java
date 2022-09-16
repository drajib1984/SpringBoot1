package com.springboottutorial.Country.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "country_table")
public class Country {
    @Id
    @SequenceGenerator(name = "country_sequence",sequenceName = "country_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="country_sequence" )
    @Column(name = "country_id")
     private int countryId;
    @Column(name = "country_name", nullable = false)
     private String countryName;
    @Column(name = "country_capital", nullable = false)
     private String countryCapital;
}
