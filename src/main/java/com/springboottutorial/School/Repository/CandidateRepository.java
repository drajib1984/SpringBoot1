package com.springboottutorial.School.Repository;

import com.springboottutorial.School.Entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Long> {
    public Candidate findByFirstName(String studentName);
    public List<Candidate> findCandidateByLastNameContainingIgnoreCase(String lastName);
    public List<Candidate> findByGuardianNameContainingIgnoreCase(String firstName);
    public Candidate findCandidateByFirstNameAndAndLastName(String firstName,String lastName);
}
