package com.company.volunteerManageApi.Controller;

import com.company.volunteerManageApi.Model.Volunteer;
import com.company.volunteerManageApi.Service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
public class VolunteerController {

    @Autowired
    private VolunteerService volunteerService;

    @GetMapping
    public List<Volunteer> getVolunteers(){
        return volunteerService.getAllVolunteer();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Volunteer> getVolunteerByInterest(@RequestParam(value="interest") String interest){
        return volunteerService.getVolunteerByInterest(interest);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Volunteer getVolunteerById(@PathVariable  Long id){
        return volunteerService.getVolunteerById(id);
    }



    @PostMapping
    public Volunteer createVolunteer(@RequestBody Volunteer volunteer){
            return volunteerService.addVolunteer(volunteer);
    }

    @PutMapping("/{id}")
    public Volunteer updateVolunteer(@PathVariable Long id,@RequestBody Volunteer volunteer){
        return volunteerService.updateVolunteer(id,volunteer);
    }

    @DeleteMapping("/{id}")
    public Volunteer deleteVolunteer(@PathVariable Long id){
        return volunteerService.deleteVolunteer(id);
    }
}
