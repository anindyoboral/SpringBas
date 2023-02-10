package be.abis.exercise.controller;

import be.abis.exercise.model.Person;
import be.abis.exercise.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
     
	@Autowired
	TrainingService trainingService;

	Person loggedInPerson;

	@GetMapping("/")
	public String showLogin(Model model){
		Person p = new Person();
		model.addAttribute("person",p);
		return "login";
	}

	@PostMapping("/login")
	public String handleLogin(Model model, @ModelAttribute("person") Person person){
		loggedInPerson = trainingService.getPersonService().findPerson(person.getEmailAddress(),person.getPassword());
		System.out.println(loggedInPerson);
		return "redirect:/welcome";
	}

	@GetMapping("/welcome")
	public String welcomePerson(Model model){
		model.addAttribute("fullName",loggedInPerson.getFirstName()+" "+loggedInPerson.getLastName());

		String title = trainingService.getCourseService().findCourse(7900).getLongTitle();
		model.addAttribute("courseTitle", title);

		return "welcome";
	}

	@GetMapping("/logout")
	public String logout(){
		return "redirect:/";
	}

}
