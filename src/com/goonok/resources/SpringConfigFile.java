package com.goonok.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.goonok.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean("alamin")
	public Student student() {
		Student student = new Student();
		student.setName("Alamin");
		student.setRollno(2130);
		student.setEmail("alamin5g@gmail.com");
		return student;
	}
	
}
