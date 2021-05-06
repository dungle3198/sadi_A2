package com.example.sadi_A2.controller;

import com.example.sadi_A2.model.Staff;
import com.example.sadi_A2.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class StaffController {
    @Autowired
    StaffService staffService;

    @RequestMapping(path = "/staffs", method = RequestMethod.GET)
    public List<Staff> getAllStaffs(){
        return staffService.getAllStaffs();
    }

    @RequestMapping(path = "/staffs", method = RequestMethod.POST)
    public void addStaff(@RequestBody Staff staff){
        staffService.addStaff(staff);
    }

    @RequestMapping(path = "/staffs", method = RequestMethod.PUT)
    public void updateStaff(@RequestBody Staff staff){
        staffService.updateStaff(staff);
    }

    @RequestMapping(path = "/staffs", method = RequestMethod.DELETE)
    public void deleteStaff(@RequestBody Staff staff){
        staffService.deleteStaff(staff);
    }
}
