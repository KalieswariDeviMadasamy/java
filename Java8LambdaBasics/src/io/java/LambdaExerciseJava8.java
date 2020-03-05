package io.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.java.LambdaExercise.Condition;

public class LambdaExerciseJava8 {
	
	public static void main(String[] args) {
		List<Student> myList = Arrays.asList(
					new Student("Kalieswari", "Madasamy", 15),
					new Student("Swathi", "Bhaskar", 14),
					new Student("Jegadesan", "Senthilkumar", 15)
				);
		
		LambdaExerciseJava8 le = new LambdaExerciseJava8();
		
		
		Collections.sort(myList, (s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()));
		
		
		le.printCondition(myList, p -> true, p -> System.out.println(p));
		
		
		le.printCondition(myList, s -> s.getLastName().startsWith("S"), p -> System.out.println(p.getFirstName()));
	}

	
	public void printCondition(List<Student> myList, Predicate<Student> predicate, Consumer<Student> consumer) {
		for (Student s : myList) {
			if(predicate.test(s))
				consumer.accept(s);
		} 
	}

}
