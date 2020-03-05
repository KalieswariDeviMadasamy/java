package io.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExercise {
	
	public static void main(String[] args) {
		List<Student> myList = Arrays.asList(
					new Student("Kalieswari", "Madasamy", 15),
					new Student("Swathi", "Bhaskar", 14),
					new Student("Jegadesan", "Senthilkumar", 15)
				);
		
		LambdaExercise le = new LambdaExercise();
		
		
		Collections.sort(myList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {		
				return s1.getFirstName().compareTo(s2.getFirstName());
			}
		});
		
		
		le.printAll(myList);
		
		
		le.printCondition(myList, new Condition() {

			@Override
			public boolean test(Student s) {
				return s.getLastName().startsWith("c");
			}
			
		});
	}

	public void printAll(List<Student> myList) {
		for (Student s : myList) {
			System.out.println(s);
		} 
	}
	
	public void printCondition(List<Student> myList, Condition condition) {
		for (Student s : myList) {
			if(condition.test(s))
				System.out.println(s);
		} 
	}
	
	interface Condition {
		boolean test(Student s);
	}

}
