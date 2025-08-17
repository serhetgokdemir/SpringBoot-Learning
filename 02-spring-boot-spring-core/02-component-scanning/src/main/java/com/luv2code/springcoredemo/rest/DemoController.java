package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController { // Bağımlılığı kullanan sınıf

    // Define a private field for the dependency

    private Coach myCoach;

    // Define a constructor for dependency injection

    @Autowired // diyoruz ki: “Spring, elinde bir Coach varsa buraya ver.”
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkuout();
    }
}
