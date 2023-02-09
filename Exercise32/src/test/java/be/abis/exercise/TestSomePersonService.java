package be.abis.exercise;

import be.abis.exercise.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@ActiveProfiles("dev")
public class TestSomePersonService {
	
	@Autowired
	PersonService personService;

	@Autowired
	ConfigurableEnvironment env;

	@Test
	public void person4ShouldBeCalledSandy(){

	/*	AnnotationConfigApplicationContext ctx
				= new AnnotationConfigApplicationContext();
	//	ctx.refresh();
		env.setActiveProfiles("dev");
		System.out.println("profile now is " + env.getActiveProfiles()[0]);
		personService = ctx.getBean(PersonService.class);*/
		String firstName = personService.findPerson("sschillebeeckx@abis.be","abc123").getFirstName();
		assertEquals("Sandy",firstName);
	}


}
