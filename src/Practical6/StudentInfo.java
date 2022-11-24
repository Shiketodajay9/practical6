package test7;

import java.util.ArrayList;
import java.util.List;

public class Student_Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student>data=new ArrayList<>();//creating list of Student data
//add data
data.add(new Student(101,"John",20,65));
data.add(new Student(102,"Saniya",19,50));
data.add(new Student(103,"Nisha",21,75));
data.add(new Student(104,"Ruchi",20,70));
data.add(new Student(105,"Veer",19,90));
//print marks
System.out.println("Print all Students Marks");
data.stream().forEach(s->System.out.println(s.getName()+" "+s.getMarks()));
//add condition for result using stream() & print it
System.out.println("Print Students marks whos marks between 60 to 80");
data.stream().filter(s->s.getMarks()<80 && s.getMarks()>60).forEach(s->System.out.println(s.getName()+" "+s.getMarks()));
	}

}
//creating student class
class Student
{
	//declare there private data member
private int id;
private String name;
private int age;
private int marks;
//getter setter method
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
//declaring constuctor with fields
public Student(int id, String name, int age, int marks) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.marks = marks;
}


}