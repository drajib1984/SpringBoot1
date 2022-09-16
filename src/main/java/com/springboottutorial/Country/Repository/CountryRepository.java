package com.springboottutorial.Country.Repository;

import com.springboottutorial.Country.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {
    List<Country> findByCountryName(String countryName);
    List<Country> findByCountryCapital(String countryCapital);
}
