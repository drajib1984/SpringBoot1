package com.springboottutorial.School.Service;

import com.springboottutorial.School.Entity.Candidate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CandidateService {
    public Candidate saveCandidate(Candidate candidate);
    public List<Candidate> getAllCandidate();
    public Candidate findByFirstName(String firstName);
    public List<Candidate> findCandidateByLastNameContainingIgnoreCase(String lastName);
    public List<Candidate> findByGuardianNameContainingIgnoreCase(String guardianName);
    public Candidate findCandidateByFirstNameAndAndLastName(String firstName,String lastName);
}
