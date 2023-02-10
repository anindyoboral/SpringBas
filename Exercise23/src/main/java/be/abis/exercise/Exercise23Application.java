package be.abis.exercise;

import be.abis.exercise.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Exercise23Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercise23Application.class, args);
    }

    @Bean
    public TrainingService abisTrainingService(PersonService ps, CourseService cs){
        AbisTrainingService ts = new AbisTrainingService();
        ts.setCourseService(cs);
        ts.setPersonService(ps);
        return ts;
    }

}
