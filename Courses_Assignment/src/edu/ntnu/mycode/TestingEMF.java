package edu.ntnu.mycode;

import Courses.Course;
import Courses.CoursesFactory;

public class TestingEMF {

	public static void main(String[] args) {
		// We get the FindException:
				// Module emf not found, required by Courses_Assignment
		// when running the code.
		Course course = CoursesFactory.eINSTANCE.createCourse();
		System.out.println("heisann "+ course.getLanguage());
	
	}

}
