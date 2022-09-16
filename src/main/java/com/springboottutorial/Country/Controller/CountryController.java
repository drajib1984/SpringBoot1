package com.springboottutorial.Country.Controller;

import com.springboottutorial.Country.Entity.Country;
import com.springboottutorial.Country.Service.CountryService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@Data
@RequestMapping("/api")
public class CountryController {
    private CountryService countryService;
    @PostMapping("/add")
    public ResponseEntity<Country> addNewCountry(@RequestBody Country country){
        return new ResponseEntity<Country>(countryService.addNewCountry(country), HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Country>> getAllCountries() {
        return new ResponseEntity<List<Country>>(countryService.getAllCountries(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<Country>> getCountryById(@PathVariable("id") int countryId) {
        return new ResponseEntity<Optional<Country>>(countryService.getCountryById(countryId), HttpStatus.OK);
    }

    @GetMapping("/get/countryName")
    public ResponseEntity<List<Country>> getCountryByName
            (@RequestParam(name = "country",required = false) String countryName){
     return new ResponseEntity<List<Country>>(countryService.getCountryByName(countryName),HttpStatus.OK);
    }

    @GetMapping("/get/countryCapital")
    public ResponseEntity<List<Country>> findByCountryCapital
            (@RequestParam("capital") String countryCapital){
        return new ResponseEntity<List<Country>>(countryService.findByCountryCapital(countryCapital),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Country> updateCountry(@RequestBody Country country){
        return new ResponseEntity<Country>(countryService.updateCountry(country),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCountrybyId(@PathVariable("id") int countryId){
        countryService.deleteCountryById(countryId);
        return new ResponseEntity<String>("Country Data deleted successfully",HttpStatus.OK);
    }

}
