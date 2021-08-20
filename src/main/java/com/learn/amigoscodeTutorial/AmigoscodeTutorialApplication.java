package com.learn.amigoscodeTutorial;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.learn.amigoscodeTutorial.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AmigoscodeTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigoscodeTutorialApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(
			new Student(
				1L,
				"Alp",
				"alpa@mail.com",
				LocalDate.of(2000, Month.JANUARY, 5),
				21
			)
		);
	}

}
