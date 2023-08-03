package com.company.volunteerManageApi.Service;

import com.company.volunteerManageApi.Model.Volunteer;
import com.company.volunteerManageApi.Repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class VolunteerServiceImpl implements VolunteerService{

    @Autowired
    private VolunteerRepository volunteerRepository;

    @Override
    public List<Volunteer> getAllVolunteer() {
       List<Volunteer> volunteerList = volunteerRepository.findAll();
       return volunteerList;
    }

    @Override
     public Volunteer getVolunteerById(Long id){
        return volunteerRepository.findById(id).orElseThrow(RuntimeException::new);
   }


    @Override
    public Volunteer addVolunteer(Volunteer volunteer) {
            return volunteerRepository.save(volunteer);
    }

    @Override
    public Volunteer updateVolunteer(Long id, Volunteer volunteer) {
          Volunteer update_volunteer =  volunteerRepository.findById(id).orElseThrow(RuntimeException::new);
          update_volunteer.setAge(volunteer.getAge());
          update_volunteer.setCity(volunteer.getCity());
          update_volunteer.setCompany(volunteer.getCompany());
          update_volunteer.setFirstName(volunteer.getFirstName());
          update_volunteer.setLastName(volunteer.getLastName());
          update_volunteer.setInterest(volunteer.getInterest());
          update_volunteer.setLanguages(volunteer.getLanguages());
          update_volunteer.setProfessional_experience(volunteer.getProfessional_experience());
          update_volunteer.setCompany(volunteer.getCompany());
          return update_volunteer;
    }

    @Override
    public Volunteer deleteVolunteer(Long id) {
        Volunteer volunteer = volunteerRepository.findById(id).orElseThrow(RuntimeException::new);
         volunteerRepository.deleteById(id);
         return volunteer;
    }

    @Override
    public List<Volunteer> getVolunteerByInterest(String interest) {
        Collection<Volunteer> volunteerList = volunteerRepository.getVolunteerByInterest(interest);
        return volunteerList.stream().toList();
    }
}
