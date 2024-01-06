package com.goonok;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.goonok.beans.Student;
import com.goonok.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std = context.getBean("alamin", Student.class);
		System.out.println(std.getName());
		System.out.println(std.getEmail());
		System.out.println(std);
	}

}
