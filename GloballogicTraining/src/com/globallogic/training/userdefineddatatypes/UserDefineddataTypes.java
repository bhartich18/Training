package com.globallogic.training.userdefineddatatypes;
import java.util.Scanner;

//Enum as a user defined datatype
enum Gender{
	MALE,
	FEMALE,
	OTHER
}

//Class as a user defined datatype
class Student{
	String name;
	Gender gender;
	Student(){
		
	}
	Student(String name, Gender gender){
		this.name=name;
		this.gender=gender;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + "]";
	}
}

public class UserDefineddataTypes {
	public static void main(String[] args) {
		//Array as a user defined datatype
		Student[] batch = new Student[10];
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter 10 students' name and gender");
//		System.out.println("NOTE: Enter Male, Female or Others");
//		for(int i=0 ; i<10 ; i++) {
//			String name = scanner.next();
//			Gender gender;
//			char g = scanner.next().charAt(0);
//			switch(g) {
//				case 'M':
//				case 'm':
//					gender=Gender.MALE;
//					break;
//				case 'F':
//				case 'f':
//					gender=Gender.FEMALE;
//					break;
//				case 'O':
//				case 'o':
//					gender=Gender.OTHER;
//					break;
//				default:
//					System.out.println("Wrong Data, Enter once again");
//					i--;
//					continue;
//			}
//			Student student = new Student();
//			student.gender=gender;
//			student.name=name;
//			batch[i]=student;
//		}
//		scanner.close();

		batch[0] = new Student("Aakriti", Gender.FEMALE);
		batch[1] = new Student("Abhishek", Gender.MALE);
		batch[2] = new Student("Agam", Gender.MALE);
		batch[3] = new Student("Aishwarya", Gender.FEMALE);
		batch[4] = new Student("Akash K", Gender.MALE);
		batch[5] = new Student("Akash P", Gender.MALE);
		batch[6] = new Student("Akshay", Gender.MALE);
		batch[7] = new Student("Amerendra", Gender.MALE);
		batch[8] = new Student("Ashutosh", Gender.MALE);
		batch[9] = new Student("Bharti", Gender.FEMALE);
		for(Student student: batch)
			System.out.println(student.toString());
		
	}
}