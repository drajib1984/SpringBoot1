package com.springboottutorial;

import com.springboottutorial.Country.Entity.Country;
import com.springboottutorial.Country.Repository.CountryRepository;
import com.springboottutorial.Country.Service.CountryService;
import com.springboottutorial.Country.ServiceImpl.CountryServiceImpl;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = CountryServiceMockitoTest.class)
public class CountryServiceMockitoTest {
    @Mock
    CountryRepository countryRepository;
    @InjectMocks
    CountryServiceImpl countryService;


    @Test
    @Order(1)
    public void test_getAllCountries(){
        List<Country>myCountryList= Arrays.asList(new Country(101,"India","Delhi"),
                new Country(102,"Nepal","Kathmundu"),
                new Country(103,"Sri Lanka","Colombo"));
        Mockito.when(countryRepository.findAll()).thenReturn(myCountryList);
        assertEquals(3,countryService.getAllCountries().size());
    }

    @Test
    @Order(2)
    public void test_getCountryById(){
       Optional<Country> myCountryList;
        myCountryList = Optional.of(new Country(105,"Japan","Tokyo"));
        Mockito.when(countryRepository.findById(105)).thenReturn(myCountryList);
        int countryId=105;
        Optional<Country> countryById = countryService.getCountryById(105);
        assertEquals(countryId,countryById.get().getCountryId());


    }
}
