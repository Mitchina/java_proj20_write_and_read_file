package pkg2_read_file;

import java.util.ArrayList;

public class Anagrafica {
	String name;
	String surname;
	String age;
	
	static ArrayList<Anagrafica> instances = new ArrayList<>();
	
	public Anagrafica(String name, String surname, String age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		instances.add(this);
	}
		
	public static ArrayList<Anagrafica> getInstances() {
		return instances;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Anagrafica [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}
}
