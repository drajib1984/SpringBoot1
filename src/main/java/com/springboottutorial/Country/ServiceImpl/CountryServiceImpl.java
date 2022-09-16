package com.springboottutorial.Country.ServiceImpl;

import com.springboottutorial.Country.Entity.Country;
import com.springboottutorial.Country.Repository.CountryRepository;
import com.springboottutorial.Country.Service.CountryService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {
    private CountryRepository countryRepository;
    @Override
    public Country addNewCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> getCountryById(int countryId) {
        return countryRepository.findById(countryId);
    }

    @Override
    public List<Country> getCountryByName(String countryName) {
        return countryRepository.findByCountryName(countryName);
    }

    @Override
    public List<Country> findByCountryCapital(String countryCapital) {
        return countryRepository.findByCountryCapital(countryCapital);
    }

    @Override
    public Country updateCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public void deleteCountryById(int countryId) {
      countryRepository.deleteById(countryId);
    }




}
