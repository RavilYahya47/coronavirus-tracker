package com.ravilyahya.coronavirustracker;

import com.ravilyahya.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

@SpringBootApplication
@EnableScheduling
public class CoronavirusTrackerApplication {

    public static void main(String[] args)  {
        SpringApplication.run(CoronavirusTrackerApplication.class, args);
    }

}
