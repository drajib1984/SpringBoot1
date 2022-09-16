package com.springboottutorial.Country.Service;

import com.springboottutorial.Country.Entity.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    public Country addNewCountry(Country country);

    public List<Country> getAllCountries();

    public Optional<Country> getCountryById(int countryId);

    public List<Country> getCountryByName(String countryName);

    public List<Country> findByCountryCapital(String countryCapital);

    public Country updateCountry(Country country);

    public void deleteCountryById(int countryId);
}
