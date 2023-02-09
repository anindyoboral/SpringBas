package be.abis.exercise;

import be.abis.exercise.service.AbisTrainingService;
import be.abis.exercise.service.CourseService;
import be.abis.exercise.service.PersonService;
import be.abis.exercise.service.TrainingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Exercise31Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercise31Application.class, args);
    }

    @Bean
    public TrainingService trainingService(PersonService ps, @Qualifier("abis") CourseService cs){
        AbisTrainingService ts = new AbisTrainingService();
        ts.setCourseService(cs);
        ts.setPersonService(ps);
        return ts;
    }

}
