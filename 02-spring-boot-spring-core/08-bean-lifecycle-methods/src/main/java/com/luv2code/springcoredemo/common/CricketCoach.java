package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach { //Bunu bir koç türü yaptık.

    public CricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    // define our init method
    @PostConstruct
    public void doMyStuff(){
        System.out.println("In doMyStuff(): "+ getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff(): "+ getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkuout() {
        return "20 mekik cek!!";
    }
}
