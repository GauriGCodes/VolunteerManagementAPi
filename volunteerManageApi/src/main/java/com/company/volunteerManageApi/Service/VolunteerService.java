package com.company.volunteerManageApi.Service;

import com.company.volunteerManageApi.Model.Volunteer;
import com.company.volunteerManageApi.Repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface VolunteerService {

    public List<Volunteer> getAllVolunteer();
    public Volunteer getVolunteerById(Long id);
    public Volunteer addVolunteer(Volunteer volunteer);
    public Volunteer updateVolunteer(Long id,Volunteer volunteer);
    public Volunteer deleteVolunteer(Long id);

    public List<Volunteer> getVolunteerByInterest(String interest);

}
