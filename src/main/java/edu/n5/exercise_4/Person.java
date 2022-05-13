package edu.n5.exercise_4;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 4236621737041330656L;
	private String name;
	private String lastName;
	private String dni;

	public Person(String name, String lastName, String dni) {
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
	}

	public Person() {
		String[] personData = requestPersonData();
		name = personData[0];
		lastName = personData[1];
		dni = personData[2];
	}

	private String[] requestPersonData() {
		String[] personData = new String[3];
		personData[0] = Input.readString("Introdueix el nom: ");
		personData[1] = Input.readString("Introdueix els cognoms: ");
		personData[2] = Input.readString("Introdueix el DNI: ");
		return personData;
	}

	public String getCsvLine() {
		return name + ";" + lastName + ";" + dni + ";";
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {

		return String.format("%-12s", name) + String.format("%-20s", lastName) + String.format("%-16s", dni);
	}

}
