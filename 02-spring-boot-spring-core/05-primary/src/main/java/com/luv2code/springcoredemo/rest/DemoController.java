package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController { // Bağımlılığı kullanan sınıf

    // Define a private field for the dependency

    private Coach myCoach;
    private Coach myOtherCoach;

    // Define a setter for dependency injection

    @Autowired
    public void DemoController(Coach theCoach) {
        myCoach = theCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkuout();
    }
}



