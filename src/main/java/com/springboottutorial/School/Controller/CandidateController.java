package com.springboottutorial.School.Controller;

import com.springboottutorial.School.Entity.Candidate;
import com.springboottutorial.School.Service.CandidateService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/api/candidate")
public class CandidateController {
    private CandidateService candidateService;
    @PostMapping("/save")
    public ResponseEntity<Candidate> saveCandidate(@RequestBody Candidate candidate){
        return new ResponseEntity<Candidate>(candidateService.saveCandidate(candidate), HttpStatus.CREATED);
    }
    @GetMapping("/get-all")
    public ResponseEntity<List<Candidate>>getAllCandidate(){
        return new ResponseEntity<List<Candidate>>(candidateService.getAllCandidate(),HttpStatus.OK);
    }
    @GetMapping("/get")
    public ResponseEntity<Candidate> findByFirstName(@RequestParam(name = "name") String firstName){
        return new ResponseEntity<Candidate>(candidateService.findByFirstName(firstName),HttpStatus.OK);
    }
    @GetMapping("/get/lastName")
    public ResponseEntity<List<Candidate>>findCandidateByLastNameContainingIgnoreCase
            (@RequestParam(name = "lastName") String lastname){
        return new ResponseEntity<List<Candidate>>
                (candidateService.findCandidateByLastNameContainingIgnoreCase(lastname),HttpStatus.OK);
    }
    @GetMapping("/get/guardianName")
    public ResponseEntity<List<Candidate>> findByGuardianNameContainingIgnoreCase
            (@RequestParam(name = "guardianName") String guardianName){
        return new ResponseEntity<List<Candidate>>(candidateService
                .findByGuardianNameContainingIgnoreCase(guardianName),HttpStatus.OK);
    }
    @GetMapping("/get/full-name")
    public ResponseEntity<Candidate>findCandidateByFirstNameAndAndLastName
            (@RequestParam(name = "firstName") String firstName,@RequestParam(name = "lastName") String lastName){
        return new ResponseEntity<Candidate>(candidateService
                .findCandidateByFirstNameAndAndLastName(firstName, lastName),HttpStatus.OK);
    }
}
