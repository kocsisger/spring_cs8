package hu.unideb.inf.SpringDataFX;

import hu.unideb.inf.SpringDataFX.model.Person;
import hu.unideb.inf.SpringDataFX.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataFxApplication implements CommandLineRunner {
	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataFxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person p = new Person();
		p.setName("Jóska");
		p.setDateOfBirth(LocalDate.of(2017,11,6));

		Person p2 = Person.builder()
				.name("Mária")
				.dateOfBirth(LocalDate.of(2017,3,12))
				.build();

		personRepository.save(p);
		personRepository.save(p2);
	}

	public void print(){
		for (Person p : personRepository.findAll()){
			System.out.println(p);
		}
	}
}
