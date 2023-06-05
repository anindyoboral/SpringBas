package be.abis.exercise.service;

import be.abis.exercise.exception.EnrollException;
import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AbisTrainingService implements TrainingService {

    private String welcomeMessage;

    @Autowired public PersonService personService;
    private CourseService courseService;

    @Autowired
    public AbisTrainingService(CourseService courseService) {
        this.courseService = courseService;
    }

    @Override
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    @Value("Welcome to the Abis Training Service")
    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public PersonService getPersonService() {
        return personService;
    }

    public CourseService getCourseService() {
        return courseService;
    }

    @Override
    public List<Course> showFollowedCourses(Person person) {
        return null;
    }

    @Override
    public void enrollForSession(Person person, Course course, LocalDate date) throws EnrollException {

    }
}
