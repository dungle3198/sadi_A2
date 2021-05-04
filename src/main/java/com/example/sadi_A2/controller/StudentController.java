package com.example.sadi_A2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sadi_A2.model.Student;
import com.example.sadi_A2.service.*;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	
	
}
