package be.abis.exercise;

import be.abis.exercise.repository.CourseRepository;
import be.abis.exercise.repository.MemoryCourseRepository;
import be.abis.exercise.service.AbisCourseService;
import be.abis.exercise.service.CourseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Exercise12Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercise12Application.class, args);
    }

    @Bean
    public CourseRepository courseRepository(){
        return new MemoryCourseRepository();
    }

    @Bean
    public CourseService courseService(){
        AbisCourseService acs = new AbisCourseService();
        acs.setCourseRepository(courseRepository());
        return acs;
    }
}
