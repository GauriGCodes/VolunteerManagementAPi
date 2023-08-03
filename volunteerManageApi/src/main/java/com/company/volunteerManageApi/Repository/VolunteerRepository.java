package com.company.volunteerManageApi.Repository;

import com.company.volunteerManageApi.Model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer,Long>{


    @Query(value = "SELECT * FROM Volunteers v WHERE ?1 in (v.interest)", nativeQuery = true)
    Collection<Volunteer> getVolunteerByInterest(String interest);

}