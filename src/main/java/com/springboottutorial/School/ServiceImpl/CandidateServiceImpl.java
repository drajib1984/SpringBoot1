package com.springboottutorial.School.ServiceImpl;

import com.springboottutorial.School.Entity.Candidate;
import com.springboottutorial.School.Repository.CandidateRepository;
import com.springboottutorial.School.Service.CandidateService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@AllArgsConstructor
@Service
public class CandidateServiceImpl implements CandidateService {
    private CandidateRepository candidateRepository;

    @Override
    public Candidate saveCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    public List<Candidate> getAllCandidate() {
        return candidateRepository.findAll();
    }

    @Override
    public Candidate findByFirstName(String firstName) {
        return candidateRepository.findByFirstName(firstName);
    }

    @Override
    public List<Candidate> findCandidateByLastNameContainingIgnoreCase(String lastName) {
        return candidateRepository.findCandidateByLastNameContainingIgnoreCase(lastName);
    }

    @Override
    public List<Candidate> findByGuardianNameContainingIgnoreCase(String guardianName) {
        return candidateRepository.findByGuardianNameContainingIgnoreCase(guardianName);
    }

    @Override
    public Candidate findCandidateByFirstNameAndAndLastName(String firstName, String lastName) {
        return candidateRepository.findCandidateByFirstNameAndAndLastName(firstName,lastName);
    }
}
