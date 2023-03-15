package com.EMS.employee_management_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/hii")
    public String hii(){
        return "working";
    }

//    	<dependency>
//			<groupId>org.springframework.boot</groupId>
//			<artifactId>spring-boot-starter-data-jpa</artifactId>
//		</dependency>
}
